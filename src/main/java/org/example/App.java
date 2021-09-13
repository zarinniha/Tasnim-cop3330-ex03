/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Zarin Tasnim
 */

import java.util.Scanner;

class quotes{
    public static void main(String args[])
    {
        System.out.print("What is the quote? ");
        Scanner sc = new Scanner (System.in);
        String quote = sc.nextLine();

        System.out.print("Who said it? ");
        String author = sc.nextLine();
        System.out.println(author +" says," +"\"" +quote + "\"");

    }

}
