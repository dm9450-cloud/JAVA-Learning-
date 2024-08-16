// Floyd's Triangle.
// Write a program in Java to print the Floyd's Triangle.

// Floyd's triangle is a right-angled triangular array of natural numbers, used in computer science education. It is named after Robert Floyd. It is defined by filling the rows of the triangle with consecutive numbers, starting with a 1 in the top left corner:

// Input Format
// The number of row,

// Output Format
// Return the rows of the triangle with consecutive numbers, starting with a 1 in the top left corner:

// Example 1
// Input

// 5
// Output

// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15
// Explanation

// The input number of rows is 5, so program printed 5 row triangle with consecutive numbers

// Constraints
// 1 < = N < = 1000

// Topics
// Loops
// Basics


package Day_11;

import java.util.*;
class Solution {
    public void solve(Scanner sc) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int n = 1;
        for(int i = 1; i<=row; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
    }
}
public class Code_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();
        solution.solve(sc);
    }
}
