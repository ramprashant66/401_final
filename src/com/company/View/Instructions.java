package com.company.View;

/*
    This class displays the instructions on how to navigate through this program.
 */
public final class Instructions
{
    //This method displays the instructions
    public static void instructions()
    {
        System.out.println("\n...................................................................................................." +
                        "................\n" +
 "       I welcome you to this SIMPLE PROTEIN CALCULATOR APPLICATION!" +
        "\nAfter executing; you will be provided with various menu options. " +
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
         "\n-->> It will ask you for your first name, last name, age, weight in pounds, height in feet and " +
                "\nexercise intensity level (sedentary, light, moderate and heavy)." +
         "\n-->> Once a user has been created, you can start adding proteins by choosing the option (2) from the" +
                "\nmain menu." +
         "\n-->> Furthermore, you do not need to re-create a user which you had created prior, each time you run " +
                "\nthe program." +


         "\n\n2. Existing User Actions " +
         "\n-->> This option allows either a newly created user or an existing user to add proteins to their records" +
         "\n     and, to view the whole record saved on the device of all users. " +
         "\n-->> Option (1.), will check it's arrayList for any users which were created recently (before program exit). " +
         "\n     If it cannot find any, then it will check its text file for any data. If it cannot find any user, " +
         "\n     it will ask you to create a user before you could use these options." +
         "\n     If it is able to find a user, then it will ask you to enter the user's first name to check if that user" +
         "\n     exists. If the name does not match, it will tell you that no user of that name exists." +
         "\n     However, if the name matches, then you can start adding proteins. If you decide to end the protein " +
         "\n     addition but do not quit the program and then try to come back and re-add proteins, the program " +
         "\n     will not re-ask you for your first name. You can just start adding them :)" +
         "\n-->> You can keep accumulating the proteins until you decide to quit the program. " +
         "\n-->> It will then either create a hard copy of the user data (if one does not exist) or, update the" +
         "\n     current one if there exists one already." +
         "\n-->> Option (2.), will read the whole user information stored on the device. If the file is empty (no user)," +
                "\nit will let you know." +
         "\n<<[NOTE]>> A user NEEDS to exist before this option can be used." +


         "\n\n3. Display the program's Protein Chart" +
         "\n-->> This option allows you to view all the foodstuff, their quantities and their protein values currently " +
                "\nin the program." +


         "\n\n4. Display the program instructions" +
         "\n-->> This option display this message." +


         "\n\n5. Exit this program " +
         "\n-->> This option quits the program gracefully. If there was any protein value added, it gets updated to the " +
                "\nuser's record in the text file. " +
         "\n...................................................................................................." +
          "................\n" );

          System.out.println("++++++++COPYRIGHT: PRASHANT RAM++++++++");

    } //end instructions()

} //end class Instructions
