package com.adepuu.exercises.session5;

public class Exercise3 {
    /**
     * Write a Java Program to Check if Array Contain Duplicates
     *
     * Example 1:
     * Input: nums = [1,2,3,1]
     * Output: true
     *
     * Example 2:
     * Input: nums = [1,2,3,4]
     * Output: false
     *
     * Example 3:
     * Input: nums = [1,1,1,3,3,4,3,2,4,2]
     * Output: true
     */
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 2};
//        duplicateNumbers(nums);
        System.out.println(duplicateNumbers(nums));


    }

    static boolean duplicateNumbers(int[] numList) {
        for (int i = 0; i < numList.length; i++) {
//            System.out.println(numList[i]);
            for(int j = i + 1; j <numList.length; j++){
                if(numList[i] == numList[j]){
                    return true;

                }
            }
        }

        return false;


    }
}
