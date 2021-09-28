/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 25
 *  Copyright 2021 Chase Cutshall
 */
import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
public class ex25 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String password;
        System.out.print("What is the password ? ");

        password = input.next();

        passwordValidator(password);
    }
    public static String passwordValidator(String password){
        int n = password.length();
        boolean hasLower = false, hasUpper = false,
                hasDigit = false, specialChar = false;
        Set<Character> set = new HashSet<Character>(
                Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                        '*', '(', ')', '-', '+'));
        for (char i : password.toCharArray())
        {
            if (Character.isLowerCase(i))
                hasLower = true;
            if (Character.isUpperCase(i))
                hasUpper = true;
            if (Character.isDigit(i))
                hasDigit = true;
            if (set.contains(i))
                specialChar = true;
        }
        if (hasDigit && hasLower || hasUpper && specialChar
                && (n >= 8))
            System.out.println("Very Strong");
        else if ((hasLower || hasUpper || specialChar) && hasDigit
                && (n >= 8))
            System.out.println("Strong");
        else if(hasLower || hasUpper && (n < 8))
            System.out.print("Weak");
        else
            System.out.print("Very Weak");
        return password;
    }

}
