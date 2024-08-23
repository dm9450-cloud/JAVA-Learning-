// Calculation
// Write a program to input two numbers a, b and print the addition, subtraction, multiplication and division(print the floor of the quotient) respectively

// Input Format
// Line contains two numbers a and b

// Output Format
// Print the result

// Example 1
// Input

// 12 4
// Output

// 16
// 8
// 48
// 3
// Example 2
// Input

// 20 5
// Output

// 25
// 15
// 100
// 4
// Constraints
// 1 <= a, b <= 100

// Topics
// Basics
// Data Types


package Day_18;

import java.util.Scanner;

public class Code_18 {
    public static void main(String[] args) {
        //write code here
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }
}
