package com.codinglk.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author codinglk
 */
public class PrefixSuffixProgram {
    public int solution(String S) {
        // write your code in Java SE 8
        char[] sCharArr = S.toCharArray();
        List<Integer> properPrefixSuffixCount = new ArrayList<>();

        StringBuilder stringBuilderPrefix = new StringBuilder();


        int y = S.length();

        for(int x=0;x<S.length()-1;x++){
            stringBuilderPrefix.append(sCharArr[x]);

            StringBuilder stringBuilderSuffix = new StringBuilder();
            for(int k=(y-(x+1));k<y;k++) {
                stringBuilderSuffix.append(sCharArr[k]);
            }

            if(stringBuilderPrefix.toString().equalsIgnoreCase(stringBuilderSuffix.toString())){
                properPrefixSuffixCount.add(x+1);
            }


        }

        if(properPrefixSuffixCount.size() > 0) {
            Collections.sort(properPrefixSuffixCount);
            return properPrefixSuffixCount.get(properPrefixSuffixCount.size()-1);
        }else {
            return 0;
        }

    }

    public static void main(String[] args){
        PrefixSuffixProgram prefixSuffixProgram = new PrefixSuffixProgram();
        System.out.println(prefixSuffixProgram.solution("abbabba"));
    }
}
