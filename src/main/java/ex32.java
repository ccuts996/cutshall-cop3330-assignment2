/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 32
 *  Copyright 2021 Chase Cutshall
 */

import java.util.Scanner;
public class ex32 {
    public static void main(String[] args) {

        System.out.println("Let's play Guess the Number!");
        int secretNumber;
        secretNumber = (int) (Math.random() * 999 + 1);
        Scanner input = new Scanner(System.in);
        int guess, total = 0, key;

        while (true) {

            System.out.print("Enter difficulty level (1,2 or 3) : ");
            String input1 = input.next();

            if (isNumeric(input1)) {
                key = Integer.parseInt(input1);
                break;
            } else {
                System.out.println("Invalid input");
            }
        }
        while (true) {

            total = 0;

            if (key == 1)
                secretNumber = (int) (Math.random() * 10 + 1);
            else if (key == 2)
                secretNumber = (int) (Math.random() * 100 + 1);
            else
                secretNumber = (int) (Math.random() * 1000 + 1);

            do {
            while (true) {
                System.out.print("I have my number. What's your guess?: ");
                String input2 = input.next();
                if (isNumeric(input2)) {
                    guess = Integer.parseInt(input2);

                    break;
                }
                else{
                    System.out.println("Invalid input");
                    total++;
                }
            }


                total++;
                if (guess == secretNumber) {
                    System.out.println("You got it in " + total + " guesses!");
                } else if (guess < secretNumber)
                    System.out.println("Too low. Guess again: ");
                else if (guess > secretNumber)
                    System.out.println("Too high. Guess again: ");

            } while (guess != secretNumber);

            System.out.print("\nDo you wish to play again (Y/N)?  ");
            char s = input.next().charAt(0);
            if (s == 'N' || s == 'n')
                break;

        }


    }
        public static boolean isNumeric(String input) {

            try {
                Integer.parseInt(input);
            }catch(Exception e) {
                return false;
            }
            return true;
        }

    }

