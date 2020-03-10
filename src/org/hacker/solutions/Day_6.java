package org.hacker.solutions;

import java.util.Scanner;

public class Day_6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String[] inputs;

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < x; i++) {
            String string = scan.nextLine();
            char[] charArray = string.toCharArray();

            for (int j = 0; j < charArray.length; j ++) {
                if (j % 2 == 0) {
                    System.out.print(charArray[j]);
                }
            }

            System.out.print(" ");

            for (int j = 0; j < charArray.length; j++) {
                if ((j % 2) != 0) {
                    System.out.print(charArray[j]);
                }
            }
            System.out.println();
        }

    }
}
