package com.company.Model;

import java.util.ArrayList;

public class FoodStuff
{
    private String foodName;
    private double quantity;
    private String unit;
    private double content;

    public FoodStuff(String foodName, double quantity, String unit, double content)
    {
        this.foodName = foodName;
        this.quantity = quantity;
        this.unit = unit;
        this.content = content;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getFoodName()
    {
        return foodName;
    }

    public void setFoodName(String foodName)
    {
        this.foodName = foodName;
    }

    public double getQuantity()
    {
        return quantity;
    }

    public void setQuantity(double quantity)
    {
        this.quantity = quantity;
    }

    public double getContent()
    {
        return content;
    }

    public void setContent(double content)
    {
        this.content = content;
    }

    public static ArrayList<FoodStuff>  foodStuff()
    {
        ArrayList<FoodStuff> food = new ArrayList<>();

        //chicken
        food.add(new FoodStuff("Chicken Breast", 1, "Pound", 37));
        food.add(new FoodStuff("Chicken Drumstick", 1, "Drumette", 22));
        food.add(new FoodStuff("Chicken Wings", 1, "1 Wingette", 4.5));
        food.add(new FoodStuff("Chicken Thigh", 1, "Unit",31));
        food.add(new FoodStuff("Chicken Whole", 1, "Unit", 163));
        food.add(new FoodStuff("Chicken egg", 1, "Unit",6.3));

        //seafood
        food.add(new FoodStuff("Oyster", 1, "Unit",4.7));
        food.add(new FoodStuff("Calamari", 1, "Ring",18));
        food.add(new FoodStuff("Fish fillet", 1, "Fillet",38));
        food.add(new FoodStuff("Fish Sticks", 1, "Stick",6.3));
        food.add(new FoodStuff("Crab leg", 1, "Leg",26));
        food.add(new FoodStuff("Shrimps", 1, "Shrimp",1.1));

        //lamb
        food.add(new FoodStuff("Lamb Shank", 1, "Unit",22));
        food.add(new FoodStuff("Lamb Shoulder Chop", 1, "Unit",19));
        food.add(new FoodStuff("Lamb Shoulder Kebab", 1, "8.8 ounce",19));
        food.add(new FoodStuff("Lamb Slice", 1, "Pound",59));


        //beef
        food.add(new FoodStuff("Steak", 1, "Steak",58));


        //pork
        food.add(new FoodStuff("Bacon strips", 1, "Strip",4));
        food.add(new FoodStuff("Pork belly", 1, "Unit",42));
        food.add(new FoodStuff("Pork skin", 1, "Ounce",17));


        //duck
        food.add(new FoodStuff("Duck breast", 3, "Breast",21));
        food.add(new FoodStuff("Duck drumstick", 1, "Drumette",50.6));
        food.add(new FoodStuff("Duck Whole", 1, "Unit",27));
        food.add(new FoodStuff("Duck eggs", 1, "Egg",9));
        food.add(new FoodStuff("Balut", 1, "Egg",13));

        //Turkey
        food.add(new FoodStuff("Turkey Breast", 1, "Pound", 37));
        food.add(new FoodStuff("Turkey Drumstick", 1, "Drumette", 22));
        food.add(new FoodStuff("Turkey Sausage", 1, "Stick", 3.5));
        food.add(new FoodStuff("Turkey Whole", 1, "Unit",32));
        food.add(new FoodStuff("Turkey Deli", 1, "Ounce", 7.7));


        //vegies
        food.add(new FoodStuff("Mushrooms", 1, "Cup",0.3));
        food.add(new FoodStuff("Soybean", 1, "Cup",31));
        food.add(new FoodStuff("Tofu", 0.2, "0.2 ounce block",9.1));
        food.add(new FoodStuff("Pinto beans", 1, "Cup",15));
        food.add(new FoodStuff("Chickpea", 1, "Cup",15));
        food.add(new FoodStuff("Kidney beans", 1, "Cup",15));
        food.add(new FoodStuff("Corn", 1, "Ear - medium",3.5));
        food.add(new FoodStuff("Quinoa", 1, "Cup",8.2));
        food.add(new FoodStuff("Buckwheat", 1, "Cup",5.7));
        food.add(new FoodStuff("Broccoli", 1, "Cup",4));


        //dairy
        food.add(new FoodStuff("Whole milk", 1, "250ml glass",6.8));
        food.add(new FoodStuff("2% fat milk", 1, "250ml glass",9.7));
        food.add(new FoodStuff("1% fat milk", 1, "250ml glass",8.2));
        food.add(new FoodStuff("Skim milk", 1, "250ml glass",8.3));
        food.add(new FoodStuff("Fat free milk", 1, "250ml glass",8.3));
        food.add(new FoodStuff("Cheese slice", 1, "250ml glass",6.4));
        food.add(new FoodStuff("Butter", 1, "Teaspoon", 0.1));

        //snacks
        food.add(new FoodStuff("Granola bar", 1, "Bar", 1.6));
        food.add(new FoodStuff("Almonds", 1, "Almond",0.3));
        food.add(new FoodStuff("Cashew Nuts", 1, "Cashew", 0.2));
        food.add(new FoodStuff("Protein Bar", 1, "Bar",20));

        //protein shake
        food.add(new FoodStuff("Whey Protein", 1, "Scoop",30));
        food.add(new FoodStuff("Whey Isolate", 1, "Scoop",20));

        return food;

    }//end foodStuff()


} //end class FoodStuff
