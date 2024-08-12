// Days Of A Week
// Write a program that takes a number n and displays the name of the weekday, if n is >7 print Invalid

// Input Format
// First line contain a number n

// Output Format
// Print the name of the weekday. Print Invalid if the number is greater than 7.

// Example 1
// Input

// 1
// Output

// Monday
// Example 2
// Input

// 8
// Output

// Invalid
// Constraints
// 1 <= n <= 10^9

// Topics
// Conditionals
// Basics
package Day_6;

import java.util.Scanner;

public class Code_13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      if(n==1){
          System.out.println("Monday");
      }
      else if(n==2){
          System.out.println("Tuesday");
      }
      else if(n==3){
          System.out.println("Wednesday");
      }
      else if(n==4){
          System.out.println("Thursday");
      }
      else if(n==5){
          System.out.println("Friday");
      }
      else if(n==6){
          System.out.println("Saturday");
      }
      else if(n==7){
          System.out.println("Sunday");
      }
      else{
          System.out.println("Invalid");
      }
    }
}
