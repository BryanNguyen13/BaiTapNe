
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

        // Prompt the user to enter a password
        System.out.print("Please enter a password: ");
        String inputPassword = scanner.nextLine();

        // Create a PasswordValidator object and validate the password
        PasswordValidator validator = new PasswordValidator(inputPassword);
        validator.validatePassword();

        // Close the scanner
        scanner.close();
    }
}
