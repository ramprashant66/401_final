package com.company.Model;

import java.util.ArrayList;
import java.util.Scanner;
import com.company.Model.FoodStuff;

public class GetFood
{
    public static void foodCategories()
    {
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
                        11. Protein Shake""");
    }

    public static int getCat()
    {
        foodCategories();       //display the food categories

        int selectCat = 0;      //initialize variable which will hold the user's choice from menu
        Scanner scan = new Scanner(System.in);

        System.out.println("Make your selection: ");        //user prompt
        selectCat = scan.nextInt();                         //get choice

        while ((selectCat <= 0) || (selectCat > 11))        //input validation
        {
            System.out.println("Invalid Entry! Try again, mate!");
            System.out.println("Make your selection: ");
            selectCat = scan.nextInt();
        }

        return selectCat;       //return to the caller
    }

    public static void inputFood(int category)
    {
        double totalProtein = 0.0;          //protein accumulator
        String item = " ";                  //item chosen
        Scanner scan = new Scanner(System.in);

        ArrayList<FoodStuff> name = new ArrayList<>();      //array list to hold the food

        ArrayList<String> foodItem = new ArrayList<String>();
        name = FoodStuff.foodStuff();                       //store the returned array in the new array

            int index = 0;
            int indexY = 0;
            String done = "N";


            //needs input validation but works
            if (category == 1) //chicken
            {
                while(!(done.equals("Y")))          //loop until the "done" == N
                {
                    for (index = 0; index < 6; index++)   //indexes foe chicken
                    {
                        System.out.println((index) + ". " + name.get(index).getFoodName()); //display the food stuff
                    }

                    System.out.println("\nEnter your choice: ");        //prompt for food stuff
                    int selection = scan.nextInt();     //get the food item from user for chicken

                    System.out.println("The quantity is: " + name.get(selection).getQuantity()
                            + " for 1 " + name.get(selection).getUnit()); //print the current quantity of the food item
                    System.out.println("Adjust the quantity: ");  //user prompt to change the quantity

                    double proteinTemp = scan.nextDouble();         //this holds temporary quantity from the user

                    totalProtein += (proteinTemp * name.get(selection).getContent());       //accumulates the proteins

                    System.out.println("Done entering from this category? (Y/N)");      //user prompt to exit loop
                    Scanner scanThis = new Scanner(System.in);
                    done = scanThis.nextLine();     //take input
                    done = done.toUpperCase();
                }

                System.out.println("The total protein is: " + totalProtein);        //for debug: display total protein
            }

            else if (category == 2)
            {
                while(!(done.equals("Y")))
                {
                    for (index = 6; index < 12; index++)
                    {
                        System.out.println(index + ". " + name.get(index).getFoodName());
                    }

                    System.out.println("\nEnter your choice: ");
                    int selection = scan.nextInt();

                    System.out.println("The quantity is: " + name.get(selection).getQuantity()
                            + " for 1 " + name.get(selection).getUnit());
                    System.out.println("Adjust the quantity: ");

                    double proteinTemp = scan.nextDouble();

                    totalProtein += (proteinTemp * name.get(selection).getContent());       //accumulates the proteins

                    System.out.println("Done entering from this category? (Y/N)");
                    Scanner scanThis = new Scanner(System.in);
                    done = scanThis.nextLine();
                    done = done.toUpperCase();
                }

                System.out.println("The total protein is: " + totalProtein);

            }

            else if (category == 3)
            {

                while(!(done.equals("Y")))
                {
                    for (index = 12; index < 16; index++)
                    {
                        System.out.println(index + ". " + name.get(index).getFoodName());
                    }

                    System.out.println("\nEnter your choice: ");
                    int selection = scan.nextInt();

                    System.out.println("The quantity is: " + name.get(selection).getQuantity()
                            + " for 1 " + name.get(selection).getUnit());
                    System.out.println("Adjust the quantity: ");

                    double proteinTemp = scan.nextDouble();

                    totalProtein += (proteinTemp * name.get(selection).getContent());       //accumulates the proteins

                    System.out.println("Done entering from this category? (Y/N)");
                    Scanner scanThis = new Scanner(System.in);
                    done = scanThis.nextLine();
                    done = done.toUpperCase();
                }

                System.out.println("The total protein is: " + totalProtein);

            }

            else if (category == 4)
            {

                while(!(done.equals("Y")))
                {
                    for (index = 16; index < 17; index++)
                    {
                        System.out.println(index + ". " + name.get(index).getFoodName());
                    }

                    System.out.println("\nEnter your choice: ");
                    int selection = scan.nextInt();

                    System.out.println("The quantity is: " + name.get(selection).getQuantity()
                            + " for 1 " + name.get(selection).getUnit());
                    System.out.println("Adjust the quantity: ");

                    double proteinTemp = scan.nextDouble();

                    totalProtein += (proteinTemp * name.get(selection).getContent());       //accumulates the proteins

                    System.out.println("Done entering from this category? (Y/N)");
                    Scanner scanThis = new Scanner(System.in);
                    done = scanThis.nextLine();
                    done = done.toUpperCase();
                }

                System.out.println("The total protein is: " + totalProtein);

            }

            else if (category == 5)
            {
                while(!(done.equals("Y")))
                {
                    for (index = 17; index < 20; index++)
                    {
                        System.out.println(index + ". " + name.get(index).getFoodName());
                    }

                    System.out.println("\nEnter your choice: ");
                    int selection = scan.nextInt();

                    System.out.println("The quantity is: " + name.get(selection).getQuantity()
                            + " for 1 " + name.get(selection).getUnit());
                    System.out.println("Adjust the quantity: ");

                    double proteinTemp = scan.nextDouble();

                    totalProtein += (proteinTemp * name.get(selection).getContent());       //accumulates the proteins

                    System.out.println("Done entering from this category? (Y/N)");
                    Scanner scanThis = new Scanner(System.in);
                    done = scanThis.nextLine();
                    done = done.toUpperCase();
                }

                System.out.println("The total protein is: " + totalProtein);

            }

            else if (category == 6)
            {
                while(!(done.equals("Y")))
                {
                    for (index = 20; index < 25; index++)
                    {
                        System.out.println(index + ". " + name.get(index).getFoodName());
                    }

                    System.out.println("\nEnter your choice: ");
                    int selection = scan.nextInt();

                    System.out.println("The quantity is: " + name.get(selection).getQuantity()
                            + " for 1 " + name.get(selection).getUnit());
                    System.out.println("Adjust the quantity: ");

                    double proteinTemp = scan.nextDouble();

                    totalProtein += (proteinTemp * name.get(selection).getContent());       //accumulates the proteins

                    System.out.println("Done entering from this category? (Y/N)");
                    Scanner scanThis = new Scanner(System.in);
                    done = scanThis.nextLine();
                    done = done.toUpperCase();
                }

                System.out.println("The total protein is: " + totalProtein);

            }

            else if (category == 7)
            {
                while(!(done.equals("Y")))
                {
                    for (index = 25; index < 30; index++)
                    {
                        System.out.println(index + ". " + name.get(index).getFoodName());
                    }

                    System.out.println("\nEnter your choice: ");
                    int selection = scan.nextInt();

                    System.out.println("The quantity is: " + name.get(selection).getQuantity()
                            + " for 1 " + name.get(selection).getUnit());
                    System.out.println("Adjust the quantity: ");

                    double proteinTemp = scan.nextDouble();

                    totalProtein += (proteinTemp * name.get(selection).getContent());       //accumulates the proteins

                    System.out.println("Done entering from this category? (Y/N)");
                    Scanner scanThis = new Scanner(System.in);
                    done = scanThis.nextLine();
                    done = done.toUpperCase();
                }

                System.out.println("The total protein is: " + totalProtein);

            }

            else if (category == 8)
            {
                while(!(done.equals("Y")))
                {
                    for (index = 30; index < 40; index++)
                    {
                        System.out.println(index + ". " + name.get(index).getFoodName());
                    }

                    System.out.println("\nEnter your choice: ");
                    int selection = scan.nextInt();

                    System.out.println("The quantity is: " + name.get(selection).getQuantity()
                            + " for 1 " + name.get(selection).getUnit());
                    System.out.println("Adjust the quantity: ");

                    double proteinTemp = scan.nextDouble();

                    totalProtein += (proteinTemp * name.get(selection).getContent());       //accumulates the proteins

                    System.out.println("Done entering from this category? (Y/N)");
                    Scanner scanThis = new Scanner(System.in);
                    done = scanThis.nextLine();
                    done = done.toUpperCase();
                }

                System.out.println("The total protein is: " + totalProtein);

            }

            else if (category == 9)////////////needs fixing
            {
                while(!(done.equals("Y")))
                {
                    for (index = 40; index < 47; index++)
                    {
                        System.out.println(index + ". " + name.get(index).getFoodName());
                    }

                    System.out.println("\nEnter your choice: ");
                    int selection = scan.nextInt();

                    System.out.println("The quantity is: " + name.get(selection).getQuantity()
                            + " for 1 " + name.get(selection).getUnit());
                    System.out.println("Adjust the quantity: ");

                    double proteinTemp = scan.nextDouble();

                    totalProtein += (proteinTemp * name.get(selection).getContent());       //accumulates the proteins

                    System.out.println("Done entering from this category? (Y/N)");
                    Scanner scanThis = new Scanner(System.in);
                    done = scanThis.nextLine();
                    done = done.toUpperCase();
                }

                System.out.println("The total protein is: " + totalProtein);

            }

            else if (category == 10)////////////needs fixing
            {
                while(!(done.equals("Y")))
                {
                    for (index = 47; index < 51; index++)
                    {
                        System.out.println(index + ". " + name.get(index).getFoodName());
                    }

                    System.out.println("\nEnter your choice: ");
                    int selection = scan.nextInt();

                    System.out.println("The quantity is: " + name.get(selection).getQuantity()
                            + " for 1 " + name.get(selection).getUnit());
                    System.out.println("Adjust the quantity: ");

                    double proteinTemp = scan.nextDouble();

                    totalProtein += (proteinTemp * name.get(selection).getContent());       //accumulates the proteins

                    System.out.println("Done entering from this category? (Y/N)");
                    Scanner scanThis = new Scanner(System.in);
                    done = scanThis.nextLine();
                    done = done.toUpperCase();
                }

                System.out.println("The total protein is: " + totalProtein);

            }

            else if (category == 11)////////////needs fixing
            {
                while(!(done.equals("Y")))
                {
                    for (index = 51; index < name.size(); index++)
                    {
                        System.out.println(index + ". " + name.get(index).getFoodName());
                    }

                    System.out.println("\nEnter your choice: ");
                    int selection = scan.nextInt();

                    System.out.println("The quantity is: " + name.get(selection).getQuantity()
                            + " for 1 " + name.get(selection).getUnit());
                    System.out.println("Adjust the quantity: ");

                    double proteinTemp = scan.nextDouble();

                    totalProtein += (proteinTemp * name.get(selection).getContent());       //accumulates the proteins

                    System.out.println("Done entering from this category? (Y/N)");
                    Scanner scanThis = new Scanner(System.in);
                    done = scanThis.nextLine();
                    done = done.toUpperCase();
                }

                System.out.println("The total protein is: " + totalProtein);

            }



    }





}//end class GetFood
