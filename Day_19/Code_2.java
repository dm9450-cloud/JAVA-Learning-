

package Day_19;

import java.util.Scanner;

public class Code_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int numbers[] = new int[size];
        for(int i=0;i<size;i++){
            numbers[i] = scn.nextInt();
        }
        for(int i=0; i<size;i++){
            System.out.println(numbers[i]);
        }
    }
}
