// Agent Binod
// You are required to take input a string agentName, and finally print the line "Hi my name is Agent insert agentName".

// Input Format
// First line contains a string which is the name of the agent.

// Output Format
// One line output of format "Hi my name is Agent insert agentName"

// Example 1
// Input

// Binod
// Output

// Hi my name is Agent Binod
// Example 2
// Input

// Binod Bhushan
// Output

// Hi my name is Agent Binod Bhushan
// Constraints
// 1 <= agentName.size <= 100000

// Topics
// Strings




package Day_16;

import java.util.*;

public class Code_11 {
    public static void main(String[] args) {
         // Your code here
        Scanner scn = new Scanner(System.in);
        String agentName = scn.nextLine();
        System.out.println("Hi my name is Agent "  + agentName);
    }
}

