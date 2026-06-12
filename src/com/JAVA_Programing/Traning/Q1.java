package com.JAVA_Programing.Traning;

public class Q1 {
    static void main(String[] args) {
        int[] arr={4,7,2,9};
        float sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        float average=(sum/(arr.length));
        System.out.println(sum);
        System.out.println("average="+ average);
    }
}
