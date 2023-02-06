package com.codinglk.utils;

import java.util.List;

public class Utility {
    public static void reverseList(List<String> strList, int minIndex, int maxIndex, int breakPoint) {
        String str = strList.get(minIndex);
        String str1 = strList.get(maxIndex);
        strList.set(minIndex, str1);
        strList.set(maxIndex,str);
        minIndex++;
        maxIndex--;
        if(maxIndex >breakPoint){
            reverseList(strList,minIndex, maxIndex, breakPoint);
        }
    }
}
