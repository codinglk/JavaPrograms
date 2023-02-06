package com.codinglk.programs;

import com.codinglk.utils.Utility;

import java.util.Arrays;
import java.util.List;
/**
 *
 * Reverse Elements in a collection -
 * INPUT - A string collection ["Ram", "Sardar", "John", "Jacob"]
 * OUTPUT - A string collection ["Jacob", "John", "Sardar", "Ram"]
 *
 * Constraints -
 * 1. Do not use any loop, for or while.
 * 2. Create a recursive functions to reverse the order.
 * 3. Do not use another collection object, just reverse the order in the same collection
 */
public class ReverseOrderUsingRecursion {
    public static void main(String[] args){
        int minIndex = 0;
        List<String> strList = Arrays.asList("Ram", "Sardar", "John", "Jacob");
        int maxIndex= strList.size() -1;
        int breakPoint = strList.size()/2 - 1;
        Utility.reverseList(strList, minIndex,maxIndex,breakPoint);
        strList.forEach(System.out::println);
    }
}
