package com.JAVA_Programing.Traning;

public class Q8 {
    static void main(String[] args) {
        int[] arr={2,3,4};
        int product=arr[0];
        for(int i=1;i<arr.length;i++){
            product*=arr[i];
        }
        System.out.println(product);
    }
}
