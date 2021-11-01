package com.company.View;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import  com.company.Model.FoodStuff;


public class DisplayChart
{

    //This block reads the information of the protein values from the ProteinChart text file.
    public static void fileInfo()
    {
        //file to read from
        File file = new File("src/com/ProteinChart.txt");

        //Scanner object to work with
        Scanner scan;
        {
            try
            {
                //try to create a new object if the text file exists
                scan = new Scanner(file);

                //while there is data in the text file
                while (scan.hasNextLine())
                {
                    //read each line
                    System.out.println(scan.nextLine());
                }
            } catch (FileNotFoundException error) //throw error if the file does not exist or there was error reading from it
            {
                error.printStackTrace();
            }
        }
    } //end fileInfo()

    public static void chart(ArrayList<FoodStuff> food)
    {
        for (FoodStuff foodStuff : food)
        {
            System.out.println("Food name: " + foodStuff.getFoodName() + ", Quantity: " + foodStuff.getQuantity()
                    + ", Unit: " + foodStuff.getUnit() + ", Content: " + foodStuff.getContent() + "g");
        }
    }//end printChart

}