package com.company.Model;

import com.company.View.PromptsMessages;
import java.io.FileNotFoundException;       // for file, I/O exception
import java.io.FileReader;                  // for reading files
import java.util.Scanner;                   // for reading user input

/*
    This class reads all the stored user information from the text file into this console.
 */
public final class userInfo
{

    public static void showAllUserInfo()
    {
        String line = "";       // this string stores the read information from the text file

        try             // try to see if the file exists
        {
            FileReader reading = new FileReader("src/com/userFile.txt");    // read from this source
            Scanner readFile = new Scanner(reading);        //new reader object

            while (readFile.hasNextLine())          // while there is information to read
            {
                line = line.concat(readFile.nextLine() + "\n");         // read the information
            }

        } catch (FileNotFoundException error)       // catch the error if the file does not exist
        {
            PromptsMessages.noFileExists();       // print error message
        }

        if(line.isEmpty())      // if there is no information to read
        {
            // print the message that there is no data to read
            PromptsMessages.noDataToRead();
        }

      else // else if there is data to show
        {
            // display the data
            PromptsMessages.displayUserInfo(line);
        }

    } //end showAllUserInfo()

} //end class userInfo
