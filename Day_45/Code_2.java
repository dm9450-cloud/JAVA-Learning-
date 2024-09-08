// Fahrenheit to Celsius degree
// Write a Java program to convert temperature from Fahrenheit to Celsius degree.

// The Fahrenheit scale is a temperature scale based on one proposed in 1724 by physicist Daniel Gabriel Fahrenheit. It uses the degree Fahrenheit (symbol: °F) as the unit.

// The Celsius scale, previously known as the centigrade scale, is a temperature scale used by the International System of Units (SI). As an SI derived unit, it is used by all countries in the world, except the U.S.

// Input Format
// Input a degree in Fahrenheit.

// Output Format
// Return temperature in Celsius degree.

// Constraints
// 1 < = r < = 1000

// Example
// Sample Input 1

// 212

// Sample Output 1

// 100.0

// Sample Input 2

// 150

// Sample Output 2

// 65.5

// Topics
// Basics
// Math

package Day_45;

import java.util.*;
class Solution {
    public void solve(Scanner sc) {
        // write your code here
        int fahrenheit = sc.nextInt();
        double celsius = (fahrenheit-32)*5.0/9.0;
        System.out.println(celsius);
    }
}
public class Code_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();
        solution.solve(sc);
    }
}

