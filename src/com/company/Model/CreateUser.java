package com.company.Model;
import java.io.FileWriter;                  // for file I/O
import java.io.IOException;                 // for I/O exception
import java.math.BigDecimal;                // for rounding doubles to 2 decimal places
import java.math.RoundingMode;
import java.text.SimpleDateFormat;          // to use date and time for user records
import java.util.Date;                      // to use the date format for user records

import com.company.View.*;                  //importing package View to use it's class

/*
    This class deals everything user related including either the creation of a new user
    or updating the current information on existing user(s).
 */
public class CreateUser
{
    private String firstName;               // user's first name
    private String lastName;                // user's last name
    private int age;                        // user's age
    private double height;                  // user's height in feet
    private double weight;                  // user's weight in pounds
    private double exerciseIntensityValue;  // user's exercise intensity level
    private double proteinTotal;            // user's total protein intake for the session
    private double proteinNeeds;            // user's total protein requirement for the day/session
    boolean returningUser;                  // is this a new user or a returning user?

    //Default constructor for the creation of new users
    public CreateUser()
    {
        setFirstName();                           // sets user's first name
        setLastName();                            // sets user's last name
        setAge();                                 // sets user's age
        setHeight();                              // sets user's height in feet
        setWeight(isReturningUser());             //sets user's weight in pounds and sees if the user is current or new
        setExerciseIntensity(isReturningUser());  //sets user's exercise intensity and sees if the user is current or new
        proteinTotal = 0;                         // setting default value for protein eaten for the user upon creation
        setProteinNeeds();                        // calculates the protein requirement based on the weight and exercise
        //                                           intensity level
        setReturningUser(false);                  // new users are not returning users by default

    } //end CreateUser()

    //This is constructor overload which sets the first name of the user when explicitly called.
    public CreateUser(String firstName)
    {
        this.firstName = firstName;
    } //end CreateUser()

    //This method gets the user's first name
    public String getFirstName()
    {
        return firstName;
    } //end getFirstName()

    //This method sets the user's first name
    public void setFirstName()
    {
        firstName = Display.firstName();
    } //end setFirstName()

    //This method gets the user's last name
    public String getLastName()
    {
        return lastName;
    } //end getLastName()

    //This method sets the user's last name
    public void setLastName()
    {
        lastName = Display.lastName();
    } //end setLastName()


    //This method gets the user's age
    public int getAge()
    {
        return age;
    } //end getAge()

    //This method sets the user's age
    public void setAge()
    {
        age = Display.age();
    } //end setAge()


    //This method gets the user's height
    public double getHeight()
    {
        return height;
    } //end getHeight()

    //This method sets the user's height
    public void setHeight()
    {
        height = Display.height();
    } //end setHeight()

    //This method gets the user's weight
    public double getWeight()
    {
        return weight;
    } //end getWeight()

    //This method sets the user's weight
    public void setWeight(boolean returningUser)
    {
        weight = Display.weight(returningUser); //invokes the method from View package
    } //end setWeight()

    //This method gets the user's exercise intensity level
    public double getExerciseIntensity()
    {
        return exerciseIntensityValue;
    } //end getExerciseIntensity()

    //This method sets the user's exercise intensity level
    public void setExerciseIntensity(boolean returningUser)
    {
        exerciseIntensityValue = Display.exercise(returningUser); //invokes the method from View package
    } //end setExerciseIntensity()

    //This method sets the user's total protein consumed value
    public void setProteinTotal(double protein)
    {
        proteinTotal += protein;    // keeps a running total
    } //end setProteinTotal()

    //This method gets the user's total protein consumed
    public double getProteinTotal()
    {
        BigDecimal proteinForUser = BigDecimal.valueOf(proteinTotal);
        proteinForUser = proteinForUser.setScale(2, RoundingMode.HALF_UP);
        return proteinForUser.doubleValue();        // rounding off the value to 2 decimal places
    } //end getProteinTotal()

    //This method sets the total protein required by the user
    public void setProteinNeeds()
    {
        BigDecimal needs = BigDecimal.valueOf(weight / 2.2);
        needs = needs.setScale(2, RoundingMode.HALF_UP);    //rounding off the weight to 2 decimal places after
        //                                                            changing it from pounds to kilograms.

        BigDecimal temp = BigDecimal.valueOf(exerciseIntensityValue * needs.doubleValue());
        temp = temp.setScale(2, RoundingMode.HALF_UP);      //rounding off the value from weight * exercise intensity
        //                                                          to get the required amount of protein.

        proteinNeeds = (temp.doubleValue());
    } //end setProteinNeeds()

    //This method gets the total protein required by the user
    public double getProteinNeeds()
    {
        return proteinNeeds;
    } //end getProteinNeeds()

    //This method returns if the user is a current user or a new user
    public boolean isReturningUser()
    {
        return returningUser;
    } //end isReturnUser()

    //This method sets if the user is current or new
    public void setReturningUser(boolean returningUser)
    {
        this.returningUser = returningUser;
    } //end setReturningUser()

    //This method writes the user's data to a text file to create a hard copy for future use
    public void storeData(FileWriter userFile)
    {
        String userData = "";       // this will hold the data to be written to the text file

        try
        {
            BigDecimal roundedWeight = BigDecimal.valueOf(getWeight() / 2.2);       //rounding the weight in kilograms
            roundedWeight = roundedWeight.setScale(2, RoundingMode.HALF_UP);

            if (!(returningUser))       //write if the user is new
            {
                //stores all the information in the string we created earlier
                userData = userData.concat("First name: " + getFirstName() + "\n" + "Last name: " + getLastName() + "\n" +
                        "Age: " + getAge() + "\n" + "Height: " + getHeight() + " feet\n" + "Weight: " + getWeight() + " lbs/ " +
                        (roundedWeight.doubleValue()) + " kgs" + "\n" +
                        "Exercise intensity: " + getExerciseIntensity() + "\n");
            }

            else    //else write this if the user current
            {
                //stores all the information in the string we created earlier
                userData = userData.concat("-------Returning User-------\n" + "First name: " + getFirstName() + "\n" +
                        "Weight: " + getWeight() +  " lbs/ " + (roundedWeight.doubleValue()) + " kgs" + "\n" +
                        "Exercise intensity: " + getExerciseIntensity() + "\n");
            }


            // write the string to the text file
            userFile.append(userData);

        } catch (IOException error) //catching error if the file did not get created
        {
            Menu.fileNotCreated(); //print the error message
        }

    } //end storeData()

    //This method write the protein part to user's data
    public void storeProtein(FileWriter userFile)
    {
        String userData = "";   // this will hold the data to be written to the text file

        Date currentDate = new Date();  //creation of a date object

        //we want the month, day, year, hour,minute and AM/PM written to the user's record.
        SimpleDateFormat simpleDate =  new SimpleDateFormat("MM/dd/yyyy hh:mm a");

        try
        {
            //stores all the information in the string we created earlier
            userData = userData.concat("Total Protein consumed: " + getProteinTotal() + " grams" + "\n" +
                    "Total required for the day: " + getProteinNeeds() + " grams" + "\n" + "Intake status: " +
                            (getProteinTotal() >= getProteinNeeds() ? "Met/Exceeded" : "Under eaten") + "\n" +
                    "Chrono: " + simpleDate.format(currentDate) + "\n\n");

            // write the string to the text file
            userFile.append(userData);

        } catch (IOException error) //catching error if the file did not get created
        {
            Menu.fileNotCreated();  //print the error message
        }

    }//end storeProtein()

} //end class CreateUser
