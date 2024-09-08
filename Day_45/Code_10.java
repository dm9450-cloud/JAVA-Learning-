// Find The Radius
// Write a java program to calculate the radius of a circle given it's perimeter. The perimeter of a circle is its boundary or the complete arc length of the periphery of a circle

// Perimeter of a circle = 2 π r = π D units

// where,

// r = radius of the circle D = diameter of the circle.

// Input Format
// Any number representing perimeter of circle

// Output Format
// Return radius of circle

// Example 1
// Input

// 400
// Output

// 63.66197723675813
// Example 2
// Input

// 853
// Output

// 135.75916645738673  
// Constraints
// 1 < = N < = 10^9

// Topics
// Basics
// Math


package Day_45;

import java.util.*;
class Solution {
    public void solve(Scanner sc) {
        // write your code here
        double perimeter = sc.nextDouble();
        double pi = 3.141592653589793;
        double radius = perimeter / (2 * pi);
        System.out.println(radius);
    }
}
public class Code_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();
        solution.solve(sc);
    }
}

