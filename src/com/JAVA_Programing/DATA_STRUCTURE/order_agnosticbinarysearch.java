package com.JAVA_Programing.DATA_STRUCTURE;

import java.util.Scanner;

public class order_agnosticbinarysearch {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={55,46,45,36,34,23,23,22,10};
        System.out.println("enter target no.");
        int target=34;
        System.out.println(binary(arr ,target));


    }
    static int binary(int[] arrx ,int target) {
        int x=0;
        int end=arrx.length-1;
        boolean isasc=arrx[x]<arrx[end];
        while (x<=end){
            int mid=x+(end-x)/2;
            if(target==arrx[mid]){
                return mid;
            }
            if(isasc){
                if(target<arrx[mid]){
                    end=mid-1;
                }else  {
                    x = mid + 1;
                }
            }else {
                if (target > arrx[mid]) {
                    end = mid - 1;
                } else {
                    x = mid + 1;
                }
            }
        }
        return -1;




    }

}
