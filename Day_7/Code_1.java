// Variable Practice Question 7
// Given a variable r and print the area and perimeter of the circle of radius r

// Assume the value of pi as 3.14.

// Input Format
// An integer r

// Output Format
// In the first line, print the area of the circle of radius r. In the next line print the perimeter of the circle of radius r.

// Print only integer part of area and perimeter.

// Example 1
// Input

// 10
// Output:

// 314
// 62
// Explanation

// 3.14 * 10 * 10 = 314

// 2 * 3.14 * 10 = 62

// Example 2
// Input

// 100
// Output:

// 31400
// 628
// Explanation

// 3.14 * 100 * 100 = 31400

// 2 * 3.14 * 100 = 6280

// Topics

package Day_7;

import java.util.Scanner;

public class Code_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();

        // Write your code here
        double area = 3.14*r*r;
        double perimeter = 2*3.14*r;
        System.out.println((int)area);
        System.out.println((int)perimeter);
    }
}
