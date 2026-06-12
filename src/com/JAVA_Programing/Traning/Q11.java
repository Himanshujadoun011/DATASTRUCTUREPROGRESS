package com.JAVA_Programing.Traning;

public class Q11 {
    static void main(String[] args) {
        int[] arr={2,4,6,8};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        int average=(sum/(arr.length));
        System.out.println("average="+ average);
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>average){
                count++;
            }
        }
        System.out.println(count);

    }
}
