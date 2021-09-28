 /*
  *  UCF COP3330 Fall 2021 Assignment 2 Solution 26
  *  Copyright 2021 Chase Cutshall
  */
import java.util.Scanner;
public class ex26 {
        public static int calculateMonthsUntilPaidOff(double a, double b, double c) {
            b = b / 365;
            return (int) Math.ceil((-1 / 30.0) * Math.log(1 + a / c * (1 - Math.pow(1 + b, 30))) / Math.log(1 + b));
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            String balance;
            System.out.print(" What is your balance? ");
            balance = input.next();
            double a = Double.parseDouble(balance);

            String apr;
            System.out.print(" What is the apr (as a percent)? ");
            apr = input.next();
            double b = Double.parseDouble(apr);
            b = b / 100;

            String payment;
            System.out.print(" What is the monthly payment you can make? ");
            payment = input.next();
            double c = Double.parseDouble(payment);

            int months = calculateMonthsUntilPaidOff(a, b, c);
            System.out.print("It will take " + months + " months to pay off this card.");
        }
    }

