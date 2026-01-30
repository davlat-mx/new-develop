package org.dave.week4;

public class EX3 {
    static int B;
    static int H;

    public static void main(String[] args) {

        int[][] arr = {
            {2, 3},
            {-1, 2}
        };

        for (int i = 0; i < arr.length; i++) {

            B = arr[i][0];
            H = arr[i][1];

            if (B <= 0 || H <= 0) {
                System.out.println("error not positive");
            } else {
                System.out.println(B * H);
            }
        }
    }
}