package com.company.View;

import com.company.Model.*;                     //to use classes from the Model package
import java.io.FileReader;                      //to read from external files
import java.io.IOException;                     //for I/O exception handling
import java.math.BigDecimal;                    //to round off double values
import java.math.RoundingMode;                  //to work with BigDecimal in rounding values
import java.util.ArrayList;                     //to use array lists
import java.util.InputMismatchException;        //to handle input mismatches
import java.util.Scanner;                       //to get user inputs

//This class
public class Display
{
    static boolean userExists = false;          //this boolean checks to see if any previous user exists

    //Default constructor
    public Display()
    {
        //empty body
    } //end constructor

    //This method reads the first name from the user and returns it.
    public static String firstName()
    {
        System.out.println("Enter your first name: "); //prompting the user to enter their first name
        Scanner name = new Scanner (System.in);        //new scanner object

        return name.next();                            //returning the input
    } //end firstName()

    //This method reads the last name from the user and returns it.
    public static String lastName()
    {
        System.out.println("Enter your last name: ");  //prompting the user to enter their last name
        Scanner name = new Scanner (System.in);        //new scanner object

        return name.next();                            //returning the input
    }

    //This method reads the age from the user and returns it.
    public static int age()
    {
        System.out.println("Enter your age: ");     //prompting the user to enter their age
        Scanner scan = new Scanner(System.in);      //new scanner object
        int age;                                    //this holds the age

        try {
            age = scan.nextInt();                   //take the input from the user

            //age needs to be greater than 0 and below 150 (max age)
            while (age < 10 || age > 150)
            {
                System.out.println("Error! Age cannot be that low. Re-enter..." ); //show error message and re-prompt
                age = scan.nextInt();                                              //re-take the input
            }
        } catch (InputMismatchException error)      //catch anything else inputted apart from an integer
        {
            System.out.println("Error! Age cannot be a decimal or a character!"); //show error message
            age = age();                                //call this method again to take input
        }

        return age;                         //return the age

    }//end age()

    //This method reads the height from the user and returns it.
    public static double height()
    {
        System.out.println("Enter your height in feet: ");  //prompting the user to enter their height
        Scanner scan = new Scanner(System.in);              ///new scanner object
        double height;

        try
        {
            height = scan.nextDouble();                  //taking the input

            //Make sure height is greater than 0 and less than 8 inches
            while (height < 1.7 || height > 8.0) //shortest to tallest
            {
                System.out.println("Error! Height in feet cannot be the entered value. Re-enter..." ); //error message
                height = scan.nextDouble();     //taking the input again
            }

        } catch (InputMismatchException error) //catch anything else inputted apart from a double
        {
            System.out.println("Input error! You entered something incorrect. Try again.."); //show error message
            height = height();                      //call this method again to take input
        }

        //returning the height in 2 decimal places.
        BigDecimal roundedHeight = BigDecimal.valueOf(height);
        roundedHeight = roundedHeight.setScale(2, RoundingMode.HALF_UP); //setting height to 2 decimal places

        return roundedHeight.doubleValue();         //converting the height back to double returning it

    } //end height()

    //This method reads the weight from the user and returns it.
    public static double weight(boolean existingUser)
    {
        //we check to see if a user already exists (i.e., a returning user)
        if(existingUser)
        {
            //if yes, we update their weight
            System.out.println("Let's update your weight :) .Enter your current weight in pounds: ");
        }

        else
        {
            //If not a returning user, still let them enter their weight with a different prompt.
            System.out.println("Enter your weight in pounds: "); //prompt
        }
        //System.out.println("Enter your weight in pounds: "); //prompt
        Scanner scan = new Scanner(System.in);               //new scanner object
        double weightInPounds;                        //local variable to hold weight

        try
        {
            weightInPounds = scan.nextDouble();                   //take the user weight

            //while weight is less than 4.7 (the lowest weight)
            while (weightInPounds < 4.7) //lightest adult weight at the age of 17
            {
                System.out.println("Weight cannot be below 4.7 pounds. Re-enter..." );  //show the error message
                weightInPounds = scan.nextDouble();     //take the input again
            }

        } catch (InputMismatchException error) //catch anything else apart from a double
        {
            System.out.println("Input error! You entered something incorrect. Try again.."); //show the error message
            weightInPounds = weight(existingUser);      //call this method again
        }

        //returning converted weight into kg to 2 decimal places.
        BigDecimal roundedWeight = BigDecimal.valueOf(weightInPounds);
        roundedWeight = roundedWeight.setScale(2, RoundingMode.HALF_UP); //setting the weight to 2 decimal places

        return roundedWeight.doubleValue(); //converting it back to a double and returning it
    } //end weight()

