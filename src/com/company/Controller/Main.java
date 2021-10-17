package com.company.Controller;

import com.company.Model.CreateUser;
import com.company.View.Display;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException
    {
        int count = 0;      //this acts as the loop control variable
        CreateUser[] userList = new CreateUser[10];     //create an array which will hold the user objects

        //creating a new text file which will hold the user's information
        FileWriter userFile = new FileWriter("src/com/userFile.txt");

        //New scanner object to work with
        Scanner scan = new Scanner(System.in);
        String exitProgram = "n";       //initialize exitProgram to "n".

        //Do these while the exitProgram is "n"
        while (exitProgram.equals("n"))
        {

            System.out.println("1. new user\n2.Update\nEnter option");      //show options
            int optionChosen = scan.nextInt();      //gets the option chosen from user.

            if (optionChosen == 1)
            {
                CreateUser user = new CreateUser();  //creates a new user.
                userList[count] = user;             //adds the user to the userList array.
                count++;                            //increment count variable

                user.storeData(userFile);           //write the data to the text file.
            }

            else if (optionChosen == 2)
            {
                Display.update(userList);       //update current user information
            }

            System.out.println("Exit?");        //prompt for exit
            exitProgram = scan.next();          //get input for exitProgram
        }

        userFile.close();                   //close the user file


    } //emd main()

} //end class main
