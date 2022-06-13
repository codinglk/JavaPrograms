package com.codinglk.programs;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Counts how many times the substring appears in the larger string.
 * @author  codinglk
 */
public class SubStringCounter {

    /* Checks if a string is empty ("") or null. */
    public static boolean isEmpty(String s) {
        return s == null || s.isEmpty();
    }

    // Using indexOf() method
    public static int countMatchesUsingIndexOf(String text, String str)
    {
        if (isEmpty(text) || isEmpty(str)) {
            return 0;
        }

        int index = 0, count = 0;
        while (true)
        {
            index = text.indexOf(str, index);
            if (index != -1)
            {
                count ++;
                index += str.length();
            }
            else {
                break;
            }
        }

        return count;
    }

    // Using split() method
    public static int countMatchesUsingSplit(String text, String str)
    {
        if (isEmpty(text) || isEmpty(str)) {
            return 0;
        }

        return text.split(str,-1).length - 1;
    }

    // Using Pattern matching
    public static int countMatchesUsingPatternMatching(String text, String str)
    {
        if (isEmpty(text) || isEmpty(str)) {
            return 0;
        }

        Matcher matcher = Pattern.compile(str).matcher(text);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        return count;
    }

    public static void main(String[] args)
    {
        String text = "LLBCCLLADCBBLLDBBC";
        String str = "LL";

//        int count = countMatchesUsingIndexOf(text, str);
//        int count = countMatchesUsingSplit(text, str);
//        int count = countMatchesUsingPatternMatching(text, str);

        // Using Apache Commons Lang
        int count = StringUtils.countMatches(text,str);
        System.out.println(count);
    }
}
