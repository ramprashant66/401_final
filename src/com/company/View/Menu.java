package com.company.View;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu
{
    //This method displays the menu options.
    public static void menu()
    {
        System.out.println("""
                    1. Add a new user to the program
                    2. Existing User Actions
                    3. Display the program's Protein Chart
                    4. Display the program instructions
                    5. Exit this program
                What would you like to do?""");      //show options

    } //end menu()

    //This method takes the user's input for the menu choice.
    public static int optionChosen()
    {
        Scanner scan = new Scanner(System.in);
        int option = 0;

        try
        {
        option = scan.nextInt();    //user input

        while (!((option == 1) || (option == 2) || (option == 3) || (option == 4) || (option == 5)))  //input validation
        {
            System.out.println("Invalid option chosen. Try again...");  //user prompt to re-enter
            option = scan.nextInt();    //retake input
        }

        } catch (InputMismatchException error)
        {
            System.out.println("Input error! You entered something incorrect. Try again..");
            option = optionChosen();
        }
        return option;      //return input
    }

    //This returns the user choice for ending the program
    public static String endProgram()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Exit the program? (y/n)"); //prompt the user
        String end = scan.next();    //user input
        end = end.toUpperCase();    //changing the string to an uppercase

        while (!(end.equals("Y") || (end.equals("N"))))  //input validation
        {
            System.out.println("Enter only the characters: Y or N..Exit?");  //prompting user
            end = scan.next();      //taking user input
            end = end.toUpperCase();    //changing the user input to uppercase
        }

        return end;  //return input
    }

    public static void programEntry()
    {
        System.out.println(".:.:.                                     .:.:.");
        System.out.println(".:.:.SIMPLE PROTEIN REQUIREMENT CALCULATOR.:.:.");
        System.out.println(".:.:.                                     .:.:.");
    }

    //This displays the exit logo
    public static void showExitLogo()
    {
        System.out.println(" ___  \\ /  ___   ___");
        System.out.println("|--    X    |     |");
        System.out.println(" ---  / \\  _|_    |");

    } //end showExitLogo()

}//end class Menu
