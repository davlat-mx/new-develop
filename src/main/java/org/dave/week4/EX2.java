package org.dave.week4;

public class EX2 {
    public static void main(String[] args) {
        String[] arr = {
            "-150",
            "150000",
            "1500000000",
            "213333333333333333333333333333333333",
            "-1000000000000"
        };

        for (int i = 0; i < arr.length; i++) {
            String value = arr[i];
            try {
                long n = Long.parseLong(value);
                System.out.println(value + " can be fitted in:");

                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(value + " can't be fitted anywhere.");
            }
        }
    }

}