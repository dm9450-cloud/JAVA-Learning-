// Prime Factors
// Given the number n, print its prime factors as many times as they occur in ascending order.

// Input Format
// Input consists of single line which has the integer n.

// Output Format
// print prime factorisation of n in a single line in space separated manner.

// Example 1
// Input

// 15
// Output

// 3 5
// Explanation

// 3,5 are the prime factors of 15. 3*5 =15.

// Example 2
// Input

// 24
// Output

// 2 2 2 3
// Explanation

// 2 * 2 * 2 * 3= 24.

// Constraints
// 1 <= n <= 10^9

// Topics
// Basics
// Math
// Companies
// Yahoo


package Day_45;

import java.util.Scanner;

public class Code_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the input number
        int n = sc.nextInt();

        // Print prime factors
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        
    }
}
