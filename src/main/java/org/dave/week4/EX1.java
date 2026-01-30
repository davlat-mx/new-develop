package org.dave.week4;

public class EX1 {
    public static void main(String[] args) {
            int[][] arr = {
            {0, 2, 10},
            {5, 3, 5}
        };

        for (int i = 0; i < arr.length; i++) {
            int a = arr[i][0];
            int b = arr[i][1];
            int n = arr[i][2];

            int sum = a;
            int value = 1;

            for (int j = 0; j < n; j++) {
                sum += value * b;
                System.out.print(sum);
                System.out.print(" ");
                value = value * 2;
            }
            System.out.println();
        }
    }

}