/**
 * Description: This is the Games department class for the grocery store. It's function is to store products that are related to Games.
 *
 * @author: John Khalife
 * @version: Created May 19th 2021
 */


package com.company;

import java.util.ArrayList;

public class Games extends Department{

    //instance variables unique to Games past here:
    //games will have ratings, they go to five and can be multiples of 0.5
    private short rating;

    //Static variable of class Games
    //An integer that stores the number of products purchased
    private static int goodsPurchased;

    //making an array list that belongs to this class
    public static ArrayList<Games> gameArrayList = new ArrayList<Games>();

    //constructor goes here
    public Games(String name, float price, int quantity, short rating) {

        this.strname = name;
        this.price = price;
        this.quantity = quantity;
        this.rating = rating;
        setTotalPrice();
        goodsPurchased += this.quantity;
        totalCreated += this.quantity;
    }

    //default constructor goes here
    public Games() {

        this.strname = "Undefined";
        this.price = (float) 0.00;
        this.quantity = 0;
        this.rating = 0;
        setTotalPrice();
        goodsPurchased += this.quantity;
        totalCreated += this.quantity;

    }

    //creating toString method
    public String toString() {
        return (this.strname + " " + this.price + " " + this.quantity + " " + this.totalPrice + " " + this.rating + " " + goodsPurchased);
    }

    //get methods go here


    //returns the rating of the game
    public short getRating() {
        return (this.rating);
    }

    //returns the number of unique products purchased
    public static int getGoodsPurchased() {
        return (goodsPurchased);
    }

    //set methods go here

    //sets the rating
    public void setRating(short rating) {
        this.rating = rating;
    }




}
