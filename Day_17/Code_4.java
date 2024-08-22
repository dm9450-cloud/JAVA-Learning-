// Conditional Problem 1
// Given an integer n. Your task is to write a program to use switch case as follows :

// if the input number is 28, print i am young.
// else print i am not young.
// Input Format
// First line contains an integer n.

// Output Format
// Print the statement based on value of n as given above.

// Example 1
// Input

// 28
// Output

// i am young
// Example 2
// Input

// 30
// Output

// i am not young
// Constraints
// 1<=n<=10000
// Topics
// Conditionals

package Day_17;

import java.util.Scanner;

public class Code_4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        switch(n){
            case 28:
                System.out.println("i am young");
                break;
            default:
                System.out.println("i am not young");
        }
    }
}
