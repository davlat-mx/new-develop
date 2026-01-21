package org.dave.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortTheOdd {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortArray(new int[]{1, 3, 2, 8, 5, 4 })));
    }

    public static int[] sortArray(int[] array) {
        List<Integer> odds = new ArrayList<>();
        int index = 0;

        for (int num : array) {
            if (num % 2 != 0) {
                odds.add(num);
            }
        }
        Collections.sort(odds);

        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 != 0) {
                array[i] = odds.get(index);
                index++;
            }
        }
        return array;
    }
}


/*
    You will be given an array of numbers.
    You have to sort the odd numbers in ascending order
    while leaving the even numbers at their original positions.

    [7, 1]  =>  [1, 7]
    [5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
    [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]

 */