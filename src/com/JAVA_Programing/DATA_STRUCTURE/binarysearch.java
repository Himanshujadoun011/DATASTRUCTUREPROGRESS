package com.JAVA_Programing.DATA_STRUCTURE;
import java.util.*;

public class binarysearch {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={55,46,45,36,34,23,23,22,10};
        System.out.println("enter target no.");
        int target=sc.nextInt();
        System.out.println(binary(arr ,target));


    }

    static int binary(int[] arrx ,int target) {
        int x=0;
        int end=arrx.length-1;

        if(arrx[x]<arrx[end]){
            while(x<=end){
                int mid=x+(end-x)/2;
                if(target<arrx[mid]){
                    end=mid-1;
                }else if(target>arrx[mid]){
                    x=mid+1;

                }else{
                    return mid;
                }
            }

            return -1;
        }else {
            while(x<=end){
                int mid=x+(end-x)/2;
                if(target<arrx[mid]){
                    x=mid+1;
                }else if(target>arrx[mid]){
                    end=mid-1;

                }else{
                    return mid;
                }
            }

            return -1;
        }
    }
}
