package com.company.View;

/*
    This class contains the prompt/error messages for user display.
 */
public final class PromptsMessages
{
    //This method prints out that the user creation was successful.
    public static void success()
    {
        System.out.println("\nUser successfully added!!!\n");
    }

    //This method prints out the file does not exist.
    public static void noFileExists()
    {
        System.out.println("Sorry..No Data exists at this time! Try again later..");
    }

    //This method prints out the data does not exist, i.e., the file is empty.
    public static void noDataToRead()
    {
        System.out.println("Beep beep boot bap! The data file seems to be empty. The program will only display the" +
                "\ndata from the last session.");
    }

    //This method prints out the contents read from the text file.
    public static void displayUserInfo(String information)
    {
        System.out.println('\n' + information + '\n');
    }

    //This method prints out the user chose and invalid option.
    public static void invalid()
    {
        System.out.println("Invalid option chosen. Try again...");
    }

    //This method prints out the user entered a different data type then was needed.
    public static void inputMismatch()
    {
        System.out.println("Input error! You entered something incorrect. Try again..");
    }

} //end noFileExists
