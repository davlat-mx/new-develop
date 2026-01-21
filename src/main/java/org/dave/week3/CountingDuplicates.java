package org.dave.week3;

import java.util.HashSet;
import java.util.Set;

public class CountingDuplicates {
    public static void main(String[] args) {
        System.out.println(duplicateCount("Indivisibilities"));


    }
    public static int duplicateCount(String text) {
        text = text.toLowerCase();
        Set<Character> words = new HashSet<>();
        for (int i = 0; i < text.length(); i++) {
            for (int j = i + 1; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    words.add(text.charAt(i));
                }
            }
        }

        return words.size();
    }
}

/*
    Count the number of Duplicates
    Write a function that will return the count of distinct case-insensitive alphabetic characters
    and numeric digits that occur more than once in the input string.
    The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.

    Example
    "abcde" -> 0 # no characters repeats more than once
    "aabbcde" -> 2 # 'a' and 'b'
    "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
    "indivisibility" -> 1 # 'i' occurs six times
    "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
    "aA11" -> 2 # 'a' and '1'
    "ABBA" -> 2 # 'A' and 'B' each occur twice
 */

