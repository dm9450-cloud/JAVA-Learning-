// Division
// Write a program to divide the two numbers a and b and print the floor of the quotient.

// Input Format
// First line contains 1st number

// Second line contains 2nd number

// Output Format
// Print the result

// Example 1
// Input

// 12
// 3
// Output

// 4
// Explanation

// [12/3] = 4
// Example 2
// Input

// 34
// 4
// Output

// 8
// Explanation

// [34/4] = 8 (floor of 8.5)
// Constraints
// 1 <= a, b <= 100

// Topics
// Basics


package Day_11;

import java.util.*;

public class Code_10 {
    public static void main(String[] args) throws Throwable {
//         //write code here
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.println(a/b);
}
}
