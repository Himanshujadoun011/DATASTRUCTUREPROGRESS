package com.JAVA_Programing.Traning;

public class Q12 {
    static void main(String[] args) {
        int[] arr={2,4,6,8,10,12};
        int start=0;
        int end= arr.length-1;
        int mid=start+(end-start)/2;
        int firsthalf=0;
        int secondhalf=0;
        for (int i = 0; i <= mid; i++) {
            firsthalf+=arr[i];

        }
        for (int i = mid+1; i <arr.length ; i++) {
            secondhalf+=arr[i];

        }
        System.out.println(firsthalf);
        System.out.println(secondhalf);


    }
}
