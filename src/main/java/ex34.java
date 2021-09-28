/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 34
 *  Copyright 2021 Chase Cutshall
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ex34 {
    boolean removeName(ArrayList names,String del)
    {
        return names.remove(del);
    }
    public static void main(String []args)
    {
        ex34 obj=new ex34();

        ArrayList<String> names=new ArrayList();

        names.add("John Smith");
        names.add("Jackie Jackson");
        names.add("Chris Jones");
        names.add("Amanda Cullen");
        names.add("Jeremy Goodwin");

        Scanner input =new Scanner(System.in);
        System.out.println("Enter the name to delete");

        String del=input .nextLine();
        obj.removeName(names,del);

        System.out.println(names);
    }
}
