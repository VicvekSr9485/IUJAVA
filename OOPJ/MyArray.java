import java.util.Scanner;
import java.util.Arrays;

public  class MyArray {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of elements for the array: ");
            int n = scanner.nextInt();

            // Ensure that the number of elements is positive
            if (n <= 0) {
                System.out.println("The number of elements must be positive.");
                scanner.close();
                return;
            }

            int[] myArray = new int[n];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                System.out.print("Element " + (i + 1) + ": ");
                myArray[i] = scanner.nextInt();
            }

            //Initializing the min and max to the first element of the array
            int min = myArray[0];
            int max = myArray[0];

            for (int i = 1; i < n; i++) {
                if (myArray[i] > max) {
                    max = myArray[i];
                }
                if (myArray[i] < min) {
                    min = myArray[i];
                }
            }

            // In-built sort method for sorting
            // Sort the array
            //Arrays.sort(myArray);

            // The smallest element is the first element in the sorted array
            //int min = myArray[0];

            // The largest element is the last element in the sorted array
            //int max = myArray[myArray.length - 1];
            
            System.out.println("Smallest element: " + min);
            System.out.println("Biggest element: " + max);
        }
    }
}