// Print Even Numbers
// You are given an integer N. Your task to print all the even numbers from 0 to N.

// Input Format
// The input contains a single integer N.

// Output Format
// Output all the even numbers from 0 to N.

// Example 1
// Input:

// 8
// Output:

// 0 2 4 6 8
// Example 2
// Input:

// 7
// Output:

// 0 2 4 6



package Day_45;

import java.util.Scanner;

public class Code_7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for(int i=0;i<=n;i+=2){
			System.out.print(i + " ");
		}
    }
}
