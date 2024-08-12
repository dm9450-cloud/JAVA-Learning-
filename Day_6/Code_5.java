package Day_6;

import java.util.Scanner;

public class Code_5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int age = scn.nextInt();

        System.out.println("Line before if-else ");
        
        if(age>=18){
            System.out.println("You are eligible for vote");
        }
        else{
            System.out.println("You are not eligible for vote");
        }
        System.out.println("Line after if-else");

    }
}
