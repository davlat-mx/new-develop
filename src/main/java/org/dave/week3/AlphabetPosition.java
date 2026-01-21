package org.dave.week3;

public class AlphabetPosition {

    public static void main(String[] args) {
        System.out.println(alphabetPosition("The sunset sets at twelve o' clock."));
    }

    static String alphabetPosition(String text) {
        StringBuilder result = new StringBuilder();
        for (char i : text.toCharArray()){
            if (Character.isLetter(i)) {
                int position = Character.toLowerCase(i) - 'a' + 1;
                result.append(position).append(" ");
            }
        }
        return result.toString().trim();
    }
}


/*
    In this kata you are required to, given a string, replace every letter with its position in the alphabet.
    If anything in the text isn't a letter, ignore it and don't return it.
    "a" = 1, "b" = 2, etc.

    Example
    Input = "The sunset sets at twelve o' clock."
    Output = "20 8 5 19 21 14 19 5 20 19 5 20 19 1 20 20 23 5 12 22 5 15 3 12 15 3 11"
 */