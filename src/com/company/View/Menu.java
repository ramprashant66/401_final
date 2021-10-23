package com.company.View;

import java.util.Scanner;

public class Menu
{
    public static void menu()
    {
        System.out.println("""
                1. Add a new user
                2. Update current user information
                3. Show Progress
                4. Exit
                What would you like to do?""");      //show options
    } //end menu()

    public static int optionChosen()
    {
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();

        while (!((option == 1) || (option == 2) || (option == 3) || (option == 4)))
        {
            System.out.println("Invalid option chosen. Try again...");
            option = scan.nextInt();
        }

        return option;
    }

    public static String endProgram()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Exit?");
        String end = scan.next();
        end = end.toUpperCase();

        while (!(end.equals("Y") || (end.equals("N"))))
        {
            System.out.println("Enter only the characters: Y or N..Exit?");
            end = scan.next();
            end = end.toUpperCase();
        }

        return end;
    }

    public static void showExitLogo()
    {
        System.out.println(" ___  \\ /  ___   ___");
        System.out.println("|--    X    |     |");
        System.out.println(" ---  / \\  _|_    |");

    }


}//end class Menu
