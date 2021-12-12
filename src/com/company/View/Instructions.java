package com.company.View;

public class Instructions
{
    public static void instructions()
    {
        System.out.println("\n...................................................................................................." +
                        "................\n" +
 "       I welcome you to this simple protein calculator program! After running; you will be provided with various menu options. " +
        "\nThis guide aims to aid you in the program's usage and navigation. " +
                "\n\n+__PROGRAM MENU AND SUB-MENUS__+" +
                "\n1. Add a new user to the program" +
                "\n2. Existing User Actions" +
                "\n             |" +
                "\n             |_______ 1. Add Proteins" +
                "\n             |" +
                "\n             |_______ 2. Show all stored user information" +
                "\n3. Display the program's Protein Chart" +
                "\n4. Display the program instructions" +
                "\n5. Exit this program" +

        "\n\n1. Add a new user to the program " +
         "\n-->> This allows you create a user in the program." +
         "\n-->> It'll ask you for your first name, last name, age, weight in pounds, height in feet and exercise intensity." +
         "\n-->> Once a user has been created, you can start adding proteins by choosing the option below." +
         "\n-->> Once a user has been created, you not need to recreate him/her each time you run the program." +


         "\n\n2. Existing User Actions " +
         "\n-->> This option allows either a newly created user or an existing user from previous iterations to add proteins " +
         "\n     to their records and, to view the whole record saved on the device of all users. " +
         "\n-->> Option (1.) will check it's arrayList for any users which were created recently (before program exit). If" +
         "\n     it cannot find any, then it will check its text file for any data. If it cannot find anything, it will " +
         "\n     ask you to create a user before moving on." +
         "\n    If it is able to find any user, then it will ask you to enter the user's first name to check if that user" +
         "\n     exists. If the name does not match, it will tell you that no user of that name exists." +
         "\n     However, if the name matches, then you can start adding proteins. If you decide to end the protein addition" +
         "\n     but do not quit the program and then try to add proteins again, then it will not re-ask you for " +
         "\n     your name." +
         "\n-->> You can keep adding them consecutively and the program will keep accumulating them until you quit the program. " +
         "\n-->> It will then either create a hard copy of the user data (if one does not exist) or, update the" +
         "\n     current one if there exists one already." +
         "\n-->> Option (2.) will read the whole user information stored on the device." +
         "\n<<[NOTE]>> A user NEEDS to exist before this option can be used." +


         "\n\n3. Display the program's Protein Chart" +
         "\n-->> This option allows you to view all the foodstuff, their quantity and their protein values currently in the program." +


         "\n\n4. Display the program instructions" +
         "\n-->> This option display this message." +


         "\n\n5. Exit this program " +
         "\n-->> This option quits the program gracefully. If there was any protein value added, it gets updated to the user's record in the text file. " +
         "\n...................................................................................................." +
          "................\n" );

          System.out.println("++++++++COPYRIGHT PRASHANT RAM++++++++");

    }

} //end class Instructions
