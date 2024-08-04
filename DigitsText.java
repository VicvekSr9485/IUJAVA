import java.util.Scanner;

public class DigitsText {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter positive a number: ");
            int n = scanner.nextInt();

            // Initialize an empty string to hold the result
            String result = "";

            while (n > 0) {
                int digit = n % 10;

                String digitText = switch (digit) {
                case 0 -> "zero";
                case 1 -> "one";
                case 2 -> "two";
                case 3 -> "three";
                case 4 -> "four";
                case 5 -> "five";
                case 6 -> "six";
                case 7 -> "seven";
                case 8 -> "eight";
                case 9 -> "nine";
                default -> ""; // default case to handle unexpected digits, should never be reached
            };

                // Prepend the digit text to the result string
                result = digitText + " " + result;

                //remove the last digit from n
                n = n / 10;
            }

            // Print the result
            System.out.println(result.trim());
        }
    }
}