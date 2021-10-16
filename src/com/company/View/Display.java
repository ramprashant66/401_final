package com.company.View;
import com.company.Model.*;

import java.util.Scanner;

public class Display
{
    public Display()
    {
        //empty
    }

    public static String firstName()
    {
        System.out.println("Enter your first name: ");
        Scanner name = new Scanner (System.in);

        return name.next();
    }

    public static String lastName()
    {
        System.out.println("Enter your last name: ");
        Scanner name = new Scanner (System.in);

        return name.next();
    }

    public static int age()
    {
        System.out.println("Enter your age: ");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        //Age needs to be greater than 0 and below 150
        while(age < 0 || age > 150)
        {
            System.out.println("Error! Age cannot be the entered value. Re-enter...");
            age = scan.nextInt();
        }

        return age;
    }

    public static double height()
    {
        System.out.println("Enter your height in feet: ");
        Scanner scan = new Scanner(System.in);
        double height = scan.nextDouble();

        while(height < 0 || height > 8)
        {
            System.out.println("Error! Height in feet cannot be the entered value. Re-enter...");
            height = scan.nextDouble();
        }

        //returning converted height into cm to 2 decimal places.
        return Math.round((height * 30.48) * 100) / 100.0;
    }

    public static double weight()
    {
        System.out.println("Enter your weight in pounds: ");
        Scanner scan = new Scanner(System.in);
        double weight = scan.nextDouble();

        while (weight < 0)
        {
            System.out.println("Weight cannot be a zero or a non-negative value. Re-enter...");
            weight = scan.nextDouble();
        }

        //returning converted weight into kg to 2 decimal places.
        return Math.round(((weight / 2.2)) * 100) / 100.0;
    }

    public static String exercise()
    {
        System.out.println("Enter your exercise intensity level: ");
        System.out.println("Light = ");
        System.out.println("Moderate = ");
        System.out.println("Heavy = ");

        Scanner scan = new Scanner(System.in);
        String exerciseIntensity = scan.next();
        //convert user input to lowercase for input validation
        exerciseIntensity = exerciseIntensity.toLowerCase();

        //Input validation to check if user entered correct input.
        while (!((exerciseIntensity.equals("light")) || (exerciseIntensity.equals("moderate")) || (exerciseIntensity.equals("heavy"
        ))))
        {
            System.out.println("Invalid entry. Enter the correct option from the choices above: ");
            exerciseIntensity = scan.nextLine();
            exerciseIntensity = exerciseIntensity.toLowerCase();
        }

        return exerciseIntensity;
    }

    public static void update(CreateUser[] user)
    {
        if (user[0] == null) //making sure the array has some data
        {
            System.out.println("No users Exist!");
            return;
        }

        System.out.println("We're updating current user information..Cool cool.");
        System.out.println("Let's me look up the data first. What's the first name of the user?");

        Scanner scan = new Scanner(System.in);
        String firstNameSearch = scan.nextLine();

        for (int index = 0; index < user.length; index++)
        {
            if(firstNameSearch.equals(user[index].getFirstName()))
            {
                System.out.println("Alright! User <" + user[index].getFirstName() + "> found with ID# " +
                        index);
                System.out.println("What would you like to update?");
                System.out.println("1. Weight");
                System.out.println("2. Exercise Intensity");

                int biChoice = scan.nextInt();

                if (biChoice == 1)
                {
                    System.out.println("The current weight of the user is: " + user[index].getWeight());
                    System.out.println("Enter the adjusted weight: ");
                    user[index].setWeight();

                    System.out.println("You're all set...");
                }
                else if (biChoice == 2)
                {
                    System.out.println("The current exercise intensity of the user is: " +
                            user[index].getExerciseIntensity());
                    System.out.println("Enter the adjusted intensity level: ");
                    user[index].setExerciseIntensity();

                    System.out.println("You're all set...");
                }

            }

            else if ((index == user.length -1) && !(firstNameSearch.equals(user[index].getFirstName())))
            {
                System.out.println("No user with that name found! User does not exist!");
            }

        }



    }
} //end class Display
