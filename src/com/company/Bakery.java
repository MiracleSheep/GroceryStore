/**
 * Description: This is the bakery department class for the grocery store. it cantains all the items that belong in the bakery section of the grocery store
 *
 * @author: John Khalife
 * @version: Created May 19th 2021
 */


package com.company;

import java.util.ArrayList;

public class Bakery extends Department{

    //instance variables unique to Bakery past here:
    //Bakery items are food, they should have an expiry date.
    private String strExpiryDate;

    //Static variable of class Games
    //An integer that stores the number of products purchased
    private static int goodsPurchased;

    //making an array list that belongs to this class
    public static ArrayList<Bakery> bakeryArrayList = new ArrayList<Bakery>();

    //constructor goes here
    public Bakery(String name, float price, int quantity, String expiryDate) {
        //Assigning the values of the parameters to the instance variables
        this.strname = name;
        this.price = price;
        this.quantity = quantity;
        this.strExpiryDate = expiryDate;
        setTotalPrice();
        goodsPurchased ++;
    }

    //default constructor goes here
    public Bakery() {
        this.strname = "Undefined";
        this.price = (float) 0.00;
        this.quantity = 0;
        this.strExpiryDate = "Undefined";
        setTotalPrice();
        goodsPurchased ++;
    }

    //creating toString method
    public String toString() {
        return (this.strname + " " + this.price + " " + this.quantity + " " + this.totalPrice + " " + this.strExpiryDate + " " + goodsPurchased);
    }

    //get methods go here

    //returns the expiry date
    public String getExpiryDate() { return (this.strExpiryDate); }

    //returns the number of unique products purchased
    public static int getGoodsPurchased() {
        return (goodsPurchased);
    }

    //set methods go here

    //sets expiry date
    public void setExpiryDate(String strExpiryDate) { this.strExpiryDate = strExpiryDate;}



}
