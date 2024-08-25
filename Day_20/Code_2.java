// Sum of Digits
// Given a number n. Your task is to find the sum of its digits using recursion.

// **You have to complete sumDigit function which consists of single integer input n and returns the sum of its digits as integer output.

// Input Format
// The only line contains integer n .

// Output Format
// Print the sum of digits in number n.

// Example 1
// Input

// 1111221
// Output

// 9
// Explanation

// Here , the sum of digits is 1+1+1+1+2+2+1 i.e. 9

// Example 2
// Input

// 6342516
// Output

// 27
// Explanation

// Here , the sum of digits is 6+3+4+2+5+1+6 i.e. 27

// Constraints
// 1<= N <=10^9

// Topics
// Basics
// Math


package Day_20;

import java.util.Scanner;


public class Code_2 {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int ans = sumDigit(n);
        System.out.println(ans);      
		sc.close();
    }

	static int sumDigit(int n ) {
        //Write your code here
         int sum = 0;
        while(n > 0){
            sum = sum + n % 10;
            n /= 10;
        }
        return sum;
		
    } 
}