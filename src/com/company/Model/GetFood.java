package com.company.Model;

import com.company.View.PromptsMessages;

import java.util.ArrayList;                  // to use arrayList
import java.util.InputMismatchException;    // to catch incorrect data entry inputs
import java.util.Scanner;                   // to use scanner objects

public class GetFood
{
    //This method displays the food categories
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
                        8. Fast Food
                        9. Veggies
                        10. Dairy
                        11. Snacks
                        12. Protein Shake
                        13. ----Exit This Menu----""");

    } //end foodCategories

    //This method returns the category selected by the user
    public static int getCat()
    {
        foodCategories();       //displays the food categories

        int selectCat;     //this variable will hold the category selected

        Scanner scan = new Scanner(System.in);  //new scanner object to work with

        System.out.println("Make your selection: ");        //user prompt to select a category
        try {
            selectCat = scan.nextInt();                         //get the user input

            while ((selectCat <= 0) || (selectCat > 13))        //input validation where selection needs to be between 1-13
            {
                System.out.println("Invalid Entry! Try again, mate!");      //print error message
                System.out.println("Make your selection: ");                //re-prompt for user input
                selectCat = scan.nextInt();                                 //get the user input
            }
        } catch (InputMismatchException error)      //catch anything else apart from integer
        {
            PromptsMessages.inputMismatch();        //show the error message
            selectCat = getCat();       //call this method again to take input
        }

        return selectCat;       //return the selection

    } //end getCat()

    //This method returns the food selected from the category
    public static double inputFood()
    {
        double totalProtein = 0.0;              //initialize the variable to 0.0

        int index,                              //declare the two variables.
            temp;

        do
        {
            index = getCat();                   //index holds the category selected by the user.
            temp = index;                       //temporary variable stores the value from, index variable.

            if (!(index == 13))             //carry out the below as long as the user does not choose to exit this menu
            {

                ArrayList<FoodStuff> name;      //this arrayList will hold the food contained in this program
                name = FoodStuff.foodStuff();   //store the returned array in the new arrayList

                //this array contains the indexes of where each food category starts and ends, consequently.
                int [] indices = { 0, 7, 16, 21, 22, 26, 31, 36, 52, 63, 72, 81, name.size() };

                //starting index of each category is current index -1, that is, where the previous category ended.
                int firstOption = indices[index - 1];
                if (firstOption - 1 < 0)        //we make sure that we do not step out of bounds.
                {
                    //if we do, assign the first value in the array to the starting index of the category
                    firstOption = indices[0];
                }

                //ending index of each category is current index.
                int lastOption = indices[index];

                if (lastOption > name.size())   //we make sure that we do not step out of bounds.
                {
                    //if we do, assign the last value in the array to the ending index of the category
                    lastOption = name.size();
                }

                //this prints the food contained in the category selected by the user
                for ( index = firstOption; index < lastOption; index++)
                {
                    System.out.println((index) + ". " + name.get(index).getFoodName()); //display the food
                }

                //keep accumulating the protein value the user selects
                totalProtein += GetFood.addProtein(name, firstOption, lastOption);

            }

        }  while (temp < 13);  //carry out the above as long as the user does not choose option 13

            return totalProtein;        //return the total protein content of the food

    } //end inputFood()

    //This method returns the accumulated protein
    public static double addProtein(ArrayList<FoodStuff> items, int init, int end)
    {
        Scanner scan = new Scanner(System.in);              //new scanner object to work with
        System.out.println("\nEnter your choice: ");        //prompt the user to enter the foodstuff

        int selection;
        try
        {
            selection = scan.nextInt();                     //get the food item from user

            //input validation where the user must enter the choices in range of each food category
            while ((selection < init) || (selection >= end))
            {
                //if not, display the error message
                System.out.println("Invalid! Your entry was not in the range. Let's try that again...");
                System.out.println("\nEnter your choice: "); //re-prompt the user to re-enter

                selection = scan.nextInt();         //get the user input
            }
        } catch (InputMismatchException error)
        {
            //display the error message
            System.out.println("Oh no! A wrong input was entered. The inputted quantity was reset to 0");
            return 0;           //return with a default value of 0
        }

        //Display the chosen food's default quantity.
        System.out.println("The quantity is: " + items.get(selection).getQuantity()
                + " for 1 " + items.get(selection).getUnit());  //print the current quantity of the food item

        double proteinTemp;
        try
        {
            System.out.println("Adjust the quantity: ");            //user prompt to change the quantity
            proteinTemp =  scan.nextDouble();               //this holds temporary quantity entered from the user

            while (proteinTemp < 0.0)           //protein cannot be a negative number
            {
                System.out.println("Quantity cannot be a negative number! Try again..");    //show the error message
                proteinTemp = scan.nextDouble();    //re-take input
            }

        } catch (InputMismatchException error)
        {
            //display the error message
            System.out.println("Oh no! A wrong input was entered. The inputted quantity was reset to 0");
            return 0;           //return with a default value of 0

        }
        return (proteinTemp * items.get(selection).getContent());      //return the accumulated the protein

    } //end addProtein()

}//end class GetFood
