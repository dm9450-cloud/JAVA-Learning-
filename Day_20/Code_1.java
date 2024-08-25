// Sum Even Odd
// You are given a number n, you are required to take input of n numbers, find the sum of odd numbers and even numbers separately and print them in the format specified below

// Input Format
// First line contains the integer n

// Second line contains n space separated integers

// Output Format
// Print the String Even xxx Odd yyy, where xxx is the sum of all the even numbers and yyy is the sum of all the odd numbers.

// Example 1
// Input

// 4
// 1 2 3 4
// Output

// Even 6 Odd 4
// Explanation

// Even numbers are {2, 4} so their sum is 6, Odd numbers are {1, 3} and their sum is 4

// Constraints
// 1 <= n <= 104

// 1 <= arr[i] <= 104

// Topics
// Basics
// Coding
// Math
// Companies
// Accenture


package Day_20;

import java.util.*;

class Solution {
    static void sumEvenOdd() {
        // Write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sumEven = 0;
        int sumOdd =0;
        for(int i=0;i<n;i++){
            int num = scn.nextInt();
            if(num%2==0){
                sumEven += num;
            }
            else{
                sumOdd += num;
            }
            
        }
        System.out.println("Even " + sumEven + " Odd " + sumOdd);
    }
}

public class Code_1 {
    public static void main(String[] args) throws Throwable {
        Solution.sumEvenOdd();
    }
}