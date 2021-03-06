/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 27
 *  Copyright 2021 Chase Cutshall
 */

import java.util.Scanner;
import java.util.regex.Pattern;
public class ex27 {

    static String data ="";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter the last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter the ZIP code: ");
        String zip = input.nextLine();

        System.out.print("Enter the employee ID: ");
        String ID = input.nextLine();

        validateInput(firstName, lastName, zip, ID);
    }
    public static void validateInput(String firstName, String lastName, String zip, String ID) {
        boolean first = validateFirstName(firstName);
        boolean last = validateLastName(lastName);
        boolean idFlag = validateID(ID);
        boolean zipFlag = validateZipCode(zip);
        if (first && last && zipFlag && idFlag) {
            data = ("There were no errors found.");
        }
        System.out.print(data);
    }

        public static boolean validateFirstName(String firstName) {
            boolean status = true;

            if (firstName.length() < 2) {
                data = data + "The first name must be at least 2 characters long.\n";
                status = false;
            }
            if (firstName.isEmpty()) {
                data = data + "The first name must be filled in.\n";
                status = false;
            }
            return status;
        }

        public static boolean validateLastName(String lastName) {
            boolean status = true;

            if (lastName.length() < 2) {
                data = data + "The last name must be at least 2 characters long.\n";
                status = false;
            }
            if (lastName.isEmpty()) {
                data = data + "The last name must be filled in.\n";
                status = false;
            }
            return status;
        }

        public static boolean validateZipCode(String zip) {
            boolean status = true;
            try {
                int number = Integer.parseInt(zip);
                if (zip.length() != 5) {
                    data = data + "The zipcode must be a 5 digit number.\n";
                    status = false;
                }
            } catch (Exception e) {
                data = data + "The zipcode must be a 5 digit number.\n";
                status = false;
            }
            return status;
        }


        public static boolean validateID(String ID) {
            String pattern = "[a-zA-Z]{2}[-]{1}[0-9]{4}";// two letters, a hyphen, and four numbers.
            if (!Pattern.matches(pattern, ID)) {
                data = data + "The employee ID must be in the format of AA-1234.\n";
                return false;
            }
            return true;
        }
    }

