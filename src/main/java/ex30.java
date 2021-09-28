/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 30
 *  Copyright 2021 Chase Cutshall
 */

import java.util.Scanner;
public class ex30 {
    public static void main(String[] args) {
        int tableSize = 12;
        printMultiplicationTable(tableSize);
    }

    public static void printMultiplicationTable(int tableSize) {

        System.out.format("     ");
        for(int i = 1; i<=tableSize;i++ ) {
            System.out.format("%4d",i);
        }
        System.out.println();

        for(int i = 1 ;i<=tableSize;i++) {

            System.out.format("%4d ",i);
            for(int j=1;j<=tableSize;j++) {
                System.out.format("%4d",i*j);
            }
            System.out.println();
        }
    }
}



