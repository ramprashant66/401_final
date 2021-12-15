package com.company.Model;

import java.util.ArrayList;     // to use array lists

/*
    This class is responsible for making food objects and acts like a local, informal database for them.
 */
public class FoodStuff
{
    private final String foodName;      // food name
    private final String unit;          // food's unit (e.g., ounce/singles/cup, etc)
    private final double quantity;      // food's quantity
    private final double content;       // food's protein content

    //This is default constructor for the FoodStuff object
    public FoodStuff(String foodName, double quantity, String unit, double content)
    {
        this.foodName = foodName;       //sets the name
        this.quantity = quantity;       //sets the quantity
        this.unit = unit;               //sets the unit
        this.content = content;         //sets the protein content
    }

    //This method gets the Food's food name
    public String getFoodName()
    {
        return foodName;
    }

    //This method gets the Food's unit size
    public String getUnit() {
        return unit;
    }

    //This method gets the Food's quantity
    public double getQuantity()
    {
        return quantity;
    }

    //This method gets the Food's protein content
    public double getContent()
    {
        return content;
    }

    //This method create various food objects
    public static ArrayList<FoodStuff>  foodStuff()
    {
        ArrayList<FoodStuff> food = new ArrayList<>();  //this arrayList holds all the FoodStuff objects

        //Chicken
        food.add(new FoodStuff("chicken breast", 1, "Pound", 37));
        food.add(new FoodStuff("Chicken Drumstick", 1, "Drumstick", 22));
        food.add(new FoodStuff("Chicken Wings", 1, "Wing", 4.5));
        food.add(new FoodStuff("Chicken Thigh", 1, "Unit",31));
        food.add(new FoodStuff("Chicken Whole", 1, "Unit", 163));
        food.add(new FoodStuff("Chicken egg", 1, "Unit",6.3));
        food.add(new FoodStuff( "Chicken Corn Soup", 1,"Bowl",14));

        //Seafood
        food.add(new FoodStuff("Oyster", 1, "Unit",4.7));
        food.add(new FoodStuff("Calamari", 1, "Ring",18));
        food.add(new FoodStuff("Fish fillet", 1, "Fillet",38));
        food.add(new FoodStuff("Fish Sticks", 1, "Stick",6.3));
        food.add(new FoodStuff("Tuna in Olive Oil", 1, "Can",19 ));
        food.add(new FoodStuff("Sardine in Olive Oil", 1, "Can",22));
        food.add(new FoodStuff("Salmon", 1, "Ounce", 5.81));
        food.add(new FoodStuff("Crab leg", 1, "Leg",26));
        food.add(new FoodStuff("Shrimps", 1, "Shrimp",1.1));

        //Lamb + Goat
        food.add(new FoodStuff("Lamb Shank", 1, "Unit",22));
        food.add(new FoodStuff("Lamb Shoulder Chop", 1, "Unit",19));
        food.add(new FoodStuff("Lamb Shoulder Kebab", 1, "8.8 ounce",19));
        food.add(new FoodStuff("Lamb Slice", 1, "Pound",59));
        food.add(new FoodStuff("Goat", 1, "Pound", 93.4));

        //Beef
        food.add(new FoodStuff("Steak", 1, "Steak",58));

        //Pork
        food.add(new FoodStuff("Bacon strips", 1, "Strip",4));
        food.add(new FoodStuff("Pork belly", 1, "Unit",42));
        food.add(new FoodStuff("Pork skin", 1, "Ounce",17));
        food.add(new FoodStuff("Pork tenderloin", 1, "Pound", 95.3));

        //Duck
        food.add(new FoodStuff("Duck breast", 3, "Breast",21));
        food.add(new FoodStuff("Duck drumstick", 1, "Drumstick",50.6));
        food.add(new FoodStuff("Duck Whole", 1, "Unit",27));
        food.add(new FoodStuff("Duck eggs", 1, "Egg",9));
        food.add(new FoodStuff("Balut", 1, "Egg",13));

        //Turkey
        food.add(new FoodStuff("Turkey Breast", 1, "Pound", 37));
        food.add(new FoodStuff("Turkey Drumstick", 1, "Drumstick", 22));
        food.add(new FoodStuff("Turkey Sausage", 1, "Stick", 3.5));
        food.add(new FoodStuff("Turkey Whole", 1, "Unit",32));
        food.add(new FoodStuff("Turkey Deli", 1, "Ounce", 7.7));


        //Fast food
        food.add(new FoodStuff("McDonald's Chicken McNuggets",1 ,"Nugget",1.4));
        food.add(new FoodStuff("McDonal's Big Mac Burger",1, "Burger",25));
        food.add(new FoodStuff("McDonal's Quarter Pounder Burger", 1, "Burger", 30));
        food.add(new FoodStuff("McDonal's McDouble Burger",1, "Burger", 22));
        food.add(new FoodStuff("McDonal's Cheese Burger", 1,"Burger",15));
        food.add(new FoodStuff("McDonal's Ham Burger", 1,"Burger",12));
        food.add(new FoodStuff("McDonal's Crispy Chicken Sandwich",1, "Burger", 27));
        food.add(new FoodStuff("McDonal's McChicken", 1, "Burger",14));
        food.add(new FoodStuff("McDonal's Filet-O-Fish",1,"Burger", 16));
        food.add(new FoodStuff("McDonald's Bacon, Egg & Cheese Biscuit breakfast sandwich",1, "Sandwich",17));

        food.add(new FoodStuff("KFC Crispy Colonel's Sandwich", 1,"Sandwich",24));
        food.add(new FoodStuff("KFC Chicken Breast [Original]",1,"Breast", 39));
        food.add(new FoodStuff("KFC Chicken DrumStick [Original]",1,"Drumstick",12));
        food.add(new FoodStuff( "KFC Chicken Thigh [Original]", 1,"Thigh",19));
        food.add(new FoodStuff("KFC Chicken Wing [Original]", 1,"Wing",10));
        food.add(new FoodStuff("KFC Kentucky Fried Wings - Unsauced", 1,"WIng",5));

        //Veggies
        food.add(new FoodStuff("Mushrooms", 1, "Cup",0.3));
        food.add(new FoodStuff("Soybean", 1, "Cup",31));
        food.add(new FoodStuff("Tofu", 0.2, "ounce block",9.1));
        food.add(new FoodStuff("Lentils", 1, "Cup",18));
        food.add(new FoodStuff("Pinto beans", 1, "Cup",15));
        food.add(new FoodStuff("Chickpea", 1, "Cup",15));
        food.add(new FoodStuff("Kidney beans", 1, "Cup",15));
        food.add(new FoodStuff("Corn", 1, "Ear - medium",3.5));
        food.add(new FoodStuff("Quinoa", 1, "Cup",8.2));
        food.add(new FoodStuff("Buckwheat", 1, "Cup",5.7));
        food.add(new FoodStuff("Broccoli", 1, "Cup",4));

        //Dairy
        food.add(new FoodStuff("Whole milk", 1, "250ml glass",6.8));
        food.add(new FoodStuff("2% fat milk", 1, "250ml glass",9.7));
        food.add(new FoodStuff("1% fat milk", 1, "250ml glass",8.2));
        food.add(new FoodStuff("Skim milk", 1, "250ml glass",8.3));
        food.add(new FoodStuff("Fat free milk", 1, "250ml glass",8.3));
        food.add(new FoodStuff("Almond milk", 1, "250ml glass",1.1));
        food.add(new FoodStuff("Cottage Cheese", 0.5, "Cup",12));
        food.add(new FoodStuff("Cheese slice", 1, "Slice",6.4));
        food.add(new FoodStuff("Butter", 1, "Teaspoon", 0.1));

        //Snacks
        food.add(new FoodStuff("Granola bar", 1, "Bar", 1.6));
        food.add(new FoodStuff("Almonds", 1, "Almond",0.3));
        food.add(new FoodStuff("Cashew Nuts", 1, "Cashew", 0.2));
        food.add(new FoodStuff("Rolled oats", 0.5, "Cup",5.3));
        food.add(new FoodStuff("Chocolate bar", 1, "Bar",3.4));
        food.add(new FoodStuff("Peanuts",1, "Peanut",0.2));
        food.add(new FoodStuff("Pistachio", 1, "Kernel",0.1 ));
        food.add(new FoodStuff("Protein Bar", 1, "Bar",20));
        food.add(new FoodStuff("Peanut Butter", 1, "Tablespoon", 3.5 ));

        //Protein shake
        food.add(new FoodStuff("Whey Protein", 1, "Scoop",30));
        food.add(new FoodStuff("Body Fortress: Whey Protein", 1, "Scoop",30));
        food.add(new FoodStuff("Nitro Tech: Whey Isolate", 1, "Scoop",30));
        food.add(new FoodStuff("Arnold Iron: Whey Protein", 1, "Scoop", 22));
        food.add(new FoodStuff("Optimum Nutrition Gold Standard: Whey Protein", 1, "Scoop", 24));

        return food;

    } //end FoodStuff()

} //end class FoodStuff
