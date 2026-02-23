package org.dave.week5;

import java.io.*;
import java.util.*;

public class Ex1 {

    class Result {

        public static String findDay(int month, int day, int year) {
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.YEAR, year);
            cal.set(Calendar.MONTH, month - 1);
            cal.set(Calendar.DAY_OF_MONTH, day);

            int weekDay = cal.get(Calendar.DAY_OF_WEEK);

            switch (weekDay) {
                case Calendar.MONDAY:    return "MONDAY";
                case Calendar.TUESDAY:   return "TUESDAY";
                case Calendar.WEDNESDAY: return "WEDNESDAY";
                case Calendar.THURSDAY:  return "THURSDAY";
                case Calendar.FRIDAY:    return "FRIDAY";
                case Calendar.SATURDAY:  return "SATURDAY";
                case Calendar.SUNDAY:    return "SUNDAY";
                default: return "";
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        System.out.println(res);
        bufferedReader.close();
    }
}