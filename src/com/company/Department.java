/**
 * Description: This class is meant to be a parent class to the other department classes. I noticed that the classes ad very similar instance variables, so I figured why not share them.
 *
 * @author John Khalife
 *
 * @version Created May 23 2021
 *
 */

package com.company;

public class Department {


    //Creating instance variables of class bakery

    //there will be a total products created number which will be static
    protected static int totalCreated;

    //Each product will have a name
    protected String strname;

    //Each product will have a price - will be a float because it could be a rich person's store
    protected float price;

    //Each product will have a quantity - will be an integer because I don't know the size of the store
    protected int quantity;

    //Each product will have a total price
    protected float totalPrice;


    //constructor goes here
    public Department(String name, float price, int quantity) {
        this.strname = name;
        this.price = price;
        this.quantity = quantity;
        setTotalPrice();
    }

    //default constructor goes here
    public Department() {
        this.strname = "Undefined";
        this.price = (float) 0.00;
        this.quantity = 0;
        setTotalPrice();

    }


    //get methods go here


    //returns the name of the product bought
    public String getName() {
        return (this.strname);
    }

    //returns the price of the product bought
    public float getPrice() {
        return (this.price);
    }

    //returns the quantity of the product bought
    public int getQuantity() {
        return (this.quantity);
    }

    //returns the total price of the products bought
    public float getTotalPrice() {
        return (this.totalPrice);
    }

    //returns the total number of department objects created
    public static int getTotalCreated() {return(totalCreated);}


    //set methods go here

    //sets the name
    public void setName(String name) {
        this.strname = name;
    }

    //sets the price
    public void setPrice(float price) {
        this.price = price;
    }

    //sets the quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //this is a method that calculates the total price
    public void setTotalPrice() {
        this.totalPrice = this.price * this.quantity;
    }

}
