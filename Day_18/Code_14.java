// Equal Or Not
// Write a program to take four numbers and check if they all are equal or not. Print 1 if they are equal and 0 if they are not equal.

// Input Format
// line contains four numbers

// Output Format
// 1 if they are equal and 0 if they are not

// Example 1
// Input

// 1 1 1 1
// Output

// 1
// Example 2
// Input

// 2 3 4 5
// Output

// 0
// Constraints
// all numbers are in the range [-10^9,10^9]

// Topics
// Basics


package Day_18;

import java.util.Scanner;

public class Code_14 {
    public static void main(String[] args) {
        //write code here
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int d = scn.nextInt();
        if((a==b) && (b==c) && (c==d) && (d==a) ){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
