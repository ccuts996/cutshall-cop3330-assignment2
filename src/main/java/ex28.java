/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 28
 *  Copyright 2021 Chase Cutshall
 */

import java.util.Scanner;
public class ex28 {
    public static void main(String[] args){
        int i,n=0, total= 0;

        for (i=0;i<5;i++)
        {
            System.out.print("Enter a number: ");
            Scanner in = new Scanner(System.in);
            n = in.nextInt();
            total += n;
        }
        System.out.print(" The total is " + total);
    }

}
