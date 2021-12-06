package com.company.Controller;

import com.company.Model.CreateUser;
import com.company.Model.FoodStuff;
import com.company.Model.GetFood;
import com.company.View.Display;
import com.company.View.DisplayChart;
import com.company.View.Menu;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws IOException
    {

        int userId = 0;
        int userCount = 0;      //this acts as the loop control variable
        ArrayList <CreateUser> totalUsers = new ArrayList<>();     //create an array list which will hold the user objects

        //creating a new text file which will hold the user's information
        FileWriter userFile = new FileWriter("src/com/userFile.txt", true);

        String exitProgram = "N";       //initialize exitProgram to "N".

        //Do these while the exitProgram is "n"
        while (exitProgram.equals("N"))
        {
            Menu.menu(); //shows user options

            int option = Menu.optionChosen();

            if (option == 1)
            {
                CreateUser user = new CreateUser();  //creates a new user.
                totalUsers.add(user);             //adds the user to the users array list.
                userCount++;                            //increment count variable

                //user.storeData(userFile);           //write the data to the text file.
            }

            else if (option == 2)
            {
                //String exiting = "N";
               // while (!(exiting.equals("Y")))
                //{
                    userId = Display.checkUserExistence(totalUsers);       //update current user information

                //return;
                   // exiting = GetFood.getExit();
                //}


            }

            else if (option == 3)
            {
                ArrayList<FoodStuff> me = FoodStuff.foodStuff(); //get the chart
                DisplayChart.chart(me);  //display chart
            }

            else if (option == 4)
            {
                //we exit
                Menu.showExitLogo();
               // System.exit(0);
            }

            exitProgram = Menu.endProgram();        //exit program?
        }

        Display.showResults(totalUsers, userId);

        for(CreateUser writeInfo : totalUsers)
        {
            writeInfo.storeData(userFile);           //write the data to the text file.
            writeInfo.storeProtein(userFile);
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