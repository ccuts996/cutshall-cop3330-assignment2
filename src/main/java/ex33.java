/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 33
 *  Copyright 2021 Chase Cutshall
 */

import java.util.Scanner;
import java.util.Random;
public class ex33 {
    public static void main(String[] args) {
        String[] responses = {"Yes","No","Maybe","Ask again later"};

        Random random = new Random();

        Scanner input = new Scanner(System.in);

        System.out.println("What's your question?");
        String question = input.nextLine();

        int randomResponseIndex = random.nextInt(responses.length);

        String response = responses[randomResponseIndex];

        System.out.println();
        System.out.println(response);
        System.out.println();
    }
}

