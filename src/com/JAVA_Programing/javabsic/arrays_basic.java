package com.JAVA_Programing.javabsic;
import java.util.*;

public class arrays_basic {
    static void search(int target,int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==target){
                System.out.println("found");
                break;
            }
        }


    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of an array");
        int size=sc.nextInt();
        int[] array=new int[size];
        System.out.println("enter numbers int the array");
        for (int i = 0; i <size ; i++) {
            array[i]=sc.nextInt();

        }
        System.out.println(Arrays.toString(array));
        System.out.println("enter a number to serach");
        int target=sc.nextInt();
        search(target, array);
    }
}
