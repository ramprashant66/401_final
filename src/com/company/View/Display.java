package com.company.View;
import com.company.Model.*;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Display
{
    static boolean userExists = false;

    public Display()
    {
        //empty
    }

    //Reads the first name from the user and returns it.
    public static String firstName()
    {
        System.out.println("Enter your first name: "); //prompt
        Scanner name = new Scanner (System.in);        //read object

        return name.next();                            //returning the input
    }

    //Reads the last name from the user and returns it.
    public static String lastName()
    {
        System.out.println("Enter your last name: ");  //prompt
        Scanner name = new Scanner (System.in);        //read object

        return name.next();                            //returning the input
    }

    //Reads the age from the user and returns it.
    public static int age()
    {
        System.out.println("Enter your age: ");     //prompt
        Scanner scan = new Scanner(System.in);      //read object
        int age = 0;

        try {
            age = scan.nextInt();                   //integer age

            //Age needs to be greater than 0 and below 150 (from my assumption)
            while (age < 10 || age > 150) {
                System.out.println("Error! Age cannot be that low. Re-enter..." ); //error message
                age = scan.nextInt();           //take input again
            }
        } catch (InputMismatchException error)
        {
            System.out.println("Error! Age cannot be a decimal value.");
            age = age();
        }

        return age;                         //return age
    }

    //Reads the height from the user and returns it.
    public static double height()
    {
        System.out.println("Enter your height in feet: ");  //prompt
        Scanner scan = new Scanner(System.in);              //read object
        double height = 0.0;

        try {
            height = scan.nextDouble();                  //double height

            //Make sure height is greater than 0 and less than 8 inches
            while (height < 1.7 || height > 8.0) //shortest to tallest
            {
                System.out.println("Error! Height in feet cannot be the entered value. Re-enter..." ); //error message
                height = scan.nextDouble();     //take input again
            }

        } catch (InputMismatchException error)
        {
            System.out.println("Input error! You entered something incorrect. Try again..");
            height = height();
        }
        //returning converted height into cm to 2 decimal places.
        BigDecimal roundedHeight = BigDecimal.valueOf(height);////////////////////////
        roundedHeight = roundedHeight.setScale(2, RoundingMode.HALF_UP);

        return roundedHeight.doubleValue();
    }

    //Reads the weight and returns it
    public static double weight(boolean existingUser)
    {
        if(existingUser)
        {
            System.out.println("Let's update your weight :) .Enter your current weight in pounds: "); //prompt
        }

        else
        {
            System.out.println("Enter your weight in pounds: "); //prompt
        }
        //System.out.println("Enter your weight in pounds: "); //prompt
        Scanner scan = new Scanner(System.in);               //read object
        double weightInPounds = 0.0;

        try {
            weightInPounds = scan.nextDouble();                   //double weight

            //while weight is less than 0
            while (weightInPounds < 4.7) //lightest adult weight at the age of 17
            {
                System.out.println("Weight cannot be below 4.7 pounds. Re-enter..." );  //error message
                weightInPounds = scan.nextDouble();     //take input again
            }

        } catch (InputMismatchException error)
        {
            System.out.println("Input error! You entered something incorrect. Try again..");
            weightInPounds = weight(existingUser); //////////...might give error.........
        }

        //returning converted weight into kg to 2 decimal places.
        BigDecimal roundedWeight = BigDecimal.valueOf(weightInPounds);////////////////////////
        roundedWeight = roundedWeight.setScale(2, RoundingMode.HALF_UP);

        return roundedWeight.doubleValue();
    }

    //Reading exercise intensity from user and returning it
    public static double exercise(boolean isUser)
    {
        double exerciseValue = 0.0;

        if (isUser)
        {
            System.out.println("Hey fella! Let's update your intensity level since last time.\n");
        }
        //Screen outputs of exercise intensity levels.
        System.out.println("Enter your exercise intensity level: ");
        System.out.println("---------------------------------");
        System.out.println("Sedentary = no workout at all");
        System.out.println("Light = workout once a week");
        System.out.println("Moderate = workout every second day");
        System.out.println("Heavy = workout daily on an elite level");

        Scanner scan = new Scanner(System.in);      //new scanner object to work with
        String exerciseIntensity = scan.nextLine();     //getting the exercise intensity levels from user


        //convert user input to lowercase for input validation
        exerciseIntensity = exerciseIntensity.toLowerCase();

        //Input validation to check if user entered correct input.
        while (!((exerciseIntensity.equals("light")) || (exerciseIntensity.equals("moderate")) ||
                (exerciseIntensity.equals("heavy"))|| (exerciseIntensity.equals("sedentary"))))
        {
            System.out.println("Invalid entry. Enter the correct option from the choices above: "); //error message
            exerciseIntensity = scan.nextLine();                                                //get input again
            exerciseIntensity = exerciseIntensity.toLowerCase();                                //set the input to lowercase
        }

        switch (exerciseIntensity) {
            case "sedentary" -> exerciseValue = 0.8;
            case "light" -> exerciseValue = 1.0;
            case "moderate" -> exerciseValue = 1.7;
            case "heavy" -> exerciseValue = 2.0;
        }
        return exerciseValue;       //return the exercise intensity level
    }


    //This block is used if the user chooses to update the information.
    public static int checkUserExistence(ArrayList <CreateUser> user) throws IOException {
        int id = 0;

        ArrayList <String> first = new ArrayList<String>();

        FileReader reading = new FileReader("src/com/userFile.txt");
        Scanner readFile = new Scanner(reading);

        String line = "";
        while(readFile.hasNextLine())
        {
            line = line.concat(readFile.nextLine() + "\n");

        }

        //System.out.println(line + "\n"); //display line






        if ((user.isEmpty())  && (line.isEmpty())) //making sure the array has at least one user.
        {
            System.out.println("No users Exist! Create one before proceeding.");         //error message
            //return;                                         //exit program
        }




        /*if (user.isEmpty()) //making sure the array has at least one user.
        {
            System.out.println("No users Exist! Create one before proceeding.");         //error message
            //return;                                         //exit program
        }*/

        else if (!userExists)
            {
                //Display
                System.out.println("Welcome back! Let's make sure you exist in our records...");
                System.out.println("Let me look up your data. Either enter the first name or the leading characters of the name:");

                Scanner scan = new Scanner(System.in);      //new scanner to work with
                String firstNameSearch = scan.nextLine();   //taking the entered first name to search the array

                //loop to search for the inputted name in the array.
                for (int index = 0; index < user.size(); index++)
                {
                    //if first name is in the array
                    if (user.get(index).getFirstName().equals(firstNameSearch))
                    {
                        System.out.println("Alright! User <" + firstNameSearch + "> found!");  //confirmation that the username was found

                        userExists = true;
                        id = index;
                    }

                    else
                    {
                        System.out.println("No user with that name found!");
                    }
                }
                if (!(userExists))
                {
                    if(line.contains(firstNameSearch))
                    {
                        System.out.println("Successful!");
                        CreateUser objectOne = new CreateUser(firstNameSearch);
                        //objectOne.setProteinTotal(0);
                        user.add(objectOne);
                        userExists = true;
                        objectOne.setWeight(true); //set from record
                        objectOne.setExerciseIntensity(true); //set from record
                        objectOne.setProteinNeeds();
                        //System.out.println("id is: " + user.indexOf(objectOne));
                        objectOne.setReturningUser(true);
                        id = user.indexOf(objectOne);
                    }

                    else
                    {
                        System.out.println("No user with that name found!");
                    }
                }
            }

           if (userExists)
            {
                updateInfo(user, id);
            }

           return id;
        } //end update()


        public static void updateInfo (ArrayList <CreateUser> user, int id)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("What would you like to update?");  //display
           // System.out.println("1. Weight");                       //option 1
           // System.out.println("2. Exercise Intensity");           //option 2
            System.out.println("1. Add Proteins");           //option 1
            System.out.println("2. Show all stored user information");

            //getting the choice (1 or 2 or 3)
            int biChoice = 0;

            try
            {
                biChoice = scan.nextInt();

                while (biChoice < 0 || biChoice > 2)
                {
                    System.out.println("Invalid entry. Enter only 1 or 2.");
                    biChoice = scan.nextInt();
                }

            } catch (InputMismatchException error)
            {
                System.out.println("Input mismatch! Enter only the integers shown!");
            }



            /*
            //if choice is 1
            if (biChoice == 1)
            {
                System.out.println("The current weight of the user is: " + user.get(id).getWeight() + "kg."); //shows the current weight
                //System.out.println("Enter the adjusted weight: ");  //prompts the weight
                user.get(id).setWeight(userExists);                            //calls the set weight function

                System.out.println("Your adjusted weight is now: " + user.get(id).getWeight() +
                        " kilos!\nYou're all set...");            //confirmation that weight was updated
            }

            // else if choice is 2
            else if (biChoice == 2) {
                System.out.println("The current exercise intensity of the user is: " +
                        user.get(id).getExerciseIntensity());        //shows the current exercise intensity
                //System.out.println("Enter the adjusted intensity level: ");     //prompt
                user.get(id).setExerciseIntensity();                         //calls the set exercise intensity function

                System.out.println("Your adjusted exercise intensity level is now: " +
                        user.get(id).getExerciseIntensity() +
                        "\nYou're all set...");           //confirmation that the exercise intensity was updated
            }*/

            if (biChoice == 1)
            {
                if (user.isEmpty())
                {
                    System.out.println("No user exists! Create one before accessing any information..");
                }
                else
                {
                    //int category = GetFood.getCat();
                    //double proteinFromUSer = GetFood.inputFood(category);
                    double proteinFromUSer = GetFood.inputFood();

                    user.get(id).setProteinTotal(proteinFromUSer); //accumulate the total protein for the user
                }
            }

            else if (biChoice == 2)
            {
                userInfo.showAllUserInfo();
            }

        }//end updateInfo()

