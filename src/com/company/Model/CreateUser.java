package com.company.Model;
import java.io.File;                        //to read from a file
import java.io.FileNotFoundException;       //for file exceptions
import java.io.FileWriter;                  //to write to a file
import java.io.IOException;                 //for I/O exception
import java.util.Scanner;                   //for I/O
import com.company.View.*;                  //importing package View to use it's class

//This class creates a new user
public class CreateUser
{
    private String firstName;               //user's first name
    private String lastName;                //user's last name
    private int age;                        //user's age
    private double height;                  //user's height
    private double weight;                  //user's weight ///////for now
    private String exerciseIntensity;       //user's exercise intensity level

    //Constructor for the class
    public CreateUser()
    {
        setFirstName();                     //sets user's first name
        setLastName();                      //sets user's last name
        setAge();                           //sets user's age
        setHeight();                        //sets user's height
        setWeight();                        //sets user's weight
        setExerciseIntensity();             //sets user's exercise intensity
    }

    //gets user's first name
    public String getFirstName()
    {
        return firstName;
    }

    //sets user's first name
    public void setFirstName()
    {
        firstName = Display.firstName();
    }

    //gets user's last name
    public String getLastName()
    {
        return lastName;
    }

    //sets user's last name
    public void setLastName()
    {
        lastName = Display.lastName();
    }

    //gets user's age
    public int getAge()
    {
        return age;
    }

    //sets user's age
    public void setAge()
    {
        age = Display.age();
    }

    //gets user's height
    public double getHeight()
    {
        return height;
    }

    //sets user's height
    public void setHeight()
    {
        height = Display.height();
    }

    //gets user's weight
    public double getWeight()
    {
        return weight;
    }

    //sets user's weight
    public void setWeight()
    {
        weight = Display.weight();
    }

    //gets user's exercise intensity
    public String getExerciseIntensity()
    {
        return exerciseIntensity;
    }

    //sets user's exercise intensity
    public void setExerciseIntensity()
    {
        exerciseIntensity = Display.exercise();
    }

    //This block  writes the user's data to a text file
    public void storeData(FileWriter userFile)
    {
        String userData = "";

        try
        {
            //stores the info to write in the string userData
            userData = userData.concat("First name: " + getFirstName() + "\n" + "Last name: " + getLastName() + "\n" +
                    "Age: " + getAge() + "\n" + "Height: " + getHeight() + "\n" + "Weight: " + getWeight() + "\n" +
                    "Exercise intensity: " + getExerciseIntensity() + "\n\n");

            //writing to the text file from the userData
            userFile.write(userData);

        } catch (IOException error) //catching error if the file did not get created
        {
            error.printStackTrace();
        }

    }//end storeData()

//This block reads the information of the protein values from the ProteinChart text file.
    public static void fileInfo()
    {
        //file to read from
        File file = new File("src/com/ProteinChart.txt");

        //Scanner object to work with
        Scanner scan;
        {
            try
            {
                //try to create a new object if the text file exists
                scan = new Scanner(file);

                //while there is data in the text file
                while (scan.hasNextLine())
                {
                    //read each line
                    System.out.println(scan.nextLine());
                }
            } catch (FileNotFoundException error) //throw error if the file does not exist or there was error reading from it
            {
                error.printStackTrace();
            }
        }
    } //end fileInfo()

} //end class CreateUser
