package com.company.View;

import java.util.ArrayList;
import  com.company.Model.FoodStuff;

/*
    This class is responsible for displaying the list of food objects to the user
 */
public class DisplayChart
{
    //This method displays the food categories and then each sub category of food to the user.
    public static void chart(ArrayList<FoodStuff> food)
    {
        for (int index = 0; index < food.size(); index++)
        {
         if (index == 0) System.out.println("----------------------------CHICKEN----------------------------");
         else if (index == 7) System.out.println("\n----------------------------SEAFOOD----------------------------");
         else if (index == 16) System.out.println("\n----------------------------LAMB & Goat----------------------------");
         else if (index == 21) System.out.println("\n----------------------------BEEF----------------------------");
         else if (index == 22) System.out.println("\n----------------------------PORK----------------------------");
         else if (index == 26) System.out.println("\n----------------------------DUCK----------------------------");
         else if (index == 31) System.out.println("\n----------------------------TURKEY----------------------------");
         else if (index == 36) System.out.println("\n----------------------------FAST FOOD----------------------------");
         else if (index == 52) System.out.println("\n----------------------------VEGGIES----------------------------");
         else if (index == 63) System.out.println("\n----------------------------DAIRY----------------------------");
         else if (index == 72) System.out.println("\n----------------------------SNACKS----------------------------");
         else if (index == 81) System.out.println("\n----------------------------PROTEIN SHAKE----------------------------");

            System.out.println("Food name: " + food.get(index).getFoodName() + ", Quantity: " + food.get(index).getQuantity()
                    + ", Unit: " + food.get(index).getUnit() + ", Content: " + food.get(index).getContent() + "g");
        }

        System.out.println("\n");   //adds a new line

    } //end chart()

} //end class DisplayChart
