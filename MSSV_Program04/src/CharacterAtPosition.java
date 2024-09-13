/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class CharacterAtPosition {

    private String name;
    private int position;

    public CharacterAtPosition(String name, int position) {
        this.name = name;
        this.position = position;
    }
    // Check if the position is valid
    public void CheckCharacterAtPosition(){
        if (position > 0 && position <= name.length()) {
            // Print the character at the given position (1-based index)
            // Adjust for 0-based index used in Java
            char character = name.charAt(position - 1);
            System.out.println("The letter at position " + position + " is " + character);
        } else {
            System.out.println("Sorry, that number is too big.");
        }
    }
}
