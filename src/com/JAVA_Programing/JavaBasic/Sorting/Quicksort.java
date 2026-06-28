package com.JAVA_Programing.JavaBasic.Sorting;

import java.util.Arrays;

//4,6,2,5,7,9,1,3
public class Quicksort {
    public static int partition(int[] arr ,int start,int end){
        int pivot=arr[end];
        int i=start-1;
        for (int j = start; j <end ; j++) {
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[end]=temp;
        return i;
    }
    public static void quick(int[] arr,int start,int end){
        if(start<end){
            int pivot=partition(arr,start,end);
            quick(arr,start,pivot-1);
            quick(arr,pivot+1,end);
        }

    }

    static void main(String[] args) {
        int[] arr={4,6,2,5,7,9,1,3};
        quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
