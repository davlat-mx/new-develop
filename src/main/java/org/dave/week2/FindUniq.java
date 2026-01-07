package org.dave.week2;

import java.util.LinkedHashSet;

public class FindUniq {
    public static void main(String[] args) {
        System.out.println(findUniq(new double[] {1,1,1,4,1}));
    }

    public static double findUniqtest(double arr[]) {
        LinkedHashSet<Double> set = new LinkedHashSet<>();
        for (double i : arr)
            set.add(i);

        return set.getFirst();
    }

    public static double findUniq(double arr[]) {
        double first = arr[0];
        int count = 0;

        for (double i : arr) {
            if (i == first) {
                count++;
            }
        }

        if (count == 1) {
            return first;
        }

        for (double i : arr) {
            if (i != first) {
                return i;
            }
        }

        return 0;
    }

    /*
    There is an array with some numbers. All numbers are equal except for one. Try to find it!

    Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
    Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
    It’s guaranteed that array contains at least 3 numbers.

    The tests contain some very huge arrays, so think about performance.
     */
}
