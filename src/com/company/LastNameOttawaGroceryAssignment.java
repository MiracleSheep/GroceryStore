package com.company;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class LastNameOttawaGroceryAssignment {


    public static void main(String[] args) {

        //Variables go here

        //creating boolean for try catch loop
        boolean doWhileLoop = false;

        //creating boolean for grocery list loop
        boolean groceryItemList = false;

        //creating boolean for adding a new grocery item
        boolean addGroceryItem = false;

        //variable that takes input from the user
        byte getInput = 0;

        //variable that holds what class type a shop item is
        byte getItemType = 0;

        //variable that gets the name of the product
        String strName = " ";

        //variable that gets the quantity of the product
        int quantity = 0;

        //variable that stores the price of a product
        float price = 0;

        //variable that hold the expiry date
        String strExpiryDate = " ";

        //variable that holds the rating
        short rating = 0;

        //holds the total price of all the items in the arraylist with tax
        float priceWithTax = 0;


        //making a loop that allows the user to enter multiple grocery items
        while (groceryItemList == false) {



            //checking if the user wants to add another item to the grocery list
            if (getInput == 1) {
                //user wants to add an item:
                addGroceryItem = false;

                while (addGroceryItem == false) {

                    //creating a loop for user input
                    doWhileLoop = false;

                    while (doWhileLoop == false) {

                        //prompting user for name
                        System.out.println("What is the name of your product?");

                        //try catch for scanner input
                        try {

                            //getting input from the user (the name)
                            strName = new Scanner(System.in).nextLine();
                            doWhileLoop = true;

                        } catch (Exception e) {
                            //in case there is improper input
                            System.out.println("Incorrect input. Try again");
                            doWhileLoop = false;

                        }

                    }


                    //creating a loop for user input
                    doWhileLoop = false;

                    while (doWhileLoop == false) {

                        //prompting user for quantity of item
                        System.out.println("What is the quantity of your product?");

                        //try catch for input
                        try {
                            //getting input from the user (quantity)
                            quantity = new Scanner(System.in).nextInt();
                            doWhileLoop = true;

                        } catch (Exception e) {

                            //in case there is an error
                            System.out.println("Incorrect input. Try again");
                            doWhileLoop = false;
                        }

                    }


                    //creating a loop for user input
                    doWhileLoop = false;

                    while (doWhileLoop == false) {

                        //prompting user for the price of the product
                        System.out.println("Give me the price of your product");

                        //try catch for input
                        try {

                            //getting the input from the suer
                            price = new Scanner(System.in).nextFloat();
                            doWhileLoop = true;
                        } catch (Exception e) {

                            //in case there is an error
                            System.out.println("Incorrect input. Try again");
                            doWhileLoop = false;
                        }

                    }

                    //asking the user if they have a rating or expiry date
                    System.out.println("Do you have a rating or expiry date?");

                    doWhileLoop = false;

                    //another while loop for input
                    while (doWhileLoop == false) {

                        //prompting the user if there is a rating on their product or an expiry date (bakery item or game)
                        System.out.println("Press one for rating and two for expiry date");

                        //try catch for input
                        try {

                            //getting the response from the user
                            getItemType = new Scanner(System.in).nextByte();
                            doWhileLoop = true;

                        } catch (Exception e) {

                            //in case the response was incorrect and an error occured
                            System.out.println("Incorrect input. Try again");
                            doWhileLoop = false;
                        }

                        //checking to make sure the input is equal to one of two values
                        if (getItemType != 1 && getItemType != 2) {
                            System.out.println("Incorrect input. Try again");
                            doWhileLoop = false;
                        }

                    }

                    //checking to see if the input received from the user is equal to one (the object being entered is a game if it is one)
                    if (getItemType == 1) {

                        //creating a loop for user input
                        doWhileLoop = false;

                        while (doWhileLoop == false) {

                            //prompting user for the rating of the product
                            System.out.println("Give me the rating of your product");
                            System.out.println("It has to be from 0-5, and a multiple of 0.5");

                            //try catch for input
                            try {

                                //getting the rating from the user
                                rating = new Scanner(System.in).nextShort();
                                doWhileLoop = true;

                            } catch (Exception e) {

                                //in case there was an error during user input
                                System.out.println("Incorrect input. Try again");
                                doWhileLoop = false;
                            }

                            //The rating must be between 0 and five.
                            //We need to make sure that the rating is in the correct range
                            if (rating < 0 || rating > 5) {
                                System.out.println("The rating was out of the correct range");
                                doWhileLoop = false;
                            }


                        }

                        //checking if the user input is equal to two (the object being entered is a bakery item if it is two)
                    } else if (getItemType == 2) {

                        //creating a loop for user input
                        doWhileLoop = false;

                        while (doWhileLoop == false) {

                            //prompting user for name
                            System.out.println("Give me the Expiry date of your product");

                            //try catch for input
                            try {

                                strExpiryDate = new Scanner(System.in).nextLine();
                                doWhileLoop = true;

                            } catch (Exception e) {

                                System.out.println("Incorrect input. Try again");
                                doWhileLoop = false;

                            }

                        }

                        //might potentially add some sort of screening to check if the date is valid. Might change the date to an object type.
                        //if this comment is here I did nothing


                    }

                    System.out.println("Okay! your items are being processed...");
                    if (getItemType == 1) {
                        Games.gameArrayList.add(new Games(strName, price, quantity, rating));
                    } else {
                        Bakery.bakeryArrayList.add(new Bakery(strName, price, quantity, strExpiryDate));
                    }

                    //asking the user if they are happy with their selection
                    System.out.println("Here is what you have selected to purchase:");
                    System.out.println("Name: " + strName);
                    System.out.println("Price: " + price + "$");
                    System.out.println("Quantity: " + quantity);

                    //outputting unique class instance variables
                    if (getItemType == 1) {

                        System.out.println("Rating: " + rating);

                    } else {

                        System.out.println("Expiry date: " + strExpiryDate);

                    }

                    System.out.println("Would you like to change anything in your shopping list?");

                    //getting more input
                    doWhileLoop = false;

                    while (doWhileLoop == false) {

                        //prompting user for name
                        System.out.println("Press one for yes and two for no");

                        //try catch for input
                        try {

                            getInput = new Scanner(System.in).nextByte();
                            doWhileLoop = true;
                        } catch (Exception e) {

                            System.out.println("Incorrect input. Try again");
                            doWhileLoop = false;
                        }

                        if (getInput != 1 && getInput != 2) {
                            System.out.println("Incorrect input. Try again");
                            doWhileLoop = false;
                        }

                    }

                    if (getInput == 2) {

                        addGroceryItem = true;
                    } else {

                        System.out.println("Is ");


                        //getting more input
                        doWhileLoop = false;

                        while (doWhileLoop == false) {

                            //prompting user for name

                            System.out.println("Press one for Game and two for Bakery treat");

                            //try catch for input
                            try {

                                getInput = new Scanner(System.in).nextByte();
                                doWhileLoop = true;
                            } catch (Exception e) {

                                System.out.println("Incorrect input. Try again");
                                doWhileLoop = false;
                            }

                            if (getInput != 1 && getInput != 2) {
                                System.out.println("Incorrect input. Try again");
                                doWhileLoop = false;
                            }

                        }

                        //prompting user for name
                        System.out.println("Please select a number in the list");

                        //try catch for input
                        try {

                            getInput = new Scanner(System.in).nextByte();
                            doWhileLoop = true;
                        } catch (Exception e) {

                            System.out.println("Incorrect input. Try again");
                            doWhileLoop = false;
                        }

                        if (getInput != 1 && getInput != 2) {
                            System.out.println("Incorrect input. Try again");
                            doWhileLoop = false;
                        }

                    }

                    System.out.println("Alright! Give me the property of the item you wish to change:");
                    System.out.println("1: The name of the product");
                    System.out.println("2: The quantity of the product");
                    System.out.println("3: The price of the product");
                    if (getItemType == 1) {
                        System.out.println("4: The rating of the product");
                    } else {
                        System.out.println("4: The expiry date of the product");
                    }

                    doWhileLoop = false;

                    while (doWhileLoop == false) {

                        //prompting user for a number from 1-4
                        System.out.println("Press 1-4 to choose a property of the product to change.");

                        //try catch for input
                        try {

                            getInput = new Scanner(System.in).nextByte();
                            doWhileLoop = true;
                        } catch (Exception e) {

                            System.out.println("Incorrect input. Try again");
                            doWhileLoop = false;
                        }

                        if (getInput < 1 || getInput > 4) {
                            System.out.println("Incorrect input. Try again");
                            doWhileLoop = false;
                        }

                    }

                    if (getInput == 1) {


                        //creating a loop for user input
                        doWhileLoop = false;

                        while (doWhileLoop == false) {

                            //prompting user for name
                            System.out.println("You have chosen to change the name of the product. Please enter it here:");

                            //try catch for scanner input
                            try {

                                if (getItemType == 1) {
                                        //=new Scanner(System.in).nextLine();
                                } else {

                                }
                                //getting input from the user (the name)

                                doWhileLoop = true;

                            } catch (Exception e) {
                                //in case there is improper input
                                System.out.println("Incorrect input. Try again");
                                doWhileLoop = false;

                            }

                        }

                    } else if (getInput == 2) {
                        System.out.println("You have chosen to change the quantity of the product. Please enter it here:");

                    } else if (getInput == 3) {
                        System.out.println("You have chosen to change the price of the product. Please enter it here:");

                    } else if (getInput == 4) {
                        if (getItemType == 1) {
                            System.out.println("You have chosen to change the rating of the product. Please enter it here:");
                        } else {
                            System.out.println("You have chosen to change the expiry date of the product. Please enter it here:");
                        }


                    }


                }


            } else if (getInput == 2) {
                //user does not want to add an item, ending loop
                groceryItemList = true;


        }
        }
    }

    //Here is a method that asks if you would like to add an item to the shopping list

    public boolean newItem() {
       //declaring a variable called dowhileloop for a true or false
        boolean doWhileLoop = false;

       //declaring a variable that will return the input

        //Prompting the user to enter the grocery store
        System.out.println("Would you like to enter a grocery item?");
        //asking for input
        System.out.println("Press 1 for yes and 2 for no");

        //creating loop for input
        while (doWhileLoop == false) {

            //making try catch statement
            try {

                //getting input
                getInput = new Scanner(System.in).nextByte();
                doWhileLoop = true;

            } catch (Exception e) {

                //asking user to try again
                System.out.println("That was incorrect input. Please try again");
                doWhileLoop = false;

            }

            //checking if getInput is not equal to one or two
            if (getInput != 2 && getInput != 1) {
                System.out.println("That was incorrect input. Please try again");
                doWhileLoop = false;
            }

        }
    }


    }



