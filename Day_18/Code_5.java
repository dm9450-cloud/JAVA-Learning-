// Sum PCTR
// Given 2 numbers a and b, print the sum of both the numbers.

// Input Format
// First line contains first number

// Second line contains second number

// Output Format
// Print the sum of the two numbers.

// Example 1
// Input

// 4 
// 5 
// Output

// 9 
// Example 2
// Input

// 6 
// 90 
// Output

// 96 
// Constraints
// -105 <= a <= 105

// -105 <= b <= 105

// Topics
// Basics


package Day_18;

import java.util.*;
class Code_5
{
    public static void main(String args[])
    {
       Scanner ob= new Scanner(System.in);
       int a=ob.nextInt();
       int b=ob.nextInt();
       // Your code here
       int sum = a+b;
       System.out.println(sum);
    }
}
