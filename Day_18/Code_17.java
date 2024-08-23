// Message printing
// Write a Java program to print the given message.

// Note

// if the input is Adarsh 
// then print 
// My name is Adarsh. I like to code.
// Input Format
// The first line of input contains a string.

// ###Output Format

// You need to print according to the given directions.

// Example 1
// Input

// Adarsh
// Output

// My name is Adarsh. I like to code.
// Example 2
// Input

// Prachi
// Output

// My name is Prachi. I like to code.
// Constraints
// 1 <= |s| <= 105

// string contains upper case and lower case alphabets.

// Topics
// Data Types

package Day_18;

import java.util.*;
class Code_17
{
    public static void main(String args[])
    {
        Scanner ob= new Scanner(System.in);
       String a=ob.next();
       // your code here
       System.out.println("My name is " + a + ". I like to code.");
    }
}
