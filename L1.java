import java.util.*;
public class L1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take user input for the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers:");n 
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Step 2: Print the array in reverse order
        System.out.print("Array in reverse order: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Step 3: Find the average of even numbers
        int sumEven = 0;
        int countEven = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] % 2 == 0) {
                sumEven += numbers[i];
                countEven++;
            }
        }

        if (countEven > 0) {
            double averageEven = (double) sumEven / countEven;
            System.out.println("Average of even numbers: " + averageEven);
        } else {
            System.out.println("No even numbers in the array.");
        }

        scanner.close();
    }
}

