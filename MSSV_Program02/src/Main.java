
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter a colour
        System.out.print("Please type a colour: ");
        String inputColour = scanner.nextLine();
        
        // Create a Colour object
        Colour colour = new Colour(inputColour);
        
        // Call the method to print the first and third letters
        colour.printLetters();
    
    }
}
