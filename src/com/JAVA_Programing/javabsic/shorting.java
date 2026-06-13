package com.JAVA_Programing.javabsic;

import java.util.Arrays;
import java.util.Scanner;

public class shorting {
    static int[] bubblesort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    static int[] selectionsort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[smallest]){
                    smallest=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;
        }
        return arr;
    }
    static int[] insertionsort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>current){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        return arr;
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of an array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter elements of an array");
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
