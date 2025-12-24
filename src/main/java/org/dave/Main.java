package org.dave;

public class Main {
    public static void main(String[] args) {

        char a = 'A';
        System.out.println((int) a);
        System.out.println(13 % 26);
        String str = "tEst23";
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
        System.out.println(sb);
    }
}