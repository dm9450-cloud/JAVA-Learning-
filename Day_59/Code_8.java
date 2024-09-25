// Calculate nCr
// Given n and r, your task is to calculate nCr.

// Here nCr is the total number of ways for selecting r elements out of n options are nCr = (n!) / (r! * (n-r)!)  where n! = 1 * 2 * . . . * n.

// Input Format
// Input consists of one line having two integers n followed by r.

// Output Format
// You have to calculate nCr using the formula as given and return the value to the main function.

// Example 1
// Input

// 5 2
// Output

// 10
// Example 2
// Input

// 3 1
// Output

// 3
// Constraints
// 1 <= n <= r <= 20

// Topics
// Math


package Day_59;

import java.util.*;

public class Code_8 {
    public static long FactorialCalc(long num){
            long fact = 1;
            for(long i=num; i>=1; i--){
                fact *= i;
            }
            return fact; 
    }

    static long calculate_nCr(int n, int r) {
        // write code here
        long nCr = (FactorialCalc(n))/ (FactorialCalc(r) * FactorialCalc(n-r));
        return nCr;
    }
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        long ans = calculate_nCr(n,r);
        System.out.print(ans);
    }
}
