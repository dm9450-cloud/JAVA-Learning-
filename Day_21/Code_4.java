// Print Z
// You are given N representing the number of rows, you have to print the given 'Z' pattern.

// Input Format
// First line of inout contains N, the number of rows for the pattern

// Output Format
// You need to print the pattern.

// Example 1
// Input

// 4
// Output

// ****
//   * 
//  *  
// ****
// Explanation

// For number of rows to be 4 we get this output.

// Example 2
// Input

// 5
// Output

// *****
//    * 
//   *  
//  *   
// *****
// Explanation

// For number of rows to be 5 we get this output.

// Constraints
// 3<=N<=100

// Topics
// Loops


package Day_21;

import java.util.*;

class Accio{
    static void PrintZ(int N){
        //write code and print here
        for(int i=0; i<N;i++){
            if(i==0 || i == N-1){
                for(int j=0; j<N; j++){
                    System.out.print("*");
                }
            }
            else{
                for(int j=0; j<N; j++){
                    if(j==N-i-1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
            
        }
    }
}

public class Code_4 {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Accio obj = new Accio();
        obj.PrintZ(N);
    }
}
