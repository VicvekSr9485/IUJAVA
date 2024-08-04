public class ForWHileDoWhile {
    public static void main(String[] args) {
        //Using for-loop
        System.out.println("Using for loop:");
        for (int i = 100; i >= 50; i -= 10) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Using while-loop
        System.out.println();
        System.out.println("Using while loop:");
        int j = 100;
        while (j >= 50) {
            System.out.print(j + " ");
            j -= 10;
        }
        System.out.println();

        //Using do-while loop
        System.out.println();
        System.out.println("Using do-while loop:");
        int k = 100;
        do {
            System.out.print(k + " ");
            k -= 10; 
        } while (k >= 50);
        System.out.println();
    }
}