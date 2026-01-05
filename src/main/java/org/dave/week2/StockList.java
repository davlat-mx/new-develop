package org.dave.week2;

public class StockList {

    public static void main(String[] args) {
        String[] lstOfArt = new String[]{"ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"};
        String[] lstOf1stLetter = new String[]{"A", "B", "C", "W"};
        System.out.println(stockSummary(lstOfArt, lstOf1stLetter));

    }

    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {

        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        for( String c :  lstOf1stLetter) {
            int number = 0;

            for (String d : lstOfArt){
                if (d.startsWith(c)) {
                    number += Integer.parseInt(d.split(" ")[1]);
                }
            }

            result.append("(" + c + " : " + number + ")" + " - ");
        }
        result.setLength(result.length() - 3);
        return result.toString();
    }
}

    /*
    You will receive the bookseller's stocklist and a list of categories.
    Your task is to find the total number of books in the bookseller's stocklist,
    with the category codes in the list of categories. Note: the codes are in the same order in both lists.
    Return the result as a string described in the example below, or as a list of pairs.
    If any of the input lists is empty, return an empty string, or an empty array/list.

    # the bookseller's stocklist:
    "ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"

    # list of categories:
    "A", "B", "C", "W"

    # result:
    "(A : 20) - (B : 114) - (C : 50) - (W : 0)"
     */
