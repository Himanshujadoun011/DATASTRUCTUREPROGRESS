package com.JAVA_Programing.DATA_STRUCTURE.questiononbinarysearch;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {

        int[] arr={22,24,26,28,30,33,35,36};
        int target=32;
        System.out.println(ceil(arr,target));



    }

    static int ceil(int[] arr, int x) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(x<arr[mid]){
                end=mid-1;

            }else if(x>arr[mid]){
                start=mid+1;

            }else{
                return mid;

            }


        }
        return end;



    }
}
