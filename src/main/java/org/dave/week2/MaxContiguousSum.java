package org.dave.week2;

public class MaxContiguousSum {
    public static void main(String[] args) {
        System.out.println(maxContiguousSum(new int[]{3, -4, 8, 7, -10, 19, -3}));
    }

    public static int maxContiguousSum(final int[] arr) {
        int maxSum = 0;
        int currentSum = 0;

        for(int i : arr) {
            currentSum += i;

            if (currentSum < 0) {
                currentSum = 0;
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        return maxSum;
    }
}
