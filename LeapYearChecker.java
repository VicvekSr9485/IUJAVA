
import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a year: ");
            int year = scanner.nextInt();
            boolean isLeap = isLeapYear(year);
            
            if (isLeap) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0 || year % 4 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return false;
        }
    }
}