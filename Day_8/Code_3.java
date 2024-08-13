// Switch Case Problem 3
// Write a program using switch cases in which two positive integers a and b will be taken as inputs.

// If (a%b) is 0 then output will be "Remainder is too small",

// If (a%b) is 1 then output will be "Remainder is small",

// If (a%b) is 2 then output will be "Remainder is large",

// In any other cases output will be "Remainder is too large".

// The output should not contain quotation marks.

// Input Format
// First line contains two integers a and b

// Output Format
// Any one of the mentioned strings will be printed as per the value of (a%b)

// Example 1
// Input

// 19 6
// Output

// Remainder is small
// Explanation

// Modulus operator calculates the remainder of the given values.

// 19%6 will be 1 corresponding to the switch case 1 therefore printing Remainder is small

// Example 2
// Input

// 19 5
// Output

// Remainder is too large
// Explanation

// 19%5 will be 4 as it does not match any of the switch cases it will go to the

// Default switch case therefore printing Remainder is too large

// Constraints
// 0 <= a, b <= 10^8

// Topics
// Basics


package Day_8;

import java.util.Scanner;

public class Code_3 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    // your code here
    int remainder = a%b;
    switch(remainder){
      case 0 : System.out.println("Remainder is too small");
      break;
      case 1 : System.out.println("Remainder is small");
      break;
      case 2 : System.out.println("Remainder is large");
      break;
      default : System.out.println("Remainder is too large");

    }
}
}
