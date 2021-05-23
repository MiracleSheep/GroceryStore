/**
 * Description: This is the bakery department class for the grocery store. it cantains all the items that belong in the bakery section of the grocery store
 *
 * @author: John Khalife
 * @version: Created May 19th 2021
 */


package com.company;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Bakery extends Department{

    //instance variables unique to Bakery past here:
    //Bakery items are food, they should have an expiry date.
    private Date expiryDate;

    //Static variable of class Games
    //An integer that stores the number of products purchased
    private static int goodsPurchased;

    //making an array list that belongs to this class
    public static ArrayList<Bakery> bakeryArrayList = new ArrayList<Bakery>();

    //constructor goes here
    public Bakery(String name, float price, int quantity) {
        //Assigning the values of the parameters to the instance variables
        this.strname = name;
        this.price = price;
        this.quantity = quantity;
        setExpiryDate();
        setTotalPrice();
        goodsPurchased ++;
        totalCreated++;
    }

    //default constructor goes here
    public Bakery() {
        this.strname = "Undefined";
        this.price = (float) 0.00;
        this.quantity = 0;
        setExpiryDate();
        setTotalPrice();
        goodsPurchased ++;
        totalCreated++;
    }

    //creating toString method
    public String toString() {
        return (this.strname + " " + this.price + " " + this.quantity + " " + this.totalPrice + " " + this.expiryDate + " " + goodsPurchased);
    }

    //get methods go here

    //returns the expiry date
    public Date getExpiryDate() { return (this.expiryDate); }

    //returns the number of unique products purchased
    public static int getGoodsPurchased() {
        return (goodsPurchased);
    }

    //set methods go here

    //sets expiry date
    public void setExpiryDate() {
        //creating random opbject
        Random rand = new Random();

        //declaring a variable that will determine how many days are added to the current date
        //tehre is no option for byte so it was to be int
        int n = rand.nextInt() + 1;

        //creating code for a random expiry date within fifty days from the day of creating the item
        Date today = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(today);
        cal.add(Calendar.DAY_OF_MONTH, n);

        //setting expiry date to correct time
        this.expiryDate = cal.getTime();


    }



}
