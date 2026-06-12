package com.JAVA_Programing.Traning;
import java.util.Scanner;

public class Q5 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={3,7,9,2,5};
        System.out.println("Enter a number");
        int x=sc.nextInt();

        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(x<arr[i]){
                count++;
            }

        }
        System.out.println(count);
    }

}
