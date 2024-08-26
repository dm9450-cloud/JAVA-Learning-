// Array Operations
// Given an array arr of size n, Write a program to find the below 3 values.

// Sum of all the elements in the array.

// Average of all the elements in the array (Give the floor value).

// Maximum element in the array.

// Input Format:
// First line contains n representing the number of elements.

// Next line contains n space-separated integers, representing elements of the array arr.

// Output Format:
// In a single line print 3 space-separated integers representing Sum, Average and Maximum among all the array elements.

// Example 1
// Input

// 6
// 1 2 3 4 5 6
// Output

// 21 3 6
// Explanation:

// The sum of all the elements of the array 1+2+3+4+5+6 is 21, the average (1+2+3+4+5+6)/6 is 3, and the maximum among all of them is 6.

// Example 2
// Input

// 5
// 1 0 -1 0 0
// Output:

// 0 0 1
// Explanation:

// The sum of all the elements of the array 1+0+(-1)+0+0 is 0, the average (1+0+(-1)+0+)/5 is 0, and the maximum among all of them is 1.

// Constraints:
// 1 <= n <= 2*10^5

// -10^8 <= arr[i] <= 10^8

// Topics
// Loops
// Basics
// Arrays
// Math



package Day_21;

import java.util.*;

public class Code_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
                arr[i] = scanner.nextInt();

        ArrayOperations(arr, n);
    }

    public static void ArrayOperations(int[] arr, int n) {
        // Write your code here
        int sum =0;
        int max = arr[0];
        int average =0;

        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            if(arr[i]>max){
                max = arr[i];
            }
        }
        average = sum/arr.length;
        System.out.print(sum + " " +average + " "+ max + " ");
        
    }
}