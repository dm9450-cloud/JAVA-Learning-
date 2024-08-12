// Which Case
// You are required to take input of a character from the user. The task is to print the following

// 1, if the character is a uppercase alphabet(A to Z)

// 0, if the character is a lowercase alphabet(a to z)

// -1, if the character is not an alphabet

// Input Format
// First line contains a character

// Output Format
// One line output of either 1 or 0 or -1 according to the conditions mentioned in the question

// Example 1
// Input

// B
// Output

// 1
// Explanation

// 'B' is an uppercase alphabet.

// Example 2
// Input

// i
// Output

// 0
// Explanation

// 'i' is a lowercase alphabet.

// Constraints
// User can input any one character.

// Topics
// Basics
// Companies
// Tech Mahindra


package Day_6;

import java.util.Scanner;

public class Code_16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.println("1");
        }
        else if(ch>='a' && ch<='z'){
            System.out.println("0");

        }
        else{
            System.out.println("-1");
        }

    }
}
