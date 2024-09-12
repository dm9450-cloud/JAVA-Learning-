// Number Rotation
// Given two numbers n and k, you need to rotate n, k times to the right. If k is negative, rotate n, k times to the left.

// Note:

// Rotating right means removing rightmost digit from n and adding it to the start.

// Rotating left means removing leftmost digit from n and adding it to the end.

// Assume that the number of rotations will not result in leading 0's, i.e. n=1203, k =2 such that 0312 is the answer, such test cases will not be given.

// k can be bigger than n.

// Input Format
// First line which has two integer n and k.

// Output Format
// Print the rotated number in a single line.

// Example 1
// Input

// 1256 1
// Output

// 6125
// Explanation

// since k=1, right rotating the number one time leads to 6125.

// Example 2
// Input

// 1256 -1
// Output

// 2561
// Explanation

// since k=1, left rotating the number one time leads to 2561.

// Constraints
// 1 <= n,k <= 10^9

// Topics
// Math

package Day_48;


import java.util.*;

public class Code_1 {
    public static void main(String[] args) {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();

        sc.close();
         // Convert the number to a string
        String numberStr = String.valueOf(n);
        int length = numberStr.length();

        // Normalize k to be within the range of the number of digits
        k = k % length;

        // Handle negative k (left rotation)
        if (k < 0) {
            k = length + k;
        }

        // Perform the rotation
        String rotatedStr = numberStr.substring(length - k) + numberStr.substring(0, length - k);

        // Print the rotated number
        System.out.println(rotatedStr);
    }
}
