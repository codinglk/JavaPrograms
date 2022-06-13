package com.codinglk.programs;

import java.util.Stack;

/**
 * Print all elements which are greater than all elements present to their right
 * @author  codinglk
 */
public class ElementsGreaterThanAllElementsToTheirRight {

    /*
    * A naive solution would be to use two loops. For each element, check if any greater element exists to their
    * right or not. If all elements to their right are less than it, print the element.
    *  The time complexity of this solution is O(n2), where n is the size of the input.
    *
    * A better solution is to use a stack. For each element, pop all the elements present in the stack that are less
    *  than it and then push it into the stack. Finally, the stack is left with the elements which are greater than
    * all elements present to their right.
    *
    * The time complexity of this solution is O(n) and requires O(n) extra space.
    * */
    public static void find(int[] arr)
    {
        // base case
        if (arr == null || arr.length == 0) {
            return;
        }

        // create an empty stack
        Stack<Integer> stack = new Stack<>();

        // do for each element
        for (int value: arr)
        {
            // pop all the elements that are less than the current element
            while (!stack.isEmpty() && stack.peek() < value) {
                stack.pop();
            }

            // push current element into the stack
            stack.push(value);
        }

        // print all elements in the stack
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }


    /*
    * We can easily solve this problem in linear time using constant space. The idea is to traverse the array from
    * right to left and maintain a variable that stores the maximum element encountered so far. So if the current
    * element is greater than the maximum so far, print the current element and update the maximum so far.
    *
    * The time complexity of this solution is O(n)
    * */
    public static void findElements(int[] arr)
    {
        // base case
        if (arr == null || arr.length == 0) {
            return;
        }

        int max_so_far = Integer.MIN_VALUE;

        // traverse the array from right to left
        for (int i = arr.length - 1; i >= 0; i--)
        {
            // if the current element is greater than the maximum so far,
            // print it and update `max_so_far`
            if (arr[i] >= max_so_far)
            {
                max_so_far = arr[i];
                System.out.printf("%d ", arr[i]);
            }
        }
    }

    public static void main(String[] args)
    {
        int[] arr = { 10, 4, 6, 3, 5 };
        System.out.println("Calling find(arr): ");
        find(arr);
        System.out.println("\nCalling findElements(arr): ");
        findElements(arr);
    }
}
