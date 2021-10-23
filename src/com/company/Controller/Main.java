package com.company.Controller;

import com.company.Model.CreateUser;
import com.company.View.Display;
import com.company.View.Menu;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws IOException
    {
        int count = 0;      //this acts as the loop control variable
        ArrayList <CreateUser> users = new ArrayList<>();     //create an array list which will hold the user objects

        //creating a new text file which will hold the user's information
        FileWriter userFile = new FileWriter("src/com/userFile.txt");

        String exitProgram = "N";       //initialize exitProgram to "N".

        //Do these while the exitProgram is "n"
        while (exitProgram.equals("N"))
        {
            Menu.menu(); //shows user options

            int option = Menu.optionChosen();

            if (option == 1)
            {
                CreateUser user = new CreateUser();  //creates a new user.
                users.add(user);             //adds the user to the users array list.
                count++;                            //increment count variable

                user.storeData(userFile);           //write the data to the text file.
            }

            else if (option == 2)
            {
                Display.update(users);       //update current user information
            }

            else if (option == 3)
            {
                //show progress
            }

            else if (option == 4)
            {
                //we exit
                Menu.showExitLogo();
                System.exit(0);
            }

            exitProgram = Menu.endProgram();        //exit program?
        }

        Menu.showExitLogo(); //show exit logo

        userFile.close();                   //close the user file


    } //emd main()

} //end class main


/*
TO DOS
show both: weight in kilos and pounds
            height in inches and cms
 */