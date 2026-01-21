package org.dave.week3;

public class FindMissingLetter {
    public static void main(String[] args) {

        System.out.println(findMissingLetter(new char[] { 'a','b','c','d','f' }));
    }

    public static char findMissingLetter(char[] array) {
        char result = array[0];

        for (char c : array) {
            if (c != result) {
                return result;
            }
            result++;
        }
        return result;

    }
}

/*
    Find the missing letter
    Write a method that takes an array of consecutive (increasing) letters as input
    and that returns the missing letter in the array.

    You will always get an valid array.
    And it will be always exactly one letter be missing.
    The length of the array will always be at least 2.
    The array will always contain letters in only one case.

    Example:
    ['a','b','c','d','f'] -> 'e'
    ['O','Q','R','S'] -> 'P'
 */