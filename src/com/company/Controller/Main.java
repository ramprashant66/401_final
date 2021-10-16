package com.company.Controller;

import com.company.Model.CreateUser;
import com.company.View.Display;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException
    {
        int count = 0;
        CreateUser[] userList = new CreateUser[10];

        //creating a new text file
        FileWriter userFile = new FileWriter("src/com/userFile.txt");

        Scanner scan = new Scanner(System.in);
        String exitProgram = "n";

        while (exitProgram.equals("n"))
        {
            System.out.println("1. new user\n2.Update\nEnter option");
            int optionChosen = scan.nextInt();

            if (optionChosen == 1)
            {
                CreateUser user = new CreateUser();
                userList[count] = user;
                count++;

                user.storeData(userFile);
            }

            else if (optionChosen == 2)
            {
                Display.update(userList);
            }

            System.out.println("Exit?");
            exitProgram = scan.next();
        }

        userFile.close();


    }
}
