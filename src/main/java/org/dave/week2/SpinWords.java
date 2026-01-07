package org.dave.week2;

public class SpinWords {
    public static void main(String[] args) {
        System.out.println(spinWords("Hey fellow warriors"));
    }

    public static String spinWords(String sentence) {
        StringBuilder spinWords = new StringBuilder();
        for (String word : sentence.split(" ")) {
            if (word.length() >= 5) {
                spinWords.append(new StringBuilder(word).reverse());
                spinWords.append(" ");
            } else {
                spinWords.append(word);
                spinWords.append(" ");
            }
        }
        return spinWords.toString().trim();
    }
}

/*
     Write a function that takes in a string of one or more words,
     and returns the same string, but with all words that have five or more letters reversed
     (just like the name of this kata). Strings passed in will consist of only letters and spaces.
     Spaces will be included only when more than one word is present.

    "Hey fellow warriors"  --> "Hey wollef sroirraw"
    "This is a test        --> "This is a test"
    "This is another test" --> "This is rehtona test"
*/