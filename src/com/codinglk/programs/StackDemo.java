package com.codinglk.programs;

import java.util.Stack;
/**
 * STACK Demo
 * @author  codinglk
 */
public class StackDemo {
    public static void main(String[] args)
    {
        // Creating an empty Stack
        Stack<String> STACK = new Stack<>();

        // Use push() to add elements into the Stack
        STACK.push("Welcome");
        STACK.push("To");
        STACK.push("Java");
        STACK.push("Programming");
        STACK.push("Mate");

        // Displaying the Stack
        System.out.println("Initial Stack: " + STACK);

        // Fetching the element at the head of the Stack
        System.out.println("The element at the top of the"
                + " stack is: " + STACK.peek());

        // Displaying the Stack after the Operation
        System.out.println("Final Stack: " + STACK);

        while (!STACK.isEmpty()){
            System.out.println("Stack While Loop: " + STACK.peek());
            STACK.pop();
        }
    }
}