// Input / Output in Programming
// In this challenge, you will learn to read input for the first time. The most popular way to read input in java is by using Scanner.

// For example:

// Scanner scanner = new Scanner(System.in);
// int myInt = scanner.nextInt();
// For printing it

// System.out.println( myInt);
// The code above creates a Scanner object named scanner and uses it to read an integer. It prints output using System.out.println(MyInt). So, if our input is:

// 5
// Our code will print:

// 5
// In this challenge, you must read 3 integers and then print them. Each integer must be printed on a new line.

// Input Format
// There are 3 lines of input, and each line contains a single integer.

// Output Format
// 3 lines of output, each line containing a single integer

// Example 1
// Input

// 42
// 100
// 125
// Output

// 42
// 100
// 125
// Example 2
// Input

// 452
// 105
// 25
// Output

// 452
// 105
// 25
// Constraints
// 1 <= integer <= 10^9

// Topics
// Basics


package Day_5;

import java.util.Scanner;

public class Code_10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int val1 = scn.nextInt();
        int val2 = scn.nextInt();
        int val3 = scn.nextInt();
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
    }
    
}
