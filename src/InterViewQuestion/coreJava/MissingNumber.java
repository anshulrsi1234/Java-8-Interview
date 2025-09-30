package InterViewQuestion.coreJava;

import java.util.Arrays;

/**
 * Find the missing number
 *  
 * Company : Alfardan Exchange
 * Date    : 10-May-25
 */
public class MissingNumber {

    public static int findMissingNumber(int[] arr, int n) {
        // Calculate the sum of numbers from 1 to n
        long expectedSum = (long) n * (n + 1) / 2;

        // Calculate the actual sum of elements in the array using Java 8 streams
        long actualSum = Arrays.stream(arr).sum();

        // The difference is the missing number
        return (int) (expectedSum - actualSum);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // Missing 3
        int n = 6; // Range from 1 to 6
        System.out.println("Missing number: " + findMissingNumber(arr, n)); // Output: Missing number: 3
    }
}