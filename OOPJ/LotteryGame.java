import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class LotteryGame {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();

            // User input for betting numbers
            System.out.println("Enter your 6 lottery numbers (1-49):");
            Set<Integer> userNumbers = new HashSet<>();
            while (userNumbers.size() < 6) {
                int number = scanner.nextInt();
                if (number < 1 || number > 49) {
                    System.out.println("Please enter a number between 1 and 49.");
                } else if (userNumbers.contains(number)) {
                    System.out.println("You have already entered this number. Please enter a different number.");
                } else {
                    userNumbers.add(number);
                }
            }

            // Draw numbers until a match is found
            int draws = 0;
            Set<Integer> drawnNumbers = new HashSet<>();
            while (!drawnNumbers.equals(userNumbers)) {
                drawnNumbers.clear();
                while (drawnNumbers.size() < 6) {
                    drawnNumbers.add(random.nextInt(49) + 1);
                }
                draws++;
            }

            System.out.println("Your numbers: " + userNumbers);
            System.out.println("It took " + draws + " draws to match your numbers.");
        }
    }
}
