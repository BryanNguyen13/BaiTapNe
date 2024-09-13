/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
class WordInSentenceChecker {
    private String word;
    private String sentence;

    // Constructor to initialize word and sentence
    public WordInSentenceChecker(String word, String sentence) {
        this.word = word.toLowerCase(); // Convert to lower case for case-insensitive comparison
        this.sentence = sentence.toLowerCase(); // Convert to lower case for case-insensitive comparison
    }

    // Method to check if the word is in the sentence
    public void checkWordInSentence() {
        if (sentence.contains(word)) {
            System.out.println("The word '" + word + "' is in the sentence.");
        } else {
            System.out.println("The word '" + word + "' is not in the sentence.");
        }
    }
}