//    //outputting the contents of the array list
//        System.out.println("Here is a list of all the items you have bought:");
//
//    //showing how many unique items from each department were purchased
//        System.out.println("Number of Bakery Items:"+Bakery.getGoodsPurchased());
//        System.out.println("Number of Game Items:"+Games.getGoodsPurchased());
//
//        System.out.println("Bakery Items:");
//        System.out.println("");

//    //creating a loop to display all items bought
//        for(
//    int i = 0; i<Bakery.bakeryArrayList.size();i++)
//
//    {
//
//        //getting the bakery object from the array list
//        Bakery bakery = (Bakery) Bakery.bakeryArrayList.get(i);
//
//        //outputting information from the bakery item
//        System.out.println("You bought" + bakery.getQuantity() + " " + bakery.getName() + " for " + bakery.getPrice() + "$.");
//        System.out.println("The expiry date of " + bakery.getName() + " is " + bakery.getExpiryDate() + ".");
//        System.out.println("The total price is " + bakery.getTotalPrice() + "$.");
//
//        //adding to the total price
//        priceWithTax = priceWithTax + bakery.getTotalPrice();
//
//
//        System.out.println("");
//        System.out.println("");
//    }

//        for(
//    int i = 0; i<Games.gameArrayList.size();i++)
//
//    {
//
//        //getting the game object from the array list
//        Games game = (Games) Games.gameArrayList.get(i);
//
//        //outputting the information from the game object
//        System.out.println("You bought" + game.getQuantity() + " " + game.getName() + " for " + game.getPrice() + "$.");
//        System.out.println("The rating of " + game.getName() + " is " + game.getRating() + ".");
//        System.out.println("The total price is " + game.getTotalPrice() + "$.");
//
//        //adding to the total price
//        priceWithTax = priceWithTax + game.getTotalPrice();
//
//
//    }
//
//
//    //outputting the price with tax
//        System.out.println("The total price of all these items is "+priceWithTax +"$.");
//        System.out.println("The total price with tax is "+(priceWithTax *1.13)+"$.");
//        System.out.println("Enjoy your purchase!");




