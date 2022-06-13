package com.codinglk.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author codinglk
 * Streams filter() and collect()
 */
public class Java8Program1 {
    public static void main(String[] args) {

        List<String> lines = Arrays.asList("abcdef", "mike", "codinglk", "rob");

        List<String> result = lines.stream()                // convert list to stream
                .filter(line -> !"abcdef".equals(line))     // we don't like abcdef
                .collect(Collectors.toList());              // collect the output and convert streams to a List

        result.forEach(System.out::println);                //output : spring, codinglk

    }
}
