package org.dave.week2;

public class ROT13 {
    public static void main(String[] args) {
        System.out.println(rot13("tEst12"));

    }

    public static String rot13(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                sb.append((char) ('a' + (c - 'a' + 13) % 26));
            } else if (c >= 'A' && c <= 'Z') {
                sb.append((char) ('A' + (c - 'A' + 13) % 26));
            } else {
                sb.append(c);
            }

        }
        return sb.toString();
    }
}
/*
    ROT13 is a simple letter substitution cipher that replaces a letter with the letter 13 letters after it in the alphabet.
    ROT13 is an example of the Caesar cipher.
    Create a function that takes a string and returns the string ciphered with Rot13.
    If there are numbers or special characters included in the string, they should be returned as they are.
    Only letters from the latin/english alphabet should be shifted, like in the original Rot13 "implementation".
 */
