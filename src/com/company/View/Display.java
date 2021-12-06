package com.company.View;
import com.company.Model.*;

import java.io.*;
import java.util.ArrayList;
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
        int age = scan.nextInt();                   //integer age

        //Age needs to be greater than 0 and below 150 (from my assumption)
        while(age < 0 || age > 150)
        {
            System.out.println("Error! Age cannot be the entered value. Re-enter..."); //error message
            age = scan.nextInt();           //take input again
        }

        return age;                         //return age
    }

    //Reads the height from the user and returns it.
    public static double height()
    {
        System.out.println("Enter your height in feet: ");  //prompt
        Scanner scan = new Scanner(System.in);              //read object
        double height = scan.nextDouble();                  //double height

        //Make sure height is greater than 0 and less than 8 inches
        while(height < 0 || height > 8)
        {
            System.out.println("Error! Height in feet cannot be the entered value. Re-enter..."); //error message
            height = scan.nextDouble();     //take input again
        }

        //returning converted height into cm to 2 decimal places.
        return Math.round((height * 30.48) * 100) / 100.0;
    }

    //Reads the weight and returns it
    public static double weight()
    {
        System.out.println("Enter your weight in pounds: "); //prompt
        Scanner scan = new Scanner(System.in);               //read object
        double weight = scan.nextDouble();                   //double weight

        //while weight is less than 0
        while (weight < 0)
        {
            System.out.println("Weight cannot be a zero or a non-negative value. Re-enter...");  //error message
            weight = scan.nextDouble();     //take input again
        }

        //returning converted weight into kg to 2 decimal places.
        return Math.round(((weight / 2.2)) * 100) / 100.0;
    }

    //Reading exercise intensity from user and returning it
    public static double exercise()
    {
        double exerciseValue = 0.0;

        //Screen outputs of exercise intensity levels.
        System.out.println("Enter your exercise intensity level: ");
        System.out.println("---------------------------------");
        System.out.println("Sedentary = no workout at all");
        System.out.println("Light = workout once a week");
        System.out.println("Moderate = workout every second day");
        System.out.println("Heavy = workout daily on an elite level");

        Scanner scan = new Scanner(System.in);      //new scanner object to work with
        String exerciseIntensity = scan.next();     //getting the exercise intensity levels from user

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
                System.out.println("We're updating current user information..Cool cool.");
                System.out.println("Let me look up the data first. What's the first name of the user?");

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

                }
                if (!(userExists))
                {
                    if(line.contains(firstNameSearch))
                    {
                        System.out.println("Successful!");
                        CreateUser objectOne = new CreateUser(firstNameSearch, "last name");
                        //objectOne.setProteinTotal(0);
                        user.add(objectOne);
                        userExists = true;
                        objectOne.setWeight(); //set from record
                        objectOne.setExerciseIntensity(); //set from record
                        objectOne.setProteinNeeds();
                        //System.out.println("id is: " + user.indexOf(objectOne));
                        objectOne.setReturningUser(true);
                        id = user.indexOf(objectOne);
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
            System.out.println("1. Weight");                       //option 1
            System.out.println("2. Exercise Intensity");           //option 2
            System.out.println("3. Add Proteins");           //option 3

            //getting the choice (1 or 2 or 3)
            int biChoice = scan.nextInt();

            //if choice is 1
            if (biChoice == 1) {
                System.out.println("The current weight of the user is: " + user.get(id).getWeight() + "kg."); //shows the current weight
                //System.out.println("Enter the adjusted weight: ");  //prompts the weight
                user.get(id).setWeight();                            //calls the set weight function

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
            }

            else if (biChoice == 3)
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

        }//end updateInfo()


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
            System.out.println("\n\nYou under ate this amount: " + (((Math.round(user.get(id).getProteinNeeds()) * 100) /100.00)
                    - (Math.round((user.get(id).getProteinTotal() * 100) / 100.00))) + " grams.");

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
            System.out.println("\n\nYou over ate this amount: " + (((Math.round(user.get(id).getProteinTotal()) * 100) /100.00)  -
                    (Math.round((user.get(id).getProteinNeeds() * 100) / 100.00))) + " grams.");

            System.out.println("Excess intake can put extra stress on your kidneys and liver as the liver will have to" +
                    "break down those proteins into nitrogenous wastes while the kidneys will have to expel them.");

        }


    } //end showResults




} //end class Display
