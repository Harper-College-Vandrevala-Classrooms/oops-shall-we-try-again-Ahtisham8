package com.csc;

import java.util.Scanner;

// Your code goes here!
class main{
    public static void main(String[] args)
    {
        System.out.println("Java Menu:");
        menu(500, -500, "Your value is invalid", "Please enter a value");
        
    }
    
    public static void menu(int upper, int lower, String errorMsg, String prompt)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println(prompt);
        int num = input.nextInt();
    
        while (num > upper || num < lower) {
            System.out.println(errorMsg);
            System.out.println(prompt);
            num = input.nextInt();
        }
    
        System.out.println("The value chosen by the user is " + num);
    }
}
