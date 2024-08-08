// Variable Practice Question 8
// Write a program that takes a variable named input and assign its value as 8 and prints its multiplication table upto 10.

// Input Format:
// No input

// Output Format:
// Print the required result.

// Example 1
// Input:

// No input
// Output:

// 8 x 1 = 8
// 8 x 2 = 16
// 8 x 3 = 24
// ...
// 8 x 10 = 80
// Explanation

// We have printed the table of 8 upto 10.

// Topics
// Loops
// Basics

package Day_3;

public class Code_9 {
    public static void main(String[] args) {
        int input = 8;
        for(int i=1; i<=10; i++){
            System.out.println(input + "x" + i + " = " + (input*i));
        }
    }
    
}
