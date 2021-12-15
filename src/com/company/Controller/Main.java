package com.company.Controller;

import com.company.Model.CreateUser;        //to use CreateUser class from Model package
import com.company.Model.FoodStuff;         //to use FoodStuff class from Model package
import com.company.View.*;

import java.io.FileWriter;                  //for external output operations
import java.io.IOException;                 //to handle exceptions
import java.util.ArrayList;                 //to use array lists

public class Main
{
    public static void main(String[] args) throws IOException
    {
        int userId = 0;         //this ties with each user, acting as their ID number.

        //this creates an array list which will hold the users as objects
        ArrayList <CreateUser> totalUsers = new ArrayList<>();

        //this creates a new text file which will hold the user's information
        FileWriter userFile = new FileWriter("src/com/userFile.txt", true);

        //this variable will decide if the program will quit or not. Initialize it to "N" by default to make it
        // run at least once.
        String exitProgram = "N";

        //Do these while the exitProgram is "N"
        while (exitProgram.equals("N"))
        {
            Menu.programEntry();        //show the application title
            Menu.menu();                //show the program's main menu

            int option = Menu.optionChosen();   //return the option chosen from the user

            //if the user chose option 1, then:
            if (option == 1)
            {
                CreateUser user = new CreateUser();     //we create a new user.
                totalUsers.add(user);                   //we add the user to the users array list.
                PromptsMessages.success();              //confirmation that the user was added
            }

            //else if the user chose option 2, then:
            else if (option == 2)
            {
                    userId = Display.checkUserExistence(totalUsers);       //we update the current user information.
            }

            //else if the user chose option 3, then:
            else if (option == 3)
            {
                //we fetch the foodstuff chart and pass it DisplayChart.chart() method, next.
                ArrayList<FoodStuff> me = FoodStuff.foodStuff();
                DisplayChart.chart(me);                            //this method displays the chart to the user.
            }

            //if the user chose option 4, then:
            else if (option == 4)
            {
                Instructions.instructions();        //display the program instructions

            }

            //if the user chose option 5, then:
            else if (option == 5)
            {
                //this ends the while loop
                exitProgram = "Y";
            }

            //after each conditional statement, we ask the user if they wish to end the program.
            if(option != 5)
            {
                exitProgram = Menu.endProgram();        //prompt the user for exit
            }

        }

        //if a user exists, then we display their results before exiting.
        if (!(totalUsers.isEmpty()))
        {
            //displays their results by accessing the array list and their user id.
            Display.showResults(totalUsers, userId);
        }

        //we write this information from the array list to the text file
        for(CreateUser writeInfo : totalUsers)
        {
            //write everything apart from their protein content part to the text file (first name, last name,
            //age, weight, height, exercise intensity level).
            writeInfo.storeData(userFile);

            //Write the protein part to their records.
            writeInfo.storeProtein(userFile);
        }

        Menu.showExitLogo();                //display the program exit logo upon program exit

        userFile.close();                   //close the user file

    } //emd main()

} //end class main
