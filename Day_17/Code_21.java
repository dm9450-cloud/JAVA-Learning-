// Days in a month
// Write a program to print the number of days in a month.

// Input Format
// First line contains the number of month from 1 to 12.

// Second line contains the year.

// Output Format
// Print the number of days in the particular month in the particular year

// Example 1
// Input

// 2
// 2016
// Output

// 29
// Explanation

// 2016 is a leap year, with 2nd month being Feb hence it has 29 days.

// Example 2
// Input

// 1
// 2009
// Output

// 31
// Explanation

// January has 31 days.

// Constraints
// 1 <= month <= 12
// 1 <= year <= 3000
// Topics
// Conditionals


package Day_17;

import java.util.*;

public class Code_21 {
    public static void main(String[] args) throws Throwable {
        //Write your code here, take input as well
        Scanner scn = new Scanner(System.in);
        int numberMonth = scn.nextInt();
        int numberYear = scn.nextInt();
        if(numberMonth==1 || numberMonth==3 || numberMonth==5 || numberMonth== 7 || numberMonth==8 || numberMonth==10 || numberMonth==12){
            System.out.println(31);
        }
        else if(numberMonth==4 || numberMonth==6 || numberMonth==9 || numberMonth==11){
            System.out.println(30);
        }
        else if(numberMonth==2){
            if((numberYear%4==0) && ((numberYear%100!=0) || (numberYear%400==0))){
                System.out.println(29);
            }
            else{
                System.out.println(28);
            }
        }
    }
}