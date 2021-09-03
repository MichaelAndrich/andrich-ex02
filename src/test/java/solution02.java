/*
 *  UCF COP3330 Fall 2021 Assignment 02 Solution
 *  Copyright 2021 Michael Andrich
 */

/*
    prompt user for string
    store users string and count how many characters are in the string
    display output with original string and how many characters are in it
 */

import java.util.Scanner;

public class solution02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What is the input string? ");

        String fstring = sc.nextLine();
        int count = 0;

        for(int i =0; i <fstring.length(); i++){
            if(fstring.charAt(i) != ' ')
                count++;
        }

        System.out.println(""+fstring+ " has "+count+ " characters." );
    }
}
