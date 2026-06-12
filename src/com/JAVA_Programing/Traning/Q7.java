package com.JAVA_Programing.Traning;

import java.util.Scanner;

public class Q7 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={4,6,2,6,8};
        System.out.println("Enter a number");
        int x=6;

        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                count=i;
            }

        }
        System.out.println(count);
    }

}
