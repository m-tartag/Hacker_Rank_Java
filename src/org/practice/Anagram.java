package org.practice;

import java.util.Arrays;

public class Anagram {

    public static void checkAnagram(String ONE, String TWO) {
        char[] ONE_split = ONE.toCharArray();
        char[] TWO_split = TWO.toCharArray();

        Arrays.sort(ONE_split);
        Arrays.sort(TWO_split);

        boolean flag = true;

        int oneLength = ONE_split.length;
        int twoLength = TWO_split.length;

        if (oneLength != twoLength) {
            flag = false;
        }

        for (int i = 0; i < ONE_split.length; i++) {

            if (ONE_split[i] != TWO_split[i]) {
                flag = false;
            }
        }


        if (flag == true) {
            System.out.println("Anagram Confirmed");
        } else {
            System.out.println("Not Anagram");
        }

    }


    public static void main(String[] args) {

        checkAnagram("care", "race");
    }
}

