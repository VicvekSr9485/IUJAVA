import java.util.Scanner;

public  class MyArray {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of elements for the array: ");
            int n = scanner.nextInt();

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
            
            System.out.println("Smallest element: " + min);
            System.out.println("Biggest element: " + max);
        }
    }
}