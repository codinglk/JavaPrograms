package com.codinglk.java8;

import com.codinglk.model.Person;

import java.util.Arrays;
import java.util.List;

/**
 * @author codinglk
 * Streams filter(), findAny() and orElse()
 */
public class Java8Program2 {
    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("codinglk", 30),
                new Person("Steve", 20),
                new Person("Everett", 40)
        );

        Person result1 = persons.stream()                        // Convert to stream
                .filter(x -> "codinglk".equals(x.getName()))        // we want "codinglk" only
                .findAny()                                      // If 'findAny' then return found
                .orElse(null);                                  // If not found, return null

        System.out.println(result1);

        Person result2 = persons.stream()
                .filter(x -> "Mike".equals(x.getName()))
                .findAny()
                .orElse(null);

        System.out.println(result2);

    }
}
