package com.csc;

import java.util.Scanner;

// Your code goes here!
class main{
    public static void main(String[] args)
    {
        System.out.println("Java Menu:");
        menu(500, -500, "Your value is invalid", "Please enter a value. Enter \"default\" to use the default value of 100. Enter \"exit\" to leave the menu.\r\n");
        
    }
    
    public static void menu(int upper, int lower, String errorMsg, String prompt)
    {
        Scanner input = new Scanner(System.in);
        String output = "";
        
        System.out.println(prompt);
        String num = input.nextLine();
        
        if (num.equals("default") || num.equals("Default")) {

            System.out.println("The value chosen by the user is " + 100);
        }

        else if(num.equals("exit")){
            System.out.println("The program will now be aborted.");
        }
        
        else {

            int castNum = Integer.parseInt(num);
            
            while (castNum > upper || castNum < lower) {
                System.out.println(errorMsg);
                System.out.println(prompt);
                castNum = input.nextInt();
            }

            System.out.println("The value chosen by the user is " + castNum);
        }

        
        
    }
}
