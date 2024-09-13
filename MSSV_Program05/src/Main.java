
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
        
        // Prompt user to enter a word
        System.out.print("Please enter a word: ");
        String inputWord = scanner.nextLine();
        
        // Prompt user to enter a sentence
        System.out.print("Please enter a sentence: ");
        String inputSentence = scanner.nextLine();
        
        // Create a WordInSentenceChecker object
        WordInSentenceChecker checker = new WordInSentenceChecker(inputWord, inputSentence);
        
        // Call the method to check if the word is in the sentence
        checker.checkWordInSentence();

    }
}
