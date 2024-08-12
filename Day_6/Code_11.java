// Conditional Problem 6
// You are given two integers a and b. You need to perform the following operations

// If both integers are odd, print `we are odd`.
// Else print `we are simple`.
// Input Format
// First line contains two variables a and b.

// Output Format
// Output will be "we are odd" if both the variables are odd numbers. Otherwise output will be "we are simple".

// Example 1
// Input

// 1 3
// Output

// we are odd
// Example 2
// Input

// 2 5
// Output

// we are simple
// Constraints
// -10^8 <= a, b <= 10^8

// Topics
// Conditionals


package Day_6;

import java.util.Scanner;

public class Code_11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        if((a%2!=0) && (b%2!=0)){
            System.out.println("we are odd");
        }
        else{
            System.out.println("we are simple");
        }

    }
}
