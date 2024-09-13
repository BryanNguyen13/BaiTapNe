/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
class PasswordValidator {
    private String password;

    // Constructor to initialize the password
    public PasswordValidator(String password) {
        this.password = password;
    }

    // Method to check if the password meets the specified rules
    public void validatePassword() {
        boolean isValid = true;
        
        // Check if password is at least 8 characters long
        if (password.length() < 8) {
            System.out.println("Your password is too short.");
            isValid = false;
        }

        // Check if password contains any spaces
        if (password.contains(" ")) {
            System.out.println("Your password contains spaces.");
            isValid = false;
        }

        // Check if password starts with 'G'
        if (!password.startsWith("G")) {
            System.out.println("Your password does not start with a 'G'.");
            isValid = false;
        }

        // If all checks passed, the password is valid
        if (isValid) {
            System.out.println("Well done. You entered a valid password.");
        }
    }
}