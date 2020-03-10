package org.hacker.solutions;

public class Day_14 {

    public Difference(int[] intArray) {
        this.elements = intArray;
    }
    public void computeDifference() {
        int biggest = 0;
        int done = 0;
        for (int e : this.elements) {
            if (e > biggest) {
                biggest = e;
            }
        }
        for (int y : this.elements) {
            if ((Math.abs(biggest - y)) > done) {
                done = Math.abs(biggest - y);
            }
        }

        this.maximumDifference = done;
    }

//    static int[] numbers = {10, 4, 5, 6, -2};
//    static int high = 0;
//    static int done = 0;
//
//
//
//
//    public static void main(String[] args) {
//        for (int x : numbers) {
//            if (x > high) {
//                high = x;
//            }
//        }
//        for (int y : numbers) {
//            if ((Math.abs(high - y)) > done) {
//                done = Math.abs(high - y);
//            }
//        }
//        System.out.println(done);
//    }
}


