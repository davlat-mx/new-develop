package org.dave.week3;

public class PigLatin {

    public static void main(String[] args) {
        System.out.println(pigIt("Hello world !"));
    }

    public static String pigIt(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String i : words) {

            if (i.matches("[a-zA-Z]+")) {
                result.append(i.substring(1))
                    .append(i.charAt(0))
                    .append("ay");
            } else {
                result.append(i);
            }

            result.append(" ");
        }

        return result.toString().trim();
    }
}

/*
    Move the first letter of each word to the end of it, then add "ay" to the end of the word.
    Leave punctuation marks untouched.

    Examples
    pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
    pigIt('Hello world !');     // elloHay orldway !
 */
