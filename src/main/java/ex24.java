/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 24
 *  Copyright 2021 Chase Cutshall
 */

import java.util.Arrays;
import java.util.Scanner;
public class ex24 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String input1;
        System.out.print("Enter the first string: ");

        input1 = input.next();

        String input2;
        System.out.print("Enter the second string: ");

        input2= input.next();

        if(isAnagram(input1, input2))
            System.out.print(input1 + " and " + input2 +" are anagrams");
        else
            System.out.print(input1 + " and " + input2 +" are not anagrams");
    }
    public static boolean isAnagram(String input1, String input2){
        if(input1.length() != input2.length()){
            return false;
        }
        else {
            char[] charArray1 = input1.toCharArray();
            char[] charArray2 = input2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            if (Arrays.equals(charArray1, charArray2)) {
                return true;
            } else {
                return false;
            }
        }
    }
}