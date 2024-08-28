// Max Element
// Given an array of integers, you need to find its maximum value element.

// Input
// The input contains N-spaced integers. There is no size of the array given beforehand. You will have to use some other way of reading input values.

// Output
// Print the largest element present in the array.

// Example 1
// Input

// 8 1 2 3 4 
// Output

// 8 
// Example 2
// Input

// 8 2 4 6 9
// Output

// 9
// Constraints
// 1 < = N < = 1000
// 1 < = Arr[i] < = 10000
// Topics
// Basics


package Day_23;


import java.util.*;

public class Code_1 {
    public static void main(String args[]) {
        //your code here
        Scanner sc = new Scanner(System.in);

        // Initialize the maximum value to the smallest possible integer
        int max = Integer.MIN_VALUE;

        // Read the input values until there are no more tokens
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            if (num > max) {
                max = num;
            }
        }

        // Print the maximum value
        System.out.println(max);
    }
}
