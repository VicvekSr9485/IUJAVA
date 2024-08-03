import java.util.Scanner;

class SmallPrograms {
    public static void main(String[] args) {
        // Create scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the first number
        System.out.print("Enter the first number ");
        double num1 = scanner.nextDouble();

        // Prompt user to enter the first number
        System.out.print("Enter the second number ");
        double num2 = scanner.nextDouble();

        double add = num1 + num2;

        double sub = num1 - num2;

        double mul = num1 * num2;

        double div = 0;

        if (num2 != 0) {
            div = num1 / num2;
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        // Prompt user to enter temperature value in celcius
        System.out.print("Enter temperature in degrees Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert to farenheit
        double fahrenheit = (celsius * 9/5) + 32;

        // Display the results
        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
        if (num2 != 0) {
            System.out.println("Division: " + div);
        }
        System.out.println("Equivalent temperature in degrees Fahrenheit: " + fahrenheit);

        // Close scsnner
        scanner.close();
    }
}