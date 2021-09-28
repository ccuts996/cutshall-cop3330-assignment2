/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 35
 *  Copyright 2021 Chase Cutshall
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
    public class ex35 {
        public static void main(String[] args) {
            String people;
            ArrayList<String> names = new ArrayList<String>();
            Random r = new Random();
            Scanner input = new Scanner(System.in);
            do {
                System.out.print("Enter a name : ");
                people = input.nextLine();
                names.add(people);
            }while(!people.isEmpty());
            names.remove(names.size() - 1);
            System.out.println("The winner is " + names.get(r.nextInt(names.size())));
        }
    }

