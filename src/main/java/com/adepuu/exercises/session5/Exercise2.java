package com.adepuu.exercises.session5;

import java.util.ArrayList;

public class Exercise2 {
    /**
     * Java Array Program For Array Rotation
     * Input: arr[] = {1, 2, 3, 4, 5, 6, 7},  d = 2
     * Output:  3 4 5 6 7 1 2
     * Explanation: d=2 so 2 elements are rotated to the end of the array. So, 1 2 is rotated back
     * So, Final result: 3, 4, 5, 6, 7, 1, 2
     */
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);

        int d = 2;

        for(int i = 0; i < d; i++ ){
            int temp = arrayList.get(i);
            arrayList.add(temp);
        }

        for(int i = 0; i < d; i++){
            arrayList.remove(0);
        }

        System.out.println(arrayList.toString());




    }
}
