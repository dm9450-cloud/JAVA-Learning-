// N Stars
// In this task, you have to print n stars * vertically and n horizontally.

// Input Format
// The first line of input contains n.

// Output Format
// print the stars in horizontal and vertical direction.

// Example 1
// Input

// 3
// Output

// * * * 
// *
// *
// *
// Exaplantion

// We print the 3 stars in horizontal and 3 stars vertical direction.

// Example 2
// Input

// 5
// Output

// * * * * * 
// *
// *
// *
// *
// *
// Exaplantion

// We print the 5 stars in horizontal and 5 stars vertical direction.

// Constraints
// 1<= n <= 100

// Topics
// Basics


package Day_45;

import java.util.Scanner;

public class Code_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        // Write your code here
        for(int i = 0; i<n; i++){
                System.out.print("* ");
            }
            System.out.println();
        for(int j = 0; j<n; j++){
            System.out.println("* ");
        }
    }
}
