// Binary To Decimal
// Given binary representation of a number , convert it to decimal representation.

// Note : You just need to complete binaryToDecimal function.

// Input Format
// Single line consisting of an integer n.

// Output Format
// Print decimal representation of the number

// EXAMPLE 1
// Input:

// 111

// Output::

// 7

// EXPLANATION:


// 111 is the binary representation of 7

// EXAMPLE 2
// Input:


// 11011
// Output::

// 27

// EXPLANATION:


// 11011 is the binary representation of 27 

// CONSTRAINTS
// 1 <= n <= 10^9

// Topics
// Math




package Day_59;

import java.util.Scanner;

public class Code_1 {
    public static long binaryToDecimal(long binaryNumber) {
              // write your code here
              long num = binaryNumber;
              long dec_value = 0;
              long temp = num;
              long base = 1;
              while(temp>0){
                long last_digit = temp%10;
                temp /= 10;
                dec_value += last_digit * base;
                base *= 2;
              }
              return dec_value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long binaryNumber = scanner.nextInt();
        System.out.println(binaryToDecimal(binaryNumber));
        scanner.close();
    }
}
