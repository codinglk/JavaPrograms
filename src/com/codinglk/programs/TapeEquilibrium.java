package com.codinglk.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author codinglk
 *
 * A non-empty array A consisting of N integers is given. Array A represents numbers on a tape.
 *
 * Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
 *
 * The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
 *
 * In other words, it is the absolute difference between the sum of the first part and the sum of the second part.
 *
 * For example, consider array A such that:
 *
 *   A[0] = 3
 *   A[1] = 1
 *   A[2] = 2
 *   A[3] = 4
 *   A[4] = 3
 * We can split this tape in four places:
 *
 * P = 1, difference = |3 − 10| = 7
 * P = 2, difference = |4 − 9| = 5
 * P = 3, difference = |6 − 7| = 1
 * P = 4, difference = |10 − 3| = 7
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 * that, given a non-empty array A of N integers, returns the minimal difference that can be achieved.
 *
 * For example, given:
 *
 *   A[0] = 3
 *   A[1] = 1
 *   A[2] = 2
 *   A[3] = 4
 *   A[4] = 3
 * the function should return 1, as explained above.
 */
public class TapeEquilibrium {

    public int solution1(int[] A){
        List<Integer> list = new ArrayList<>();
        int sum1=0;

        for(int x=0;x<A.length;x++){
            sum1 = sum1 + A[x];
            int sum2=0;
            if(x < A.length-1){
                for(int y=x+1;y<A.length;y++){
                    sum2 = sum2 + A[y];
                }
                list.add(Math.abs(sum2-sum1));
            }

        }

        Collections.sort(list);
        return list.get(0);
    }

    // It is better than solution1
    public int solution2(int[] A){
        int leftSum = A[0];
        int rightSum = 0;
        for (int x : A) rightSum += x ;
        rightSum -= leftSum;

        int diff =  Math.abs(leftSum - rightSum);
        for(int i=1; i < A.length -1; i++){
            leftSum += A[i];
            rightSum -= A[i];
            int currentDiff = Math.abs(leftSum - rightSum);
            if(currentDiff < diff) diff = currentDiff;
        }
        return diff;
    }

    public static void main(String[] args){
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        System.out.println(tapeEquilibrium.solution1(new int[] {3, 1, 2, 4, 3}));
        System.out.println(tapeEquilibrium.solution2(new int[] {3, 1, 2, 4, 3}));
    }

}
