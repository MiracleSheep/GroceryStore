/**
 * Description: This is a program that contains the shopping list of a user. The user can choose to buty items from different departments of the grocery tore, and each department as different instance variables
 *
 * @author John Khalife
 * @version Created May 19th 2021
 */

package com.company;

import java.util.Scanner;

public class LastNameOttawaGroceryAssignment {


    //This is the main function
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



        //holds the total price of all the items in the arraylist with tax
        float priceWithTax = 0;

        //making a loop that allows the user to enter multiple grocery items
        while (groceryItemList == false) {

            getInput = userChoice("Would you like to enter a grocery item?","Press 1 for yes and 2 for no");

                //checking if the user wants to enter a grocery item
                if (getInput == 1) {

                    //if the user wants to enter a grocery item

                    //calling function that creates item
                    createItem();

                    //asking the user if they would like to change anything
                    getInput = userChoice("Would you like to change anything before you purchase?","Press 1 for yes and 2 for no" );

                    //checking the results of get input
                    if (getInput == 1) {

                        //user wants to change something called change function
                        updateItem();



                    } else if (getInput ==  2) {
                        //user does not need to change anything, moving on to the tally of prices
                        System.out.println("Okay! moving on");
                        //ending loop
                        groceryItemList = true;
                    }




                } else if (getInput == 2) {

                    //if the user does not want to add a grocery item

                    //telling the user that we are calculating the items and moving on + ending loop
                    groceryItemList = true;
                    System.out.println("Gotcha! Calculating your items...");
                    calculatePrice();

                }


        }



    }


    //This is a method that takes a question as a parameter, asks the user to pick between one or two, and will return the value
    static byte userChoice(String strQuestion, String strOptions) {

        //declaring a variable called dowhileloop for a true/false while loop
        boolean doWhileLoop = false;

        //declaring a variable that will return the input
        byte getInput = 0;

        //Prompting the user whatever quiestion was spcified in the parameter
        System.out.println(strQuestion);
        //asking for input


        //creating loop for input
        while (doWhileLoop == false) {

            System.out.println(strOptions);

            //making try catch statement
            try {

                //getting input
                getInput = new Scanner(System.in).nextByte();
                doWhileLoop = true;

            } catch (Exception e) {
                //asking user to try again
                doWhileLoop = false;

            }

            //checking if getInput is not equal to one or two
            if (getInput != 2 && getInput != 1) {
                System.out.println("That was incorrect input. Please try again");
                doWhileLoop = false;
            }

        }

        return (getInput);


    }

    //This is a method that takes a string from the user with a question as a parameter, and returns the value
    static String strUserChoice(String strQuestion) {

        //creating a boolean for the user input loop
        boolean doWhileLoop = false;

        //creating a string for the user input
        String strResponse = "";

        //creating a loop for user input
        while (doWhileLoop == false) {

            //prompting user for name
            System.out.println(strQuestion);

            //try catch for scanner input
            try {

                //getting input from the user (the name)
                strResponse = new Scanner(System.in).nextLine();
                doWhileLoop = true;

            } catch (Exception e) {
                //in case there is improper input
                System.out.println("Incorrect input. Try again");
                doWhileLoop = false;

            }

        }

        return(strResponse);

    }

    //this is a method that takes a int from the user with a question as a parameter, and returns the int
    static int intUserChoice(String strQuestion) {

        //creating a boolean for the user input loop
        boolean doWhileLoop = false;

        //creating a string for the user input
        int response = 0;

        //creating a loop for user input
        while (doWhileLoop == false) {

            //prompting user for name
            System.out.println(strQuestion);

            //try catch for scanner input
            try {

                //getting input from the user (the name)
                response = new Scanner(System.in).nextInt();
                doWhileLoop = true;

            } catch (Exception e) {
                //in case there is improper input
                System.out.println("Incorrect input. Try again");
                doWhileLoop = false;

            }

        }

        return(response);

    }

    //this is a method that takes a float from the user with a question as a parameter, and returns the float
    static float floatUserChoice(String strQuestion) {

        //creating a boolean for the user input loop
        boolean doWhileLoop = false;

        //creating a string for the user input
        float response = 0;

        //creating a loop for user input
        while (doWhileLoop == false) {

            //prompting user for name
            System.out.println(strQuestion);

            //try catch for scanner input
            try {

                //getting input from the user (the name)
                response = new Scanner(System.in).nextFloat();
                doWhileLoop = true;

            } catch (Exception e) {
                //in case there is improper input
                System.out.println("Incorrect input. Try again");
                doWhileLoop = false;

            }

        }

        return(response);

    }

    //This method is responsible for getting the input from the user to create a new object
    static void createItem() {

        //creating a boolean for the while loop
        boolean doWhileLoop = false;

        //variable that holds what class type a shop item is
        byte getItemType = 0;

        //variable that gets the name of the product
        String strName = " ";

        //variable that gets the quantity of the product
        int quantity = 0;

        //variable that stores the price of a product
        float price = 0;

        //variable that holds the rating
        short rating = 0;


        //asking the user for their name
        strName = strUserChoice("What is the name of your item?");

        //asking the user for the quantity of their item
        quantity = intUserChoice("What is the quantity of the item?");

        //asking the user for the priuce of their item
        price = floatUserChoice("What is the price of your item?");

        //asking the user what kind of item they would like
        getItemType = userChoice("Is your item a game or bakery item?", "Press one for game and two for bakery item");

        //checking what kind of item the user chose
        if (getItemType == 1) {
            //if the user chose game, then they need to inpuit a rating
            while (doWhileLoop == false) {
                //getting the rating from the user
            rating = (short) floatUserChoice("Give me the rating of this game.");
            doWhileLoop = true;

            //checking if the rating is within the range
            if (rating < 0 || rating > 5) {
                System.out.println("This is an incorrect value. Try again");
                doWhileLoop = false;
            }


            }

            Games.gameArrayList.add(new Games(strName,price,quantity,rating));
            Games game = Games.gameArrayList.get(Games.gameArrayList.size() - 1);
            //Showing the user their entry
            System.out.println("The name of your product is " + game.getName());
            System.out.println("The quantity of your product is " + game.getQuantity());
            System.out.println("The price of your product is " + game.getPrice() + "$");
            System.out.println("The total price of your product is " + game.getTotalPrice() + "$");
            System.out.println("The rating of your product is " + game.getRating());
            System.out.println("This is product #" + game.getTotalCreated());

        } else {

            //if the user chooses bakery, then the computer will automagically create a date
            System.out.println("Setting expiry date...");

            Bakery.bakeryArrayList.add(new Bakery(strName,price,quantity));
            Bakery bakery = Bakery.bakeryArrayList.get(Bakery.bakeryArrayList.size() - 1);

            System.out.println("The name of your product is " + bakery.getName());
            System.out.println("The quantity of your product is " + bakery.getQuantity());
            System.out.println("The price of your product is " + bakery.getPrice());
            System.out.println("The total price of your product is " + bakery.getTotalPrice());
            System.out.println("The expiry date of your product is " + bakery.getExpiryDate());
            System.out.println("This is product #" + bakery.getTotalCreated() + " that you bought.");

        }





    }

    //this method is responsible for changing and updating items in the array list
    static void updateItem() {

        //variable that gets the name of the product
        String strName = " ";

        //variable that gets the quantity of the product
        int quantity = 0;

        //variable that stores the price of a product
        float price = 0;

        //variable that holds the rating
        short rating = 0;

        //creating a boolean for a loop so that the user can change multiple items
        boolean doWhileLoop = false;

        //another boolean for an input loop
        boolean doInputLoop = false;

        //creating a variable to hold user input
        byte getInput = 0;

        //another variable to hold user input
        int getUpdateitem = 0;

        //starting while loop
        while (doWhileLoop == false) {

            //asking the user if the item they want to modify is a game item or a bakery item
            getInput = userChoice("Would you like to modify a game item or a bakery item?" , "Press one for game item and two for bakery item");

            //checkking the result of getInput
            if (getInput == 1) {

                //if the input is one, that means that I need to modify a game array

                //creating a for loop that will run through the array
                for(int i = 0 ; i < Games.gameArrayList.size() ; i++) {
                    Games game = Games.gameArrayList.get(i);
                    //saying the name and the number in the array so the user can specify which on they want to modify
                    System.out.println("Game item #" + (i + 1) + " is " + game.getName() + ".");
                }

                System.out.println("");

                //starting input loop
                doInputLoop = false;

                while(doInputLoop = false) {

                    //getting the item that the user wants to update
                    getUpdateitem = intUserChoice("What item would you like to update? (pick a number)");
                    doInputLoop = true;

                    //checking if the number given is a spot in the arraylist
                    if (getUpdateitem > Games.gameArrayList.size() || getUpdateitem < Games.gameArrayList.size()) {
                        //if not restart input
                        System.out.println("That number is outside of the range of the number of items you bought.");
                        doInputLoop = false;
                    }

                }

                //asking the user what property they want to update
                System.out.println("Updating " + Games.gameArrayList.get(getUpdateitem).getName());
                System.out.println("What property would you like to update?");
                System.out.println("1: Name");
                System.out.println("2: Price");
                System.out.println("3: Quantity");
                System.out.println("4: Rating");

                //starting input loop
                doInputLoop = false;

                while(doInputLoop = false) {

                    //getting the item that the user wants to update

                    try {
                        //casting to byte so I need a try catch
                        getInput = (byte) intUserChoice("What property would you like to update? (pick a number)");
                        doInputLoop = true;

                    } catch (Exception e) {

                        System.out.println("That was not correct input. Try again.");
                        doInputLoop = false;

                    }


                    //checking if the number given is a spot in the arraylist
                    if (getInput > 4 || getInput < 1) {
                        //if not restart input
                        System.out.println("That number is outside of the range of the number of items you bought.");
                        doInputLoop = false;
                    }

                }

                if (getInput == 1) {
                    //if the user wants to change their name
                    Games.gameArrayList.get(getUpdateitem).setName(strUserChoice("Give me the name you want to change to:"));
                    System.out.println("Changing name...");

                } else if (getInput == 2) {
                    //if the user wants to change their price
                    Games.gameArrayList.get(getUpdateitem).setPrice(floatUserChoice("Give me the price you want to change to:"));
                    System.out.println("Changing price...");
                    Games.gameArrayList.get(getUpdateitem).setTotalPrice();


                } else if (getInput == 3) {
                    //if the user wants to change their quantity
                    Games.gameArrayList.get(getUpdateitem).setQuantity(intUserChoice("Give me the quantity you want to change to:"));
                    System.out.println("Changing quantity...");
                    Games.gameArrayList.get(getUpdateitem).setTotalPrice();

                } else if (getInput == 4) {
                    //if the user wants to change their rating

                    doInputLoop = false;
                    while (doInputLoop == false) {
                        //getting the rating from the user

                        //try catch because casting to short
                        try {
                            Games.gameArrayList.get(getUpdateitem).setRating( (short) floatUserChoice("Give me the rating you want to change to:"));
                            doInputLoop = true;
                        } catch (Exception e) {
                            System.out.println("Incorrect input. try again");
                            doInputLoop = false;
                        }

                        //checking if the rating is within the range
                        if (rating < 0 || rating > 5) {
                            System.out.println("This is an incorrect value. Try again");
                            doInputLoop = false;
                        }


                    }

                    System.out.println("Changing rating...");

                }





            } else {

                //if the input is two, I need to list all the items in the bakery arraylist and modify one

                //creating a for loop that will run through the array
                for(int i = 0 ; i < Bakery.bakeryArrayList.size() ; i++) {
                    Bakery bakery = Bakery.bakeryArrayList.get(i);
                    //saying the name and the number in the array so the user can specify which on they want to modify
                    System.out.println("Bakery item #" + (i + 1) + " is " + bakery.getName() + ".");
                }

                System.out.println("");

                //starting input loop
                doInputLoop = false;

                while(doInputLoop = false) {

                    //getting the item that the user wants to update
                    getUpdateitem = intUserChoice("What item would you like to update? (pick a number)");
                    doInputLoop = true;

                    //checking if the number given is a spot in the arraylist
                    if (getUpdateitem > Bakery.bakeryArrayList.size() || getUpdateitem < Bakery.bakeryArrayList.size()) {
                        //if not restart input
                        System.out.println("That number is outside of the range of the number of items you bought.");
                        doInputLoop = false;
                    }

                }

                //asking the user what property they want to update
                System.out.println("Updating " + Bakery.bakeryArrayList.get(getUpdateitem).getName());
                System.out.println("What property would you like to update?");
                System.out.println("1: Name");
                System.out.println("2: Price");
                System.out.println("3: Quantity");
                System.out.println("4: Expiry date");

                //starting input loop
                doInputLoop = false;

                while(doInputLoop = false) {

                    //getting the item that the user wants to update

                    try {
                        //casting to byte so I need a try catch
                        getInput = (byte) intUserChoice("What property would you like to update? (pick a number)");
                        doInputLoop = true;

                    } catch (Exception e) {

                        System.out.println("That was not correct input. Try again.");
                        doInputLoop = false;

                    }


                    //checking if the number given is a spot in the arraylist
                    if (getInput > 4 || getInput < 1) {
                        //if not restart input
                        System.out.println("That number is outside of the range of the number of items you bought.");
                        doInputLoop = false;
                    }

                }

                if (getInput == 1) {
                    //if the user wants to change their name
                    Bakery.bakeryArrayList.get(getUpdateitem).setName(strUserChoice("Give me the name you want to change to:"));
                    System.out.println("Changing name...");

                } else if (getInput == 2) {
                    //if the user wants to change their price
                    Bakery.bakeryArrayList.get(getUpdateitem).setPrice(floatUserChoice("Give me the price you want to change to:"));
                    Bakery.bakeryArrayList.get(getUpdateitem).setTotalPrice();
                    System.out.println("Changing price...");

                } else if (getInput == 3) {
                    //if the user wants to change their quantity
                    Bakery.bakeryArrayList.get(getUpdateitem).setQuantity(intUserChoice("Give me the quantity you want to change to:"));
                    Bakery.bakeryArrayList.get(getUpdateitem).setTotalPrice();
                    System.out.println("Changing quantity...");

                } else if (getInput == 4) {
                    //if the user wants to change their expiry date
                    Bakery.bakeryArrayList.get(getUpdateitem).setExpiryDate();
                    System.out.println("Changing expiry date...");

                }







            }

            //asking if the user would like to modify anything else
            getInput = userChoice("Would you like to modify anything else?", "Press one for yes and two for no");

            //checking the result if getinput
            if (getInput == 1) {
                //do nothing, continue loop
            } else {
                //end loop
                doWhileLoop = false;
            }

        }


    }

    //this method is responsible for outputting all the items you bought and calculating the price with tax
    static void calculatePrice() {

        //declaring a variable to hold price with tax
        float priceWithTax = 0;

        //outputting the contents of the array list
        System.out.println("Here is a list of all the items you have bought:");

        //showing how many unique items from each department were purchased
        System.out.println("Total number of Items: " + Department.getTotalCreated() );
        System.out.println("Number of Bakery Items: "+ Bakery.getGoodsPurchased());
        System.out.println("Number of Game Items: "+ Games.getGoodsPurchased());
        System.out.println("Bakery Items:");
        System.out.println("");

    //creating a loop to display all bakery items bought
        for(int i = 0; i < Bakery.bakeryArrayList.size();i++) {

        //getting the bakery object from the array list
        Bakery bakery = (Bakery) Bakery.bakeryArrayList.get(i);

        //outputting information from the bakery item
        System.out.println("You bought" + bakery.getQuantity() + " " + bakery.getName() + " for " + bakery.getPrice() + "$.");
        System.out.println("The expiry date of " + bakery.getName() + " is " + bakery.getExpiryDate() + ".");
        System.out.println("The total price is " + bakery.getTotalPrice() + "$.");

        //adding to the total price
        priceWithTax = priceWithTax + bakery.getTotalPrice();



        System.out.println("");
        System.out.println("");
    }

        System.out.println("Game Items:");
        System.out.println("");

        //this loop is to display all games bought
        for(int i = 0; i<Games.gameArrayList.size();i++) {

        //getting the game object from the array list
        Games game = (Games) Games.gameArrayList.get(i);

        //outputting the information from the game object
        System.out.println("You bought" + game.getQuantity() + " " + game.getName() + " for " + game.getPrice() + "$.");
        System.out.println("The rating of " + game.getName() + " is " + game.getRating() + ".");
        System.out.println("The total price is " + game.getTotalPrice() + "$.");

        //adding to the total price
        priceWithTax = priceWithTax + game.getTotalPrice();


        System.out.println("");
        System.out.println("");


    }


    //outputting the price with tax
        System.out.println("The total price of all these items is "+priceWithTax +"$.");
        System.out.println("The total price with tax is "+(priceWithTax *1.13)+"$.");
        System.out.println("Enjoy your purchase!");

    }

}