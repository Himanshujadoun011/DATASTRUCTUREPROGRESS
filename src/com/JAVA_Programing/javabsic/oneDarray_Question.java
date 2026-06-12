package com.JAVA_Programing.javabsic;

import java.util.Scanner;

public class oneDarray_Question {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter elements in array");
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        int ini=0;
        int fin=arr.length-1;
        boolean flag=true;
        while (ini<fin){
            if(arr[ini]<arr[fin]){
                ini++;
                fin--;
            }else{
                flag=false;
            }
        }
        if(flag){
            System.out.println("ascending order");
        }else{
            System.out.println("descending order");
        }
    }
}
