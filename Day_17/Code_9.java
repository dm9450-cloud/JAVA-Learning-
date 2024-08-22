// Number of Days
// Given the number of the month, your task is to calculate the number of days present in the particular month.

// Note:- Consider non-leap year.

// Input Format
// An integer M, denoting the number of the month.

// Output Format
// Return the number of days in the month corresponding to the given number. Consider a non-leap year.

// Example 1
// Input

// 1
// Output

// 31
// Explanation

// January has 31 days.

// Example 2
// Input

// 3
// Output

// 31
// Explanation

// March has 31 days.

// Constraints
// 1 <= M <= 12

// Topics
// Conditionals



package Day_17;

import java.util.Scanner;

public class Code_9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int M = scn.nextInt();
        switch(M){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            System.out.println(31);
            break;
            case 4:
            case 6:
            case 9:
            case 11:
            System.out.println(30);
            break;
            case 2:
            System.out.println(28);
        }
    }
}
