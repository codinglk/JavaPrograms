package com.codinglk.programs;
/**
 * @author codinglk
 * Find missing element
 * {2,3,1,5} , missing element is 4
 */
public class PermMissingElement {
    public static int solution(int[] A){
        long actualSum = 0;
        for(int number : A){
            actualSum += number;
        }
        long maxNumber = A.length + 1;
        long expectedSum = (maxNumber * (maxNumber + 1))/2;
        return (int) (expectedSum - actualSum);
    }

    public static void main(String[] args){
        System.out.println(PermMissingElement.solution(new int[]{2,3,1,5}));
        System.out.println(PermMissingElement.solution(new int[]{1,2,3,4,5,6,7,8,9}));
        System.out.println(PermMissingElement.solution(new int[]{}));
    }
}
