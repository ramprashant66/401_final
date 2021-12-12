package com.company.Model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class userInfo
{

    public static void showAllUserInfo()
    {
        String line = "";

        try {
            FileReader reading = new FileReader("src/com/userFile.txt");
            Scanner readFile = new Scanner(reading);

            while (readFile.hasNextLine()) {
                line = line.concat(readFile.nextLine() + "\n");

            }

        } catch (FileNotFoundException error)
        {
            System.out.println("Sorry..No Data exists at this time! Try again later..");
        }

        if(line.isEmpty())
        {
            System.out.println("Beep beep boop bap! The data file seems to be empty. The program will only display the" +
                    "\ndata from the last session.");
        }

      else
        {
            System.out.println('\n' + line + '\n');
        }


    }

}
