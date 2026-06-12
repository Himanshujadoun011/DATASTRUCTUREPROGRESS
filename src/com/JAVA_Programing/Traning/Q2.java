package com.JAVA_Programing.Traning;

public class Q2 {
    static void main(String[] args) {
        int[] arr={-3, 5, -1, 6, 8};
        int positive=0;
        int negative=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                positive++;
            }else{
                negative++;
            }
        }
        System.out.println("positive="+positive);
        System.out.println("negative="+negative);
    }
}
