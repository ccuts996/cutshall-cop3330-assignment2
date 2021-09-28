/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 3
 *  Copyright 2021 Chase Cutshall
 */

import java.util.Scanner;
public class ex31 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int restingPulse;
        int age;

        while(true) {

            System.out.print("Enter Resting Pulse : ");
            String input1 = input.next();

            if(isNumeric(input1)) {
                restingPulse = Integer.parseInt(input1);
                break;
            }else {
                System.out.println("Invalid Pulse");
            }
        }

        while(true) {
            System.out.print("Enter Age : ");
            String input2 = input.next();

            if(isNumeric(input2)) {
                age = Integer.parseInt(input2);
                break;
            }else {
                System.out.println("Invalid Age");
            }
        }
        System.out.println("Intensity\tRate");
        for(int intensity = 55 ; intensity <= 95 ; intensity += 5) {
            int rate = ((220 - age - restingPulse) * intensity/100) + restingPulse;
            System.out.println(intensity+"%\t\t\t"+rate+" bpm");
        }

        input.close();

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


