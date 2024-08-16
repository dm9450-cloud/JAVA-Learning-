// Print the Pattern 4
// Take input of x from the user and write a program to print the it''s multiplication table up to 10 in format given below

// x * 1 = x
// x * 2 = 2x
// . . .
// x * 10 = 10x		
// Complete the given function.

// Input Format
// Enter input of an integer N

// Output Format
// Print the pattern for user entered value of N

// Example 1
// Input

// 3
// Output

// 3 * 1 = 3
// 3 * 2 = 6
// 3 * 3 = 9
// 3 * 4 = 12
// 3 * 5 = 15
// 3 * 6 = 18
// 3 * 7 = 21
// 3 * 8 = 24
// 3 * 9 = 27
// 3 * 10 = 30	
// Example 2
// Input

// 5
// Output

// 5 * 1 = 5
// 5 * 2 = 10
// 5 * 3 = 15
// 5 * 4 = 20
// 5 * 5 = 25
// 5 * 6 = 30
// 5 * 7 = 35
// 5 * 8 = 40
// 5 * 9 = 45
// 5 * 10 = 50
// Constraints
// 1 <= n <= 10

// Topics
// Basics

package Day_11;

import java.util.*;

public class Code_6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // Write your code here
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = " +n*i);
            
        }
    }
}
