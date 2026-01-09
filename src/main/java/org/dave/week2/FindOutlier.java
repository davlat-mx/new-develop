package org.dave.week2;

public class FindOutlier {
    public static void main(String[] args) {
        System.out.println(find(new int[]{2, 4, 6, 8, 11}));

    }

    public static int find(int[] integers) {
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < 3; i++) {
            if (integers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        boolean bigger = evenCount > oddCount;

        for (int n : integers) {
            if (bigger && n % 2 != 0) {
                return n;
            }
            if (!bigger && n % 2 == 0) {
                return n;
            }
        }

        return 0;
    }
}

/*
    You are given an array (which will have a length of at least 3, but could be very large) containing integers.
    The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N.
    Write a method that takes the array as an argument and returns this "outlier" N.

[2, 4, 0, 100, 4, 11, 2602, 36] -->  11 (the only odd number)

[160, 3, 1719, 19, 11, 13, -21] --> 160 (the only even number)
 */