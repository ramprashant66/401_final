package com.company.Model;

import java.util.ArrayList;
import java.util.Scanner;

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

        int selectCat;     //initialize variable which will hold the user's choice from menu

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

    public static double inputFood(int category)
    {
        double totalProtein = 0.0;

        ArrayList<FoodStuff> name;      //array list to hold the food

        name = FoodStuff.foodStuff();                       //store the returned array in the new array

            String exit = "N";

            int index;

            if (category == 1) //chicken
            {

                while(!(exit.equals("Y")))          //loop until the "done" == N
                {
                    int firstOption = 0,
                            lastOption = 6;

                    for (index = 0; index < lastOption; index++)   //indexes foe chicken
                    {
                        System.out.println((index) + ". " + name.get(index).getFoodName()); //display the foodstuff
                    }

                  totalProtein += GetFood.addProtein(name, firstOption, lastOption);
                    exit = GetFood.getExit();
                }

              //  System.out.println("The total protein is: " + totalProtein);        //for debug: display total protein
                return totalProtein;
            }

            else if (category == 2)
            {
                while(!(exit.equals("Y")))
                {
                    int firstOption = 6,
                            lastOption = 12;

                    for (index = 6; index < 12; index++)
                    {
                        System.out.println(index + ". " + name.get(index).getFoodName());
                    }

                    totalProtein += GetFood.addProtein(name, firstOption, lastOption);
                    exit = GetFood.getExit();
                }

             //   System.out.println("The total protein is: " + totalProtein);
                return totalProtein;

            }

            else if (category == 3)
            {
                while(!(exit.equals("Y")))
                {
                    int firstOption = 12,
                            lastOption = 16;

                    for (index = 12; index < 16; index++)
                    {
                        System.out.println(index + ". " + name.get(index).getFoodName());
                    }

                    totalProtein += GetFood.addProtein(name, firstOption, lastOption);
                    exit = GetFood.getExit();
                }
            //    System.out.println("The total protein is: " + totalProtein);
                return totalProtein;
            }

            else if (category == 4)
            {
                while(!(exit.equals("Y")))
                {
                    int firstOption = 16,
                            lastOption = 17;

                    for (index = 16; index < 17; index++)
                    {
                        System.out.println(index + ". " + name.get(index).getFoodName());
                    }

                    totalProtein += GetFood.addProtein(name, firstOption, lastOption);
                    exit = GetFood.getExit();
                }
            //    System.out.println("The total protein is: " + totalProtein);
                return totalProtein;
            }

            else if (category == 5)
            {
                while(!(exit.equals("Y")))
                {
                    int firstOption = 17,
                            lastOption = 20;

                    for (index = 17; index < 20; index++)
                    {
                        System.out.println(index + ". " + name.get(index).getFoodName());
                    }

                    totalProtein += GetFood.addProtein(name, firstOption, lastOption);
                    exit = GetFood.getExit();
                }
             //   System.out.println("The total protein is: " + totalProtein);
                return totalProtein;
            }

            else if (category == 6)
            {
                while(!(exit.equals("Y")))
                {
                    int firstOption = 20,
                            lastOption = 25;

                    for (index = 20; index < 25; index++)
                    {
                        System.out.println(index + ". " + name.get(index).getFoodName());
                    }

                    totalProtein += GetFood.addProtein(name, firstOption, lastOption);
                    exit = GetFood.getExit();
                }
               // System.out.println("The total protein is: " + totalProtein);
                return totalProtein;
            }

            else if (category == 7)
            {
                while(!(exit.equals("Y")))
                {
                    int firstOption = 25,
                            lastOption = 30;

                    for (index = 25; index < 30; index++)
                    {
                        System.out.println(index + ". " + name.get(index).getFoodName());
                    }

                    totalProtein += GetFood.addProtein(name, firstOption, lastOption);
                    exit = GetFood.getExit();
                }
               // System.out.println("The total protein is: " + totalProtein);
                return totalProtein;
            }

            else if (category == 8)
            {
                while(!(exit.equals("Y")))
                {
                    int firstOption = 30,
                            lastOption = 40;

                    for (index = 30; index < 40; index++)
                    {
                        System.out.println(index + ". " + name.get(index).getFoodName());
                    }

                    totalProtein += GetFood.addProtein(name, firstOption, lastOption);
                    exit = GetFood.getExit();
                }
                ///System.out.println("The total protein is: " + totalProtein);
                return totalProtein;
            }

            else if (category == 9)
            {
                while(!(exit.equals("Y")))
                {
                    int firstOption = 40,
                            lastOption = 47;

                    for (index = 40; index < 47; index++)
                    {
                        System.out.println(index + ". " + name.get(index).getFoodName());
                    }

                    totalProtein += GetFood.addProtein(name, firstOption, lastOption);
                    exit = GetFood.getExit();
                }
                //System.out.println("The total protein is: " + totalProtein);
                return totalProtein;
            }

            else if (category == 10)
            {
                while(!(exit.equals("Y")))
                {
                    int firstOption = 47,
                            lastOption = 51;

                    for (index = 47; index < 51; index++)
                    {
                        System.out.println(index + ". " + name.get(index).getFoodName());
                    }

                    totalProtein += GetFood.addProtein(name, firstOption, lastOption);
                    exit = GetFood.getExit();
                }
               // System.out.println("The total protein is: " + totalProtein);
                return totalProtein;
            }

            else if (category == 11)
            {
                while(!(exit.equals("Y")))
                {
                    int firstOption = 51,
                            lastOption = name.size();

                    for (index = 51; index < lastOption; index++)
                    {
                        System.out.println(index + ". " + name.get(index).getFoodName());
                    }

                    totalProtein += GetFood.addProtein(name, firstOption, lastOption);
                    exit = GetFood.getExit();
                }
                //System.out.println("The total protein is: " + totalProtein);
                return totalProtein;
            }
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
