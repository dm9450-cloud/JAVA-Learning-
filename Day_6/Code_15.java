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


package Day_6;

import java.util.Scanner;

public class Code_15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if((n==1) || (n==3) || (n==5) || (n==7) || (n==8) || (n==10) || (n==12)){
            System.out.println("31");
        }
        else if(n==2){
            System.out.println("28");
        }
        else{
            System.out.println("30");
        }
    }
}
