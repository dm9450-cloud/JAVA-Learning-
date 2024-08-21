// Variable Practice Question 5
// Declare 3 variable v1, v2, v3 of type float and initialize the values as 10.5, 12.5 and 12.15 respectively. Then declare another variable average of type float that will store the average of these variables i.e. average = (v1+v2+v3)/3 and print the floored integer value.

// Note

// Print only integer value of average

// Input Format
// There is no input for this question

// Output Format
// Print the floored integer average value.

// Example 1
// Input

// No input
// Output

// 11
// Topics
// Basics


package Day_16;

public class Code_8 {
    public static void main(String[] args) {
        float v1 = 10.5f;
        float v2 = 12.5f;
        float v3 = 12.15f;
        float average = (v1+v2+v3)/3;
        System.out.println((int)average);
    }
}
