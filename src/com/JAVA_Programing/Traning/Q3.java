package com.JAVA_Programing.Traning;

public class Q3 {
    static void main(String[] args) {
        int[] array_nums ={12, 5, 8, 20, 3};
        int max_val= array_nums[0];
        int min_val = array_nums[0];
        for (int i = 1; i < array_nums.length; i++) {
            if (array_nums[i] > max_val)
                max_val = array_nums[i];
            else if (array_nums[i] < min_val)
                min_val = array_nums[i];
        }
        int diff=max_val-min_val;
        System.out.println(diff);


    }
}
