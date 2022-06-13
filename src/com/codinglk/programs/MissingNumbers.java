package com.codinglk.programs;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author codinglk
 * Find the missing posivite Integer value from the given array
 * {1,3,6,4,1,2} , answer is 5
 * {1,2,3} , answer is 4
 * {-1,-2,1,3} , answer is 2
 * {-1,-2} , answer is 1
 */
public class MissingNumbers {

    public int solution(int[] A){

        List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());
        Collections.sort(list);
        List<Integer> uniqueList = list.stream().filter(x -> x >0).distinct().collect(Collectors.toList());
        System.out.println(uniqueList);
        int compareValue=1;
        for(int x=0; x<uniqueList.size();x++){
            if(uniqueList.get(x) != compareValue){
                return compareValue;
            }else {
                compareValue++;
            }
        }
        return compareValue;
    }

    public static void main(String[] args){
        MissingNumbers missingNumbers = new MissingNumbers();
        System.out.println(missingNumbers.solution(new int[] {1,3,6,4,1,2}));
        System.out.println(missingNumbers.solution(new int[] {1,2,3}));
        System.out.println(missingNumbers.solution(new int[] {-1,-2,1,3}));
        System.out.println(missingNumbers.solution(new int[] {-1,-2}));
    }

}
