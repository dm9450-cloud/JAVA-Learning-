// Sum of Natural Numbers
// You are given an integer N. Your task is to output the sum of all natural numbers till N.

// Natural numbers are a part of the number system, including all the positive numbers from 1 to infinity.

// Input Format
// First line is an integer N

// Output Format
// Print the sum of the first N natural numbers.

// Example 1
// Input

// 5
// Output

// 15
// Explanation

// Here, n = 5, so 1 + 2 + 3 + 4 + 5 = 15

// Example 2
// Input

// 1
// Output

// 1
// Explanation

// Here, n = 1, so sum = 1

// Constraints
// 1 <= N < = 108

// Topics
// Math
// Basics



package Day_17;

import java.util.*;

public class Code_22 {
    public static void main(String[] args) {
   
       // write your code here   
        Scanner scn = new Scanner(System.in);
        long N = scn.nextInt();
        long sum = N*(N+1)/2;
        System.out.println(sum);
		
    }

}
