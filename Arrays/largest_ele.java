package Arrays;

import java.util.Scanner;

public class largest_ele {
    public largest_ele() {
        // No I/O in constructor; keep class focused on logic
    }

    /**
     * Find largest element in array.
     * 
     * @throws IllegalArgumentException if array is null or empty
     */
    public int findLargest(int[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int largest = a[0];
        // start from 1 since largest is initialized to a[0]
        for (int i = 1; i < a.length; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("enter the size of array: ");
            int n = s.nextInt();
            if (n <= 0) {
                System.out.println("Array size must be positive");
                return;
            }
            int[] a = new int[n];
            System.out.println("enter the values: ");
            for (int i = 0; i < n; i++) {
                // basic validation: keep prompting until we get an int
                while (!s.hasNextInt()) {
                    System.out.println("Please enter an integer:");
                    s.next();
                }
                a[i] = s.nextInt();
            }

            largest_ele le = new largest_ele();
            System.out.println("largest element is: " + le.findLargest(a));
        }
    }
}
