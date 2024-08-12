package Day_7;

import java.util.Scanner;

public class Code_5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);
        switch(ch){
            case 'A':
            System.out.println("Marks are above 90" + ch);
            break;
            case 'B':
            System.out.println("Marks are above 70 and below 90" + ch);
            break;

        }
    }
}
