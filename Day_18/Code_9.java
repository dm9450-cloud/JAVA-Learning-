// Integer Conversion
// Write a program to convert a double number n to integer. Give the floor value of the integer. For example: 2.63 would become 2.

// Input Format
// First line contains the number n

// Output Format
// Print the integer value

// Example 1
// Input

// 20.34
// Output

// 20
// Example 2
// Input

// 4.00

// Output

// 4
// Constraints
// n take real values in the range [1,100]

// Topics
// Basics
// Data Types


package Day_18;

import java.util.*;

public class Code_9 {
    public static void main(String[] args) throws Throwable {
// Your code here
        Scanner scn = new Scanner(System.in);
        double n = scn.nextDouble();
        System.out.println((int)n);
    }
}
