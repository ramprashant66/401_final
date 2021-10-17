package com.company.View;
import com.company.Model.*;

import java.util.Scanner;

public class Display
{
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
    public static String exercise()
    {
        //Screen outputs of exercise intensity levels.
        System.out.println("Enter your exercise intensity level: ");
        System.out.println("Light = ");
        System.out.println("Moderate = ");
        System.out.println("Heavy = ");

        Scanner scan = new Scanner(System.in);      //new scanner object to work with
        String exerciseIntensity = scan.next();     //getting the exercise intensity levels from user

        //convert user input to lowercase for input validation
        exerciseIntensity = exerciseIntensity.toLowerCase();

        //Input validation to check if user entered correct input.
        while (!((exerciseIntensity.equals("light")) || (exerciseIntensity.equals("moderate")) ||
                (exerciseIntensity.equals("heavy"))))
        {
            System.out.println("Invalid entry. Enter the correct option from the choices above: "); //error message
            exerciseIntensity = scan.nextLine();                                                //get input again
            exerciseIntensity = exerciseIntensity.toLowerCase();                                //set the input to lowercase
        }

        return exerciseIntensity;       //return the exercise intensity level
    }

    //This block is used if the user chooses to update the information.
    public static void update(CreateUser[] user)
    {
        if (user[0] == null) //making sure the array has at least one user.
        {
            System.out.println("No users Exist!");         //error message
            return;                                         //exit program
        }

        //Display
        System.out.println("We're updating current user information..Cool cool.");
        System.out.println("Let's me look up the data first. What's the first name of the user?");

        Scanner scan = new Scanner(System.in);      //new scanner to work with
        String firstNameSearch = scan.nextLine();   //taking the entered first name to search the array

        //loop to search for the inputted name in the array.
        for (int index = 0; index < user.length; index++)
        {
            //if first name is in the array
            if(firstNameSearch.equals(user[index].getFirstName()))
            {
                System.out.println("Alright! User <" + user[index].getFirstName() + "> found with ID# " +
                        index);  //confirmation that the username was found
                System.out.println("What would you like to update?");  //display
                System.out.println("1. Weight");                       //option 1
                System.out.println("2. Exercise Intensity");           //option 2

                //getting the choice (1 or 2)
                int biChoice = scan.nextInt();

                //if choice is 1
                if (biChoice == 1)
                {
                    System.out.println("The current weight of the user is: " + user[index].getWeight()); //shows the current weight
                    System.out.println("Enter the adjusted weight: ");  //prompts the weight
                    user[index].setWeight();                            //calls the set weight function

                    System.out.println("You're all set...");            //confirmation that weight was updated
                }
                // else if choice is 2
                else if (biChoice == 2)
                {
                    System.out.println("The current exercise intensity of the user is: " +
                            user[index].getExerciseIntensity());        //shows the current exercise intensity
                    System.out.println("Enter the adjusted intensity level: ");     //prompt
                    user[index].setExerciseIntensity();                         //calls the set exercise intensity function

                    System.out.println("You're all set...");           //confirmation that the exercise intensity was updated
                }

            }

            //else if the user name was not found
            else if ((index == user.length -1) && !(firstNameSearch.equals(user[index].getFirstName())))
            {
                System.out.println("No user with that name found! User does not exist!");   //print error message
            }
        }


    } //end update()


} //end class Display
