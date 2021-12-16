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
        food.add(new FoodStuff("Chicken breast", 1, "chicken breast", 37));
        food.add(new FoodStuff("Chicken Drumstick", 1, "drumstick", 22));
        food.add(new FoodStuff("Chicken Wings", 1, "wing", 4.5));
        food.add(new FoodStuff("Chicken Thigh", 1, "thigh",31));
        food.add(new FoodStuff("Chicken Whole", 1, "whole chicken", 163));
        food.add(new FoodStuff("Chicken egg", 1, "egg",6.3));
        food.add(new FoodStuff( "Chicken Corn Soup", 1,"bowl",14));

        //Seafood
        food.add(new FoodStuff("Oyster", 1, "oyster",4.7));
        food.add(new FoodStuff("Calamari", 1, "ring",18));
        food.add(new FoodStuff("Fish fillet", 1, "fillet",38));
        food.add(new FoodStuff("Fish Sticks", 1, "stick",6.3));
        food.add(new FoodStuff("Tuna in Olive Oil", 1, "can",19 ));
        food.add(new FoodStuff("Sardine in Olive Oil", 1, "can",22));
        food.add(new FoodStuff("Salmon", 1, "ounce salmon", 5.81));
        food.add(new FoodStuff("Crab leg", 1, "leg",26));
        food.add(new FoodStuff("Shrimps", 1, "shrimp",1.1));

        //Lamb + Goat
        food.add(new FoodStuff("Lamb Shank", 1, "shank",22));
        food.add(new FoodStuff("Lamb Shoulder Chop", 1, "chop",19));
        food.add(new FoodStuff("Lamb Shoulder Kebab", 1, "8.8 ounce",19));
        food.add(new FoodStuff("Lamb Slice", 1, "pound lamb",59));
        food.add(new FoodStuff("Goat", 1, "pound goat", 93.4));

        //Beef
        food.add(new FoodStuff("Steak", 1, "steak",58));

        //Pork
        food.add(new FoodStuff("Bacon strips", 1, "strip",4));
        food.add(new FoodStuff("Pork belly", 1, "pork belly",42));
        food.add(new FoodStuff("Pork skin", 1, "ounce pork skin",17));
        food.add(new FoodStuff("Pork tenderloin", 1, "pound loin", 95.3));

        //Duck
        food.add(new FoodStuff("Duck breast", 3, "duck breast",21));
        food.add(new FoodStuff("Duck drumstick", 1, "drumstick",50.6));
        food.add(new FoodStuff("Duck Whole", 1, "whole duck",27));
        food.add(new FoodStuff("Duck eggs", 1, "egg",9));
        food.add(new FoodStuff("Balut", 1, "egg",13));

        //Turkey
        food.add(new FoodStuff("Turkey Breast", 1, "turkey breast", 37));
        food.add(new FoodStuff("Turkey Drumstick", 1, "drumstick", 22));
        food.add(new FoodStuff("Turkey Sausage", 1, "stick", 3.5));
        food.add(new FoodStuff("Turkey Whole", 1, "turkey whole",32));
        food.add(new FoodStuff("Turkey Deli", 1, "ounce", 7.7));


        //Fast food
        food.add(new FoodStuff("McDonald's Chicken McNuggets",1 ,"nugget",1.4));
        food.add(new FoodStuff("McDonal's Big Mac Burger",1, "burger",25));
        food.add(new FoodStuff("McDonal's Quarter Pounder Burger", 1, "burger", 30));
        food.add(new FoodStuff("McDonal's McDouble Burger",1, "burger", 22));
        food.add(new FoodStuff("McDonal's Cheese Burger", 1,"burger",15));
        food.add(new FoodStuff("McDonal's Ham Burger", 1,"burger",12));
        food.add(new FoodStuff("McDonal's Crispy Chicken Sandwich",1, "burger", 27));
        food.add(new FoodStuff("McDonal's McChicken", 1, "burger",14));
        food.add(new FoodStuff("McDonal's Filet-O-Fish",1,"burger", 16));
        food.add(new FoodStuff("McDonald's Bacon, Egg & Cheese Biscuit breakfast sandwich",1, "sandwich",17));

        food.add(new FoodStuff("KFC Crispy Colonel's Sandwich", 1,"sandwich",24));
        food.add(new FoodStuff("KFC Chicken Breast [Original]",1,"breast", 39));
        food.add(new FoodStuff("KFC Chicken DrumStick [Original]",1,"drumstick",12));
        food.add(new FoodStuff( "KFC Chicken Thigh [Original]", 1,"thigh",19));
        food.add(new FoodStuff("KFC Chicken Wing [Original]", 1,"wing",10));
        food.add(new FoodStuff("KFC Kentucky Fried Wings - Un-sauced", 1,"wing",5));

        //Veggies
        food.add(new FoodStuff("Mushrooms", 1, "cup",0.3));
        food.add(new FoodStuff("Soybean", 1, "cup",31));
        food.add(new FoodStuff("Tofu", 0.2, "ounce block",9.1));
        food.add(new FoodStuff("Lentils", 1, "cup",18));
        food.add(new FoodStuff("Pinto beans", 1, "cup",15));
        food.add(new FoodStuff("Chickpea", 1, "cup",15));
        food.add(new FoodStuff("Kidney beans", 1, "cup",15));
        food.add(new FoodStuff("Corn", 1, "ear - medium",3.5));
        food.add(new FoodStuff("Quinoa", 1, "cup",8.2));
        food.add(new FoodStuff("Buckwheat", 1, "cup",5.7));
        food.add(new FoodStuff("Broccoli", 1, "cup",4));

        //Dairy
        food.add(new FoodStuff("Whole milk", 1, "250ml glass",6.8));
        food.add(new FoodStuff("2% fat milk", 1, "250ml glass",9.7));
        food.add(new FoodStuff("1% fat milk", 1, "250ml glass",8.2));
        food.add(new FoodStuff("Skim milk", 1, "250ml glass",8.3));
        food.add(new FoodStuff("Fat free milk", 1, "250ml glass",8.3));
        food.add(new FoodStuff("Almond milk", 1, "250ml glass",1.1));
        food.add(new FoodStuff("Cottage Cheese", 0.5, "cup",12));
        food.add(new FoodStuff("Cheese slice", 1, "slice",6.4));
        food.add(new FoodStuff("Butter", 1, "teaspoon", 0.1));

        //Snacks
        food.add(new FoodStuff("Granola bar", 1, "bar", 1.6));
        food.add(new FoodStuff("Almonds", 1, "almond",0.3));
        food.add(new FoodStuff("Cashew Nuts", 1, "cashew", 0.2));
        food.add(new FoodStuff("Rolled oats", 0.5, "cup",5.3));
        food.add(new FoodStuff("Chocolate bar", 1, "bar",3.4));
        food.add(new FoodStuff("Peanuts",1, "peanut",0.2));
        food.add(new FoodStuff("Pistachio", 1, "kernel",0.1 ));
        food.add(new FoodStuff("Protein Bar", 1, "bar",20));
        food.add(new FoodStuff("Peanut Butter", 1, "tablespoon", 3.5 ));

        //Protein shake
        food.add(new FoodStuff("Whey Protein", 1, "scoop",30));
        food.add(new FoodStuff("Body Fortress: Whey Protein", 1, "scoop",30));
        food.add(new FoodStuff("Nitro Tech: Whey Isolate", 1, "scoop",30));
        food.add(new FoodStuff("Arnold Iron: Whey Protein", 1, "scoop", 22));
        food.add(new FoodStuff("Optimum Nutrition Gold Standard: Whey Protein", 1, "scoop", 24));

        return food;

    } //end FoodStuff()

} //end class FoodStuff
