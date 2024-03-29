package com.codinglk.programs;

/**
 * @author codinglk
 *
 * Rotate an array to the right by a given number of steps.
 * An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is moved to the first place. For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).
 *
 * The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.
 *
 * Write a function:
 *
 * class Solution { public int[] solution(int[] A, int K); }
 * that, given an array A consisting of N integers and an integer K, returns the array A rotated K times.
 *
 * For example, given
 *
 *     A = [3, 8, 9, 7, 6]
 *     K = 3
 * the function should return [9, 7, 6, 3, 8].
 */
public class CyclicRotation {

    public int[] solution1(int[] A, int k){
        int[] result = new int[A.length];
        int rotateIndex = A.length - k;
        int startIndex = 0;

        for(int x=0;x<k;x++){
            result[x] = A[rotateIndex];
            rotateIndex++;
        }

        for(int x=k;x<A.length;x++){
            result[x] = A[startIndex];
            startIndex++;
        }
        return result;
    }

    // Get the result index using modula operator % , formula to get result index is (i + k) % A.length
    public int[] solution2(int[] A, int k){
        int[] result = new int[A.length];
        for(int i=0; i < A.length; i++) {
            result[(i + k) % A.length] = A[i];
        }
        return result;
    }

    public static void main(String[] args){
        CyclicRotation cyclicRotation = new CyclicRotation();
        int[] result1 = cyclicRotation.solution1(new int[] {3, 8, 9, 7, 6}, 3);
        System.out.println("Result1");
        for (int i : result1) {
            System.out.println(i);
        }

        int[] result2 = cyclicRotation.solution2(new int[] {3, 8, 9, 7, 6}, 3);
        System.out.println("Result2");
        for (int i : result2) {
            System.out.println(i);
        }

    }
}