    //This method reads the exercise intensity from user and returns it
    public static double exercise(boolean isUser)
    {
        double exerciseValue = 0.0;         //this will hold the intensity value

        //if the user is an existing one, then, update their intensity level
        if (isUser)
        {
            //update their intensity level
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
        String exerciseIntensity = scan.nextLine();     //getting the exercise intensity level from user


        //convert user input to lowercase for input validation
        exerciseIntensity = exerciseIntensity.toLowerCase();

        //Input validation to check if user entered correct input.
        while (!((exerciseIntensity.equals("light")) || (exerciseIntensity.equals("moderate")) ||
                (exerciseIntensity.equals("heavy"))|| (exerciseIntensity.equals("sedentary"))))
        {
            System.out.println("Invalid entry. Enter the correct option from the choices above: "); //error message
            exerciseIntensity = scan.nextLine();                                             //get input again
            exerciseIntensity = exerciseIntensity.toLowerCase();                             //set the input to lowercase
        }

        switch (exerciseIntensity)  //map the string into it's double value
        {
            case "sedentary" -> exerciseValue = 0.8;
            case "light" -> exerciseValue = 1.0;
            case "moderate" -> exerciseValue = 1.7;
            case "heavy" -> exerciseValue = 2.0;
        }
        return exerciseValue;       //return the exercise intensity level

    } //end exercise()


    //This method is for existing users to update their information.
    public static int checkUserExistence(ArrayList <CreateUser> user) throws IOException
    {
        int id = 0;         //user's id

        //read the stored user information, if, exists, from this file
        FileReader reading = new FileReader("src/com/userFile.txt");
        Scanner readFile = new Scanner(reading);   //read from this file

        String line = "";                       //this will hold the read strings, line-line
        while(readFile.hasNextLine())           //while there is data to read,
        {
            line = line.concat(readFile.nextLine() + "\n");     //keep adding it to the string

        }

        //if the array list is empty and there is no data in the text file, then a user does not exist.
        if ((user.isEmpty())  && (line.isEmpty()))
        {
            System.out.println("No users Exist! Create one before proceeding.");         //show error message
        }

        //else if one exists, the update their records.
        else if (!userExists)
            {
                //Search their name in the records.
                System.out.println("Welcome back! Let's make sure you exist in our records...");
                System.out.println("Let me look up your data. Either enter the first name or the leading characters of the name:");

                Scanner scan = new Scanner(System.in);      //new scanner to work with
                String firstNameSearch = scan.nextLine();   //taking the entered first name to search the array

                //We check if they were created recently (through the array list),
                // hence, we loop to search for the inputted name in the array.
                for (int index = 0; index < user.size(); index++)
                {
                    //if first name is in the array,
                    if (user.get(index).getFirstName().equals(firstNameSearch))
                    {
                        //confirmation that the username was found
                        System.out.println("Alright! User <" + firstNameSearch + "> found!");

                        userExists = true;  //set that there exists a user
                        id = index;         //their ID is the index their name was found (if we have multiple users)
                    }

                    //else, display that we couldn't find a user with that name.
                    else
                    {
                        System.out.println("No user with that name found!"); //display name did not match
                    }
                }

                //if we did not find a user in the array, maybe they exist in our text file, let's search
                if (!(userExists))
                {
                    if(line.contains(firstNameSearch))   //their string used to search the text file
                    {
                        System.out.println("Successful!");      //if found, display that it was found.
                        //create a new user of that same user to work with
                        CreateUser objectOne = new CreateUser(firstNameSearch);
                        user.add(objectOne);   //add it back to the array
                        userExists = true;     //set that a user exists
                        objectOne.setWeight(true); //update their weight
                        objectOne.setExerciseIntensity(true); //update their exercise intensity level
                        objectOne.setProteinNeeds();        //set their protein needs
                        objectOne.setReturningUser(true);   //set that this user is a returning user and not a new one
                        id = user.indexOf(objectOne); //their ID is the index their name was found (if we have multiple users)
                    }

                    //if the name was not found in the array list and the text file, then display the error message
                    else
                    {
                        System.out.println("No user with that name found!"); //display error message
                    }
                }
            }

        //since we had a user, lets update their information.
           if (userExists)
            {
                updateInfo(user, id); //add proteins to their records
            }

           return id;
        } //end checkUserExistence()


    //This method allows the users to add proteins to their records and view the whole information from the text file
        public static void updateInfo (ArrayList <CreateUser> user, int id)
        {
            Scanner scan = new Scanner(System.in);  //new scanner object
            System.out.println("What would you like to update?");  //prompting the user
            System.out.println("1. Add Proteins");
            System.out.println("2. Show all stored user information");

            int biChoice = 0;  //this will hold their input

            try
            {
                biChoice = scan.nextInt();  //getting the choice (1 or 2)

                //if their input is not between 1 and 2,
                while (biChoice < 0 || biChoice > 2)
                {
                    System.out.println("Invalid entry. Enter only 1 or 2.");  //issue an error message
                    biChoice = scan.nextInt();      //take the input again
                }

            } catch (InputMismatchException error)      //catch anything else apart from integers
            {
                System.out.println("Input mismatch! Enter only the integers shown!");  //display the error message
            }

            //if they choose 1
            if (biChoice == 1)
            {
                if (user.isEmpty()) //check to see if the array list is empty
                {
                    //they have to create a user before proceeding
                    System.out.println("No user exists! Create one before accessing any information..");
                }

                //else if one exists,
                else
                {
                    double proteinFromUSer = GetFood.inputFood(); //show the food and add proteins

                    user.get(id).setProteinTotal(proteinFromUSer); //accumulate the total protein for the user
                }
            }

            //else if they choose 2,
            else if (biChoice == 2)
            {
                userInfo.showAllUserInfo();    //read the text file and show all user information
            }

        } //end updateInfo()


    //This method shows the user if they under/overate and offers some tips to them upon program exit.
    public static void showResults(ArrayList <CreateUser> user, int id)
    {
        //this shows what their total requirement for the day was based on their weight and exercise intensity
        System.out.println("The total protein requirement for you per day is: " + user.get(id).getProteinNeeds() +
                " grams (g). You consumed a total of " + user.get(id).getProteinTotal() + " grams(g) of protein.");

        //if they met their requirement
        if (user.get(id).getProteinTotal() == user.get(id).getProteinNeeds())
        {
            System.out.println("Thus, you have met your protein intake goal for today!");
            System.out.println(" . . .");
            System.out.println(". o o .");
            System.out.println(". \\_/ .");
            System.out.println(" . . .");
        }

        //if they under ate
        else if (user.get(id).getProteinTotal() < user.get(id).getProteinNeeds())
        {

            System.out.println("Your intake was below the recommended protein goal for today!");
            System.out.println("  . . . ");
            System.out.println(". T   T .");
            System.out.println(". |   | .");
            System.out.println("  . . . ");

            //converting protein needs to 2 decimal places
            BigDecimal needs = BigDecimal.valueOf(user.get(id).getProteinNeeds());
            needs = needs.setScale(2, RoundingMode.HALF_UP);

            //converting total protein eaten to 2 decimal places
            BigDecimal total = BigDecimal.valueOf(user.get(id).getProteinTotal());
            total = total.setScale(2, RoundingMode.HALF_UP);

            //calculating by how much they under ate in 2 decimal places
            BigDecimal result = BigDecimal.valueOf((needs.doubleValue() - total.doubleValue()));
            result = result.setScale(2, RoundingMode.HALF_UP);

            System.out.println("\n\nYou under ate this amount: " + result + " grams"); //deficient by how much?

            //offering tips
            System.out.println("Deficient intake can break down other muscle fibers to replenish the ones you worked out!" +
                    " Not to mention, delaying gains!");
        }

        //if they over ate
        else if (user.get(id).getProteinTotal() > user.get(id).getProteinNeeds())
        {
            System.out.println("Your intake was above the recommended protein goal for today!");
            System.out.println("  . . . .");
            System.out.println(". ==   == .");
            System.out.println(".    _    .");
            System.out.println("  . . . .");

            //converting protein needs to 2 decimal places
            BigDecimal needs = BigDecimal.valueOf(user.get(id).getProteinNeeds());
            needs = needs.setScale(2, RoundingMode.HALF_UP);

            //converting total protein eaten to 2 decimal places
            BigDecimal total = BigDecimal.valueOf(user.get(id).getProteinTotal());
            total = total.setScale(2, RoundingMode.HALF_UP);

            //calculating by how much they over ate in 2 decimal places
            BigDecimal result = BigDecimal.valueOf(total.doubleValue() - needs.doubleValue());
            result = result.setScale(2, RoundingMode.HALF_UP);

            System.out.println("\n\nYou over ate this amount: " + result + " grams.");  //over ate by how much?

            //offering tips
            System.out.println("Excess intake can put extra stress on your kidneys and liver as the liver will have to" +
                    "break down those proteins into nitrogenous wastes while the kidneys will have to expel them.");

        }

    } //end showResults

} //end class Display
