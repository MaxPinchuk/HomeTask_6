package com.company;

public class Main {
    public static void main(String[] args) {

        long[][] array = new long[10][5];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = i * 100 + j;
            }
        }

        for (long[] firstLevelArray : array) {
            for (long item : firstLevelArray) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}