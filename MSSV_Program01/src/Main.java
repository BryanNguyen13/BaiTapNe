
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @auth
public class Main {
    public static or Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for a word
        System.out.print("Please enter a word: ");
        String inputWord = sc.nextLine();
        
        // Create a WordChecker object
        WordChecker wordChecker = new WordChecker(inputWord);
        
        // Call the method to check the word
        wordChecker.checkWord();
        
        // Close the scanner
    }
}
