package com.JAVA_Programing.Traning;

import java.util.Scanner;

public class Q9 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={3,7,9,12,5,6};
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%3==0){
                count++;
            }

        }
        System.out.println(count);
    }

}
