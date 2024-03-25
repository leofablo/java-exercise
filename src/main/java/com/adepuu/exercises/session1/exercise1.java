package com.adepuu.exercises.session1;

public class exercise1 {

//    Mencari nilai tertinggi dari element array
    public static void main(String[] args){
       int[] intArrays = {1, 2, 3, 4, 5, 6, 7,};
        int nilaiMax = intArrays[0];

        for(int value : intArrays){
            if(value > nilaiMax){
                nilaiMax = value;
            }
        }

        System.out.println(nilaiMax);
        }
    }

