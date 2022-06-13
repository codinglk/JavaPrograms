package com.codinglk.programs;

/**
 * @author codinglk
 */
public class ReturnSmallestElement {
    int solution(int[] A) {
        int ans = 0;
        for (int i = 0; i < A.length; i++) {
            if (ans > A[i]) {
                ans = A[i];
            }
        }
        return ans;
    }

    public static void main(String[] args){
        ReturnSmallestElement returnSmallestElement = new ReturnSmallestElement();
        System.out.println(returnSmallestElement.solution(new int[] {1,3,-1,-2,-3}));
    }
}
