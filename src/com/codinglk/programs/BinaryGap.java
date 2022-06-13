package com.codinglk.programs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author codinglk
 */
public class BinaryGap {
    public List<Integer> solution(int a){
        String binary = Integer.toBinaryString(a);

        char[] binaryArr = binary.toCharArray();
        List<Integer> binaryGap = new ArrayList<>();
        int counter=0;

        for(int x=0; x< binaryArr.length;x++){
            if(binaryArr[x] == '0'){
                counter++;
            } else if(binaryArr[x] == '1'){
                if(counter > 0){
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
        System.out.println(binaryGap.solution(20));
    }
}
