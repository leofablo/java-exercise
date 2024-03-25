package com.adepuu.exercises.session5;

public class Exercise1 {
    public static void main(String[] args) {
        int[] intArrays = {1, 2, 3, 4, 5, 6, 7,};
        int nilaiMax = intArrays[0];

        for (int value : intArrays) {
            if (value > nilaiMax) {
                nilaiMax = value;
            }
        }

        System.out.println(nilaiMax);
    }
}
