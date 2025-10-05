package Arrays;

public class missing_num {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // Example array with one missing number
        int n = arr.length + 1;
        int totalSum = n * (n + 1) / 2;

        int arrSum = 0;
        for (int num : arr) {
            arrSum += num;
        }

        int missing = totalSum - arrSum;
        System.out.println("Missing warrior: " + missing);

            

    /*using . XOR Trick (Smart Bitwise Approach)
    // XOR all numbers from 1..n and XOR with array elements.
    // Since duplicate XOR cancels out, the missing number remains.*/

        int[] arr2 = {1, 2, 4, 5, 6};
        int n1 = arr2.length + 1;
        int xor = 0;

        for (int i = 1; i <= n1; i++) {
            xor ^= i;
        }

        for (int num : arr2) {
            xor ^= num;
        }

        System.out.println("Missing warrior: " + xor);

}
}
