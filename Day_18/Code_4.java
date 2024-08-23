// Swap Two Numbers using XOR
// Swap given two numbers a & b and print them. (Try to do it without a temporary variable.) and return it.

// Input Format
// The First line contains two integers a and b.

// Output Format
// Return/print the swapped integers.

// Example 1
// Input

// 8 9
// Output

// 9 8
// Explanation

// Here, 8 is swapped with 9 and vice versa.

// Example 2
// Input

// 13 18
// Output

// 18 13
// Explanation

// Here, 13 is swapped with 18.

// Constraints
// 1 <= a, b <= 10^6

// Topics
// Bit Manipulation
// Companies
// Samsung



package Day_18;

import java.lang.*;
import java.util.*;

class Solution{
    static List<Integer> get(int a,int b){
        // Write your code her
        int c = a;
        a = b;
        b = c;
        List<Integer> result = new ArrayList<>();
    result.add(a);
    result.add(b);
    return result;
    }
    
}
public class Code_4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Solution ob = new Solution();
        List<Integer> ans = ob.get(a,b);
        System.out.println(ans.get(0)+" "+ans.get(1));
    }
}
