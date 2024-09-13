
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
        
        // Prompt user for their first name
        System.out.print("Please enter your first name: ");
        String firstName = scanner.nextLine();
        
        // Prompt user for their last name
        System.out.print("Please enter your last name: ");
        String lastName = scanner.nextLine();
        
        // Extract and convert the initials to uppercase
        char firstInitial = Character.toUpperCase(firstName.charAt(0));
        char lastInitial = Character.toUpperCase(lastName.charAt(0));
        
        // Print the initials in the required format
        System.out.println("Result: " + firstInitial + "." + lastInitial + ".");
        
       
    }
}
