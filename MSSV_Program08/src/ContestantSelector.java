import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ContestantSelector {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> contestants = new ArrayList<>();
        String name;

        // Inputting names until 'quit' is entered
        while (true) {
            System.out.print("Please enter a name (quit to exit!): ");
            name = scanner.nextLine();

            // Check if 'quit' is entered, ignoring case
            if (name.equalsIgnoreCase("quit")) {
                break;
            }

            // Add name to ArrayList
            contestants.add(name);
        }

        // Check if the player list is empty
        if (contestants.isEmpty()) {
            System.out.println("The player list is empty!");
        } else {
            // Display the list of players
            System.out.println("List of players:");
            for (int i = 0; i < contestants.size(); i++) {
                System.out.println((i + 1) + ". " + contestants.get(i));
            }

            // List of players with the last name 'Nguyen'
            System.out.println("#. List of players with the last name 'Nguyen':");
            int countNguyen = 0;
            for (String contestant : contestants) {
                if (contestant.startsWith("Nguyen")) {
                    countNguyen++;
                    System.out.println(countNguyen + ". " + contestant);
                }
            }

            // List of players named 'Dung'
            System.out.println("#. List of players named 'Dung':");
            int countDung = 0;
            for (String contestant : contestants) {
                if (contestant.contains("Dung")) {
                    countDung++;
                    System.out.println(countDung + ". " + contestant);
                }
            }

            // Select a random winner from the list
            Random random = new Random();
            int winnerIndex = random.nextInt(contestants.size());
            String winner = contestants.get(winnerIndex);

            // Print the name of the lucky winner
            System.out.println("#. The name of the lucky winner: " + winner);
        }

        // Close the scanner
        scanner.close();
    }
}
