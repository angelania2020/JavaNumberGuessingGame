/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Angelina
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        String repeat = "";
                
        do{
        int num = random.nextInt(5-0+1)+0;
        
        System.out.println("Guess the number from 0 to 5: ");
        Scanner scanner = new Scanner(System.in);
        int attempt = 0;
        int userNum;

        do{
        userNum = scanner.nextInt();
        if (num == userNum) {
            System.out.println("You've guessed it! Yay! :)");
            break;
        }else{
            if(attempt<2) {
                System.out.println("Wrong. try again.");
            }else{
                System.out.println("Wrong number. You've lost. :( Guessed number: " + num);
            }
        }
        attempt++;
        }while(attempt < 3);
        System.out.println("-----------------------------");
        System.out.printf("Press \"n\" to end the game,%npress any other button to continue: ");
        scanner.nextLine(); //Надо опустошить предыдущее внесённое число, иначе сам продолжит дальше
        repeat = scanner.nextLine();
        if(repeat.equals("n")) { //Лучше в фигурных скобках писать, чем в одну строчку
            break;
        }
        System.out.println("");
    }while (true);
}
}