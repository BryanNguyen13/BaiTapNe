
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
        
        // Prompt user to enter a sentence
        System.out.print("Please enter a sentence: ");
        String inputSentence = scanner.nextLine();
        
        // Prompt user to enter a color to replace 'red'
        System.out.print("Please enter a colour: ");
        String inputColor = scanner.nextLine();
        
        // Create a SentenceModifier object
        SentenceModifier modifier = new SentenceModifier(inputSentence, inputColor);
        
        // Call the method to modify the sentence
        modifier.modifySentence();
        
        // Close the scanner
        scanner.close();
    }
}