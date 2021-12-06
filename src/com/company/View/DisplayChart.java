package com.company.View;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.company.Model.CreateUser;
import  com.company.Model.FoodStuff;


public class DisplayChart
{

    //This block reads the information of the protein values from the ProteinChart text file.
    public static void fileInfo()
    {





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
