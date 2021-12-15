package com.company.View;

import java.util.InputMismatchException;    // to handle I/O mismatch exceptions
import java.util.Scanner;                   // to use scanner class

/*
    This class is responsible for displaying the program title, menu, exit logo, etc.
 */
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
                What would you like to do?""");

    } //end menu()

    //This method gets the user's input for the menu choice.
    public static int optionChosen()
    {
        //New scanner object to work with
        Scanner scan = new Scanner(System.in);
        int option;                                 // this variable will hold the user's choice

        try
        {
        option = scan.nextInt();    // get the user's input

        //this statement will carry out input validation to see if the choice is within a certain range
        while (!((option == 1) || (option == 2) || (option == 3) || (option == 4) || (option == 5)))
        {
            PromptsMessages.invalid();  // print the error message and re-prompt
            option = scan.nextInt();    // retake input
        }

        } catch (InputMismatchException error)      // catch input mismatch error
        {
            PromptsMessages.inputMismatch();    // print input mismatch error
            option = optionChosen();    //retake input
        }
        return option;      //return input

    } //end optionChosen()

    //This returns the user choice for ending the program
    public static String endProgram()
    {
        Scanner scan = new Scanner(System.in);  //new scanner object
        System.out.println("Exit the program? (y/n)"); //prompt the user ot end program
        String end = scan.next();    //get the user input
        end = end.toUpperCase();    //changing the input to an uppercase

        //input validation to see if the characters are only Y or N
        while (!(end.equals("Y") || (end.equals("N"))))  //input validation
        {
            System.out.println("Enter only the characters: Y or N..Exit?");  //re-prompting the error
            end = scan.next();      //re-taking the input
            end = end.toUpperCase();    //changing the user input to uppercase
        }

        return end;  //return input

    } //end endProgram()

    //This block displays the app title
    public static void programEntry()
    {
        System.out.println(".:.:.                                     .:.:.");
        System.out.println(".:.:.SIMPLE PROTEIN REQUIREMENT CALCULATOR.:.:.");
        System.out.println(".:.:.                                     .:.:.");

    } //end programEntry()

    //This displays the program exit logo
    public static void showExitLogo()
    {
        System.out.println(" ___  \\ /  ___   ___");
        System.out.println("|--    X    |     |");
        System.out.println(" ---  / \\  _|_    |");

    } //end showExitLogo()

    //This method displays the file not created error message
    public static void fileNotCreated()
    {
        System.out.println("This is awkward :/" +
                "\nThere was an error either creating the file or writing to it...Try re-running the program.");

    } //end fileNotCreated()

}//end class Menu
