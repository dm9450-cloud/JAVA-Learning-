// Palindrome Checker
// Given a number N, you need to check whether the given number is Palindrome or not. A number is said to be Palindrome when it reads the same from backwards as forward.

// Note: Input number will not have any trailing zeros.

// Input
// The line inputs N.

// Output
// You need to print "true" if the number is palindrome otherwise "false" (without quotes).

// Example 1
// Input

// 5
// Output

// true 
// Example 2
// Input

// 121
// Output

// true 
// Constraints:
// 1 <= N <= 9999

// Topics
// 2-Pointers
// Math
// Companies
// Samsung
// Oracle
// Adobe
// Zoho

package Day_57;

import java.util.Scanner;

public class Code_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int orignalNumber = N;
        int reverseNumber = 0;
        while(N!=0){
            int lastdigit = N%10;
            reverseNumber = reverseNumber*10 + lastdigit;
            N /=10;
        }
        if(orignalNumber==reverseNumber){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
