package Day_6;

import java.util.Scanner;

public class Code_6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        if(num%2==0){
            System.out.println("Number is Even number");
        }
        else{
            System.out.println("Number is Odd number");
            
        }
    }
}
