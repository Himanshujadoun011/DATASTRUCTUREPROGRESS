package com.JAVA_Programing.Traning;

import java.util.Arrays;

public class Q6 {
    static void main(String[] args) {
        int[] arr={-3, 5, -1, 6, 8};
        int negative=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                arr[i]=0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
