package com.codinglk.programs;

import java.util.ArrayList;
import java.util.List;

/**
 * The problem is to find the sequence of zeros in a binary representation of an integer.
 * Integer Value: 1041, Binary Representation of 1041: 10000010001
 * Result: [5, 3]
 * @author codinglk
 */
public class BinaryGap {
    public List<Integer> solution(int a){
        String binary = Integer.toBinaryString(a);

        char[] binaryArr = binary.toCharArray();
        List<Integer> binaryGap = new ArrayList<>();
        int counter=0;

        for (char c : binaryArr) {
            if (c == '0') {
                counter++;
            } else if (c == '1') {
                if (counter > 0) {
                    binaryGap.add(counter);
                    counter = 0;
                }
            }
        }
        return binaryGap;
    }

    public static void main(String[] args){
        BinaryGap binaryGap = new BinaryGap();
//        {9,529,20,15,32,1041}
        System.out.println(binaryGap.solution(1041));
    }
}
