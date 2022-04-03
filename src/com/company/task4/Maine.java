package com.company.task4;

/**
 * Создать двумерный массив int[][] score. Размер первого уровня – 3, размер второго уровня – 4
 * Заполнить массив как указано ниже:
 * [
 *      [ 10, 11, 12, 13],
 *      [ 20, 21, 22, 23],
 *      [ 30, 31, 32, 33],
 * ]
 * Создать еще один масив int[] result.
 * Заполнить этот масив суммами элементов каждой строки из  int[][] score
 */

import java.util.Arrays;

public class Maine {
    public static void main(String[] args) {

        int[][] score = {{10, 11, 12, 13}, {20, 21, 22, 23}, {30, 31, 32, 33}};
        long[] result = new long[score.length];

        for (int i = 0; i < score.length; i++) {
            int[] secondArr = score[i];
            long sum =0;
            for (int val:secondArr) {
                sum+=val;
            }
            result[i]=sum;
        }
        System.out.println(Arrays.toString(result));
    }
}