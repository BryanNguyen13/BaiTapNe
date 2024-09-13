
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
        // Prompt user to enter a name
        System.out.print("Please enter a name: ");
        String name = scanner.nextLine();
        
        // Prompt user to enter a number
        System.out.print("Please enter a number: ");
        int position = scanner.nextInt();
        
        CharacterAtPosition characterAtPosition = new CharacterAtPosition(name, position);
        characterAtPosition.CheckCharacterAtPosition();
     }
}
