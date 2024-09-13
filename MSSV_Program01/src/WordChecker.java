
public class WordChecker {
    private String word;

    // Constructor to initialize the word
    public WordChecker(String word) {
        this.word = word;
    }

    // Method to check if the word starts with 'A' or 'a'
    public void checkWord() {
        if (word.startsWith("A")) {
            System.out.println("Yes, it starts with an upper case 'A'.");
        } else if (word.startsWith("a")) {
            System.out.println("Yes, it starts with a lower case 'a'.");
        } else {
            System.out.println("No, it does not start with 'A' or 'a'.");
        }
    }
}
