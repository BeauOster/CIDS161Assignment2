/*
----------------------------------------------------

Author: Beau Oster
Contact: beau.oster@my.uwrf.edu

Created: 10/26/2022
Modified:11/7/2022

Description: 
This program helps the user decide what plant they want from a list of plants.
The program asks the user what plant they want/have, and then asks the user what their current room temp. is. 
It then gives feedback on rather or not their current temp. is suitable for their chosen plant.
BUGS:
If the user doesn't input a number for the temp. it will crash the program.
----------------------------------------------------
*/
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    String tempCorrect = "just right";
    String tempCold = "too cold";
    String tempWarm = "too warm";    // These are variables that can't be set.
    String plantIndoorFern = "Indoor Fern";
    String plantPothos = "Pothos";
    String plantKale = "Kale";
    String plantSelected; // This is a user input variable.
    double temperature; //This is a user input variable.
    boolean plantSelectionComplete = false; // This variable is here to intialize the while loop.
    int userPlant = 1; // **This variable needs to be initialized in order for things to work. It can't be (int userPlant;)**
//Introduction - Introduce the user to the program and explain what it does   
    System.out.println("This is a program that will give you a list of plants to choose from, and will tell you if your current room temperature is optimal for the plant.\n");
    
//Display - Display to the user what plants they can select  
    System.out.println("Please select a plant from the list below:" +
                  "\n1. Indoor Fern" + 
                  "\n2. Pothos" + 
                  "\n3. Kale");
    
//Input - Have the user select and choose what plant they have/want
    while (plantSelectionComplete == false) {
      plantSelected = myScanner.nextLine(); //This ask the user for input to select the plant they want.
      if (plantSelected.equals("1") || plantSelected.equalsIgnoreCase("indoor fern")) {
        System.out.println("You have selected the plant: " + plantIndoorFern);
        plantSelectionComplete = true; //This exits the loop.
        userPlant = 1; // This sets the current plant the user has selected.
      } else if (plantSelected.equals("2") || plantSelected.equalsIgnoreCase("pothos")) { 
        System.out.println("You have selected the plant: " + plantPothos);
        plantSelectionComplete = true;
        userPlant = 2;
      } else if (plantSelected.equals("3") || plantSelected.equalsIgnoreCase("kale")) {
        System.out.println("You have selected the plant: " + plantKale);
        plantSelectionComplete = true;
        userPlant = 3;
        //The "if" statements above evaluates and sees what the user selected for their plant.
      } else if (!plantSelected.equalsIgnoreCase("indoor fern") || !plantSelected.equals("1") || !plantSelected.equalsIgnoreCase("pothos") || !plantSelected.equals("2") || !plantSelected.equalsIgnoreCase("kale")|| !plantSelected.equals("3") ) {
        System.out.println("Error. Please enter a correct input.");
        plantSelectionComplete = false; //This resets the loop. Note: a "continue" statement here may also work.
        //This "if" statement evaluates and sees if the user input is correct. If not, the loop will start again.
      }
    }
 //Evaluate and see if the temperature the user has given is an optimal temperature for the plant they selected
    System.out.println("What is your current room temperature (in degrees Fahrenheit)?");
    temperature = myScanner.nextDouble(); //This asks the user to input their current temperature.
    
    if (userPlant == 1) {
        if (temperature >= 60 && temperature <= 75 ) {
          System.out.println("Your current temperature is " + tempCorrect + " for plant \"indoor fern\".");
        } else if (temperature < 60) {
          System.out.println("Your current tempertaure is " + tempCold + " for plant \"indoor fern\"."); // These "if" statements tell the user if their current temperature is right for their plant
        } else if (temperature > 75) {
          System.out.println("Your current temperature is " + tempWarm + " for plant \"indoor fern\".");
        } 
    } else if (userPlant == 2) {
       if (temperature >= 70 && temperature <= 90 ) {
          System.out.println("Your current temperature is " + tempCorrect + " for plant \"pothos\".");
        } else if (temperature < 70) {
          System.out.println("Your current tempertaure is " + tempCold + " for plant \"pothos\".");
        } else if (temperature > 90) {
          System.out.println("Your current temperature is " + tempWarm + " for plant \"pothos\".");
        }
    } else if (userPlant == 3) {
        if (temperature >= 55 && temperature <= 75 ) {
          System.out.println("Your current temperature is " + tempCorrect + " for plant \"kale\".");
        } else if (temperature < 55) {
          System.out.println("Your current tempertaure is " + tempCold + " for plant \"kale\".");
        } else if (temperature > 75) {
          System.out.println("Your current temperature is " + tempWarm + " for plant \"kale\".");
        } 
    }
  
  }
}