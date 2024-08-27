// AS Loops Problem 1
// Write a program to enter numbers till the user wants and in the end the program should print the largest and smallest numbers.

// Input Format
// Enter input of a number from user

// Next ask user if they want to enter another number or not

// If user says yes(y/Y) then enter number again but if the user says no(n/N) then simply stop

// Output Format
// Print the largest number in line 1 and smallest number in line 2 as shown in sample test cases

// Example 1
// Input

// 10
// y
// 5
// Y
// 100
// y
// 256
// n
// Output

// Largest number: 256
// Smallest number: 5
// Example 2
// Input

// 98
// y
// 2341
// Y
// -21
// N
// Output

// Largest number: 2341
// Smallest number: -21
// Constraints
// -10^5 <= Number user inputs will be <= 10^5

// 1<= Total number of user inputs <= 10^5

// Topics
// Loops
// Basics


package Day_22;

import java.util.*;

public class Code_1 {
    public static void main(String args[]) {
        // your code here
        Scanner scn = new Scanner(System.in);
        // System.out.println("Enter a number:");
        int firstNumber = scn.nextInt();
        int largest = firstNumber;
        int smallest = firstNumber;
        while(true){
            // System.out.println("Do you want to enter another number? (Y/N)");
            char ch = scn.next().charAt(0);
            if(ch == 'n' || ch == 'N'){
                break;
            }
            else if(ch == 'y' || ch == 'Y'){
                // System.out.println("Enter a number:");
                int number = scn.nextInt();
                if(number>largest){
                    largest = number;
                }
                if(number<smallest){
                    smallest = number;
                }
            }
        }
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }
}