package com.company.task4;

public class Main {
    public static void main(String[] args) {
        int[][] score = new int[3][4];
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score.length; j++) {
                score[i][j] = i * 10 + 1;
            }
            System.out.println(i);
        }
    }
}