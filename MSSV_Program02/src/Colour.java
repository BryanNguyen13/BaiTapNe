/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Colour {
    private String colour;

    // Constructor to initialize the colour
    public Colour(String colour) {
        this.colour = colour;
    }

    // Method to print the first and third letters
    public void printLetters() {
        if (colour.length() >= 3) {
            System.out.println("The first letter is " + colour.charAt(0));
            System.out.println("The third letter is " + colour.charAt(2));
        } else {
            System.out.println("The colour name is too short to extract the third letter.");
        }
    }
}
