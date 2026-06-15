package com.JAVA_Programing.javabsic;

import java.util.Scanner;

public class resursionQuestion {
    static int first=-1;
    static int last=-1;
    public static void ascending(int[] arr,int i){
        if(i==arr.length-1){
            System.out.println("sorted");
            return;

        }
        if(arr[i]<arr[i+1]){
            ascending(arr,i+1);
        }else{
            System.out.println("not shorted");
            return;
        }

    }
    public static void occurance(String str ,int idx,char target){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char ch=str.charAt(idx);
        if(ch==target){
            if(first==-1){
                first=idx;
            }else{
                last=idx;
            }
        }
        occurance(str,idx+1,target);

    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.next();

        System.out.println("enter the target character");
        char target=sc.next().charAt(0);
        occurance(str,0,target);
        int[] arr={1,2,3,4,5,6,7,8,9,9};
        ascending(arr,0);

    }
}
