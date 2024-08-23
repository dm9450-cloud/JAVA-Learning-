// Message printing
// Write a Java program to print the given message.

// Input Format

// -line contains your name

// Output Format

// - Print the message
// Expalnation

// -if the input is Adarsh 
// -then print 
// My name is Adarsh. I like to code.
// Example 1 Input

// Adarsh
// Output

// My name is Adarsh. I like to code.
// Example 2 Input

// Prachi
// Output

// My name is Prachi. I like to code.
// Topics
// Data Types

package Day_18;

import java.util.*;

public class Code_13 {
    public static void main(String[] args) throws Throwable {
    Scanner scn = new Scanner(System.in);   
    String message = scn.nextLine();
    System.out.println("My name is "+ message + ". I like to code.");
    }
}
