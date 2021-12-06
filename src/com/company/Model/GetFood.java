package com.company.Model;

import java.util.ArrayList;
import java.util.Scanner;

public class GetFood {
    public static void foodCategories() {
        System.out.println(
                """
                        1. Chicken
                        2. Seafood
                        3. Lamb
                        4. Beef
                        5. Pork
                        6. Duck
                        7. Turkey
                        8. Veggies
                        9. Dairy
                        10. Snacks
                        11. Protein Shake
                        12. ----Main Menu----""");
    }

    public static int getCat() {
        foodCategories();       //display the food categories

        int selectCat;     //initialize variable which will hold the user's choice from menu

        Scanner scan = new Scanner(System.in);

        System.out.println("Make your selection: ");        //user prompt
        selectCat = scan.nextInt();                         //get choice

        while ((selectCat <= 0) || (selectCat > 12))        //input validation
        {
            System.out.println("Invalid Entry! Try again, mate!");
            System.out.println("Make your selection: ");
            selectCat = scan.nextInt();
        }

        return selectCat;       //return to the caller
    }

    public static double inputFood() {
        double totalProtein = 0.0;

        String mainMenu = "N";
        int index = 0;
        int temp = 0;

        do
        {
            index = getCat();
            temp = index;

            if (!(index == 12))
            {

                ArrayList<FoodStuff> name;      //array list to hold the food
                name = FoodStuff.foodStuff();   //store the returned array in the new array

                int [] indices = {0, 6, 15, 22, 23, 27, 32, 37, 48, 57, 66, name.size()};

                String exit = "N";

                // index = getCat();
                // temp = index;

                int firstOption = indices[index - 1];
                if (firstOption - 1 < 0)
                {
                    firstOption = indices[0];
                }




                int lastOption = indices[index];
                if (lastOption > name.size())
                {
                    lastOption = name.size();
                }

                index = 0;


                for ( index = firstOption; index < lastOption; index++)   //indexes foe chicken
                {
                    System.out.println((index) + ". " + name.get(index).getFoodName()); //display the foodstuff
                }

                totalProtein += GetFood.addProtein(name, firstOption, lastOption);




            }

        }  while (temp < 12);


            //exit = GetFood.getExit();
        //}

            return totalProtein;
    }

    public static double addProtein(ArrayList<FoodStuff> items, int init, int end)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter your choice: ");        //prompt for foodstuff
        int selection = scan.nextInt();     //get the food item from user for chicken

        while ((selection < init) || (selection >= end))
        {
            System.out.println("Invalid! Try again.");
            System.out.println("\nEnter your choice: ");
            selection = scan.nextInt();
        }

        System.out.println("The quantity is: " + items.get(selection).getQuantity()
                + " for 1 " + items.get(selection).getUnit()); //print the current quantity of the food item
        System.out.println("Adjust the quantity: ");  //user prompt to change the quantity

        double proteinTemp = scan.nextDouble();         //this holds temporary quantity from the user

        return (proteinTemp * items.get(selection).getContent());      //accumulates the proteins

    }

    public static String getExit()
    {
        System.out.println("Done entering from this category? (Y/N)");      //user prompt to exit loop
        Scanner scanThis = new Scanner(System.in);
        String done = scanThis.nextLine();     //take input
        done = done.toUpperCase();

        while(!((done.equals("Y")) || (done.equals("N"))))
        {
            System.out.println("Invalid Entry! Enter only (y/n)...");
            done = scanThis.nextLine();
            done = done.toUpperCase();
        }

        return done;
    }



}//end class GetFood