////////////////rounding does not occur sometimes
    public static void showResults(ArrayList <CreateUser> user, int id)
    {
        System.out.println("The total protein requirement for you per day is: " + user.get(id).getProteinNeeds() +
                " grams (g). You consumed a total of " + user.get(id).getProteinTotal() + " grams(g) of protein.");

        if (user.get(id).getProteinTotal() == user.get(id).getProteinNeeds())
        {
            System.out.println("Thus, you have met your protein intake goal for today!");
            System.out.println(" . . .");
            System.out.println(". o o .");
            System.out.println(". \\_/ .");
            System.out.println(" . . .");
        }

        else if (user.get(id).getProteinTotal() < user.get(id).getProteinNeeds())
        {

            System.out.println("Your intake was below the recommended protein goal for today!");
            System.out.println("  . . . ");
            System.out.println(". T   T .");
            System.out.println(". |   | .");
            System.out.println("  . . . ");
            //System.out.println("\n\nYou under ate this amount: " + (((Math.round(user.get(id).getProteinNeeds()) * 100) /100.00)
                   // - (Math.round((user.get(id).getProteinTotal() * 100) / 100.00))) + " grams.");

            BigDecimal needs = BigDecimal.valueOf(user.get(id).getProteinNeeds());////////////////////////
            needs = needs.setScale(2, RoundingMode.HALF_UP);

            BigDecimal total = BigDecimal.valueOf(user.get(id).getProteinTotal());
            total = total.setScale(2, RoundingMode.HALF_UP);

            BigDecimal result = BigDecimal.valueOf((needs.doubleValue() - total.doubleValue()));
            result = result.setScale(2, RoundingMode.HALF_UP);

            System.out.println("\n\nYou under ate this amount: " + result + " grams");


            System.out.println("Deficient intake can break down other muscle fibers to replenish the ones you worked out!" +
                    " Not to mention, delaying gains!");
        }

        else if (user.get(id).getProteinTotal() > user.get(id).getProteinNeeds())
        {
            System.out.println("Your intake was above the recommended protein goal for today!");
            System.out.println("  . . . .");
            System.out.println(". ==   == .");
            System.out.println(".    _    .");
            System.out.println("  . . . .");

            BigDecimal needs = BigDecimal.valueOf(user.get(id).getProteinNeeds());////////////////////////
            needs = needs.setScale(2, RoundingMode.HALF_UP);

            BigDecimal total = BigDecimal.valueOf(user.get(id).getProteinTotal());
            total = total.setScale(2, RoundingMode.HALF_UP);

            BigDecimal result = BigDecimal.valueOf(total.doubleValue() - needs.doubleValue());
            result = result.setScale(2, RoundingMode.HALF_UP);

            System.out.println("\n\nYou over ate this amount: " + result + " grams.");

            System.out.println("Excess intake can put extra stress on your kidneys and liver as the liver will have to" +
                    "break down those proteins into nitrogenous wastes while the kidneys will have to expel them.");

        }


    } //end showResults




} //end class Display
