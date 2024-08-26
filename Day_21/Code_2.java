// Swap Two Numbers
// You are given two integers . Your task is to swap and print them.

// Input Format
// The only line of input contains two integers 'a' and 'b', representing integers.

// Output Format
// The only line of output prints the swapped value of 'a' and 'b'.

// Example 1
// Input

// 1 2
// Output

// 2 1
// Explanation

// The output of the above test case is 2 1 for the first test case.

// Example 2
// Input

// 3 4
// Output

// 4 3
// Explanation

// The output of the 2nd test case is 4 3.

// Constraints
// -10^5 <= 'a', 'b' <= 10 ^ 5

// Topics
// Basics
// Math
// Companies
// Samsung


package Day_21;

import java.util.*;

class Pair {
    int a;
    int b;

    public Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

class Solution {
    static Pair swap(Pair swapValues) {
        //Write your code here
        int temp = swapValues.a;
            swapValues.a = swapValues.b;
            swapValues.b = temp;
            return swapValues;
    }
}

public class Code_2 {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Pair ans = Solution.swap(new Pair(a,b));
        System.out.println(ans.a + " " + ans.b);
    }
}
