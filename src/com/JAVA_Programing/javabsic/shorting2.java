package com.JAVA_Programing.javabsic;

import java.util.Arrays;

public class shorting2{
    public static void merge(int[] arr,int si,int mid,int ei){
        int[] m=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int x=0;
        while(i<=mid && j<=ei){
            if(arr[i]<=arr[j]){
                m[x++]=arr[i++];
            }else{
                m[x++]=arr[j++];
            }
        }
        while(i<=mid)
        {
            m[x++]=arr[i++];
        }
        while(j<=ei){
            m[x++]=arr[j++];
        }
        for(x=0;x<m.length ;x++){
            arr[si+x]=m[x];
        }
    }


    public static void divide(int[] arr, int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }
    static void main(String[] args) {
        int[] arr={6,4,9,7,2,5,1,3};
        divide(arr,0,arr.length-1 );
        System.out.println(Arrays.toString(arr));

    }
}
