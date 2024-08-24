//Take an array as input from the user. Search for a given number x and print the index at which it occurs.


package Day_19;

import java.util.Scanner;

public class Code_3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        //input
        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }

        int x = scn.nextInt();


        //output
        for(int i=0; i<arr.length; i++){
            if(arr[i] ==x){
                System.out.println("x found at index: " + i);
            }
        }
    }
}
