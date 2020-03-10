package org.hacker.solutions;

import java.util.HashMap;
import java.util.Scanner;

class Day_7{
    public static void main(String... parameters){
        HashMap<String, Integer> phoneBook = new HashMap<>();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);

        }
        while(in.hasNext()){
            String s = in.next();
            if (phoneBook.get(s) != null) {
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
        System.out.println(phoneBook);
    }
}
