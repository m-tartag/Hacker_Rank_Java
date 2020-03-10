package org.hacker.solutions.day_10;

import java.util.Scanner;

public class Solution {


    public static String toBinary(int n) {
        return Integer.toBinaryString(n);
    }

    public static int countDoubles(String string) {
        char[] chars = string.toCharArray();
        int counter = 0;
        int buffer = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                buffer += 1;
                if (buffer > counter) {
                    counter = buffer;
                }
            } else buffer = 0;
        }
        return counter;
    }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main (String[]args){
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            scanner.close();
            System.out.println(countDoubles(toBinary(n)));

        }
    }

