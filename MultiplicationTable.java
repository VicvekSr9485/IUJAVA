
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int input = scanner.nextInt();

            for (int i = 1; i <= input; i++) {
                for (int j = 1; j <= input; j++) {
                    System.out.print(i + "." + j + "=" + (i * j) + " ");
                }
                System.out.println();
            }
        }
    }
}