package org.dave.week4;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 1;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(num + " " + line);
            num++;
        }
        scanner.close();
    }
}