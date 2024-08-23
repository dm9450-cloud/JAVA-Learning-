// Digit Sum
// Write a Java program to calculate the sum of the digit number.

// Input Format
// The first line contain 1st number

// Output Format
// Print the sum of the digit number.

// Example 1
// Input

// 122
// Output

// 5
// Example 2
// Input

// 344
// Output

// 11
// Topics
// Data Types
// Companies
// Samsung
// MAQ Software
// Uber
// Walmart Global Tech
// Morgan Stanley
// LinkedIn



package Day_18;

import java.util.Scanner;

public class Code_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Your code here
        int sum =0;
        while(n>0){
            sum +=n%10;
            n/=10;
        }
        System.out.println(sum);
    }
}
