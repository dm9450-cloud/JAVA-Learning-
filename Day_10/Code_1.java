// Is First vowel??
// Write a program to input a name and check if the first letter of the name is a vowel or not. Note check for both upper case and lower case.

// Input format
// The First line contains a name
// Output format
// print 1 if the first letter is a vowel and 0 if it is a consonant.
// Example 1
// Input

// Adarsh
// Output

// 1
// Explanation

// First letter is A which is vowel hence we print 1.

// Example 2
// Input

// binod
// Output

// 0 
// Explanation

// First letter is b which is not vowel hence we print 0.

// Topics
// Conditionals

package Day_10;

import java.util.Scanner;

public class Code_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        char firstChar = name.charAt(0);
        switch(firstChar){
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            System.out.println(1);
            break;
            default:
            System.out.println(0);
        }
    }
}
