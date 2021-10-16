package com.company.Model;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import com.company.View.*;


public class CreateUser
{
    private String firstName;
    private String lastName;
    private int age;
    private double height;
    private double weight;
    private String exerciseIntensity;

    public CreateUser()
    {
        setFirstName();
        setLastName();
        setAge();
        setHeight();
        setWeight();
        setExerciseIntensity();
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName()
    {
        firstName = Display.firstName();
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName()
    {
        lastName = Display.lastName();
    }

    public int getAge()
    {
        return age;
    }

    public void setAge()
    {
        age = Display.age();
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight()
    {
        height = Display.height();
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight()
    {
        weight = Display.weight();
    }

    public String getExerciseIntensity()
    {
        return exerciseIntensity;
    }

    public void setExerciseIntensity()
    {
        //Set exerciseIntensity
        exerciseIntensity = Display.exercise();
    }

    public void storeData(FileWriter userFile)
    {
        String userData = "";

        try
        {
            //stores the info to write in the string
            userData = userData.concat("First name: " + getFirstName() + "\n" + "Last name: " + getLastName() + "\n" +
                    "Age: " + getAge() + "\n" + "Height: " + getHeight() + "\n" + "Weight: " + getWeight() + "\n" +
                    "Exercise intensity: " + getExerciseIntensity() + "\n\n");
            userFile.write(userData); //writing to file from the string

        } catch (IOException error)
        {
            error.printStackTrace();
        }

    }//end storeData


    public static void fileInfo()
    {
        File file = new File("src/com/ProteinChart.txt");
        Scanner scan;
        {
            try
            {
                //try to create a new object if the text file exists
                scan = new Scanner(file);

                //while there is data in the text file
                while (scan.hasNextLine())
                {
                    //read lines
                    System.out.println(scan.nextLine());
                }
            } catch (FileNotFoundException error) //throw error if the file does not exist or there was error reading from it
            {
                error.printStackTrace();
            }
        }
    }
} //end class CreateUser
