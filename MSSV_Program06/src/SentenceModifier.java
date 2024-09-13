
class SentenceModifier {
    private String sentence;
    private String color;

    // Constructor to initialize the sentence and the replacement color
    public SentenceModifier(String sentence, String color) {
        this.sentence = sentence;
        this.color = color;
    }

    // Method to replace 'red' with the user-specified color
    public void modifySentence() {
        if (sentence.contains("red")) {
            String modifiedSentence = sentence.replace("red", color);
            System.out.println(modifiedSentence);
        } else {
            System.out.println("There is no 'red' word in the sentence.");
        }
    }
}