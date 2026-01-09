package org.dave.comporator;

import java.util.Arrays;
import java.util.Comparator;

public class Comporator {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[]{123,22,313,42,56,63,77,89,85,10};
        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return  o2 - o1;
            }
        });
        System.out.println(Arrays.toString(numbers));

        String a = "absdqsqsq";
        String b = "absdss";
        System.out.println(a.compareTo(b));
    }
}
