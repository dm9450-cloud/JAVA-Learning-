// AverageCalc
// Given the marks of N students, your task is to calculate the average of the marks obtained.
//change
// note- you just have to complete the function calculateAvg and return the result

// Input Format
// The first number in the input line is the number of students.

// The next N space-separated integers are the marks of the students.

// Output Format
// Print the floor of the average of marks obtained.

// floor denotes when a decimal number is rounded down to its integer value.

// Example
// Input

// 3 31 32 33
// Output

// 32
// Explanation

// Average=(31+32+33)/3=32.

// Constraints
// 1<= N <= 1000

// 1<= marks <= 1000

// Topics
// Basics
// Math


package Day_20;

import java.util.*;

class Accio {
    public int calculateAvg(int[] arr, int n) {
        // write code here
        int average =0;
        for(int i= 0; i<n; i++){
            average = average + arr[i];
        }
        return average/n;
    }
}

public class Code_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        Accio Obj = new Accio();
        System.out.println(Obj.calculateAvg(arr, n));
    }
}

