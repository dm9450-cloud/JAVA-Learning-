// Convert a given string into lowercase
// Write a Java program to convert a given string into lowercase.

// Lowercase is a typeface of small characters. For example, a, b, and c is lowercase and A, B, and C is uppercase

// Input Format
// A string in upper case letters

// Output Format
// Return same string in lowercase

// Example 1
// Input

// THE LAZY DOG
// Output

// the lazy dog
// Example 2
// Input

// BROWN FOX
// Output

// brown fox
// Topics
// Coding
// Companies
// Amazon


package Day_15;

import java.util.*;
class Solution {
    public void solve(Scanner sc) {
        // write your code here
        String inputString = sc.nextLine();
        String lowercaseString = inputString.toLowerCase();
        System.out.println(lowercaseString);
    }
    
}
public class Code_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();
        solution.solve(sc);
    }
}
