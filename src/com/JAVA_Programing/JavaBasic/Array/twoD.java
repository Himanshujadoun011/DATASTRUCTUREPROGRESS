package com.JAVA_Programing.JavaBasic.Array;

import java.util.Arrays;
import java.util.Scanner;

public class twoD {
    static void search(int target , int[][] array, int row, int coloumb){
        for (int i = 0; i < row ; i++) {
            for(int j=0;j<coloumb;j++){
                if(target==array[i][j]){
                    System.out.println("found");

                }
            }
        }
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row and coloums of the matics");
        int row=sc.nextInt();
        int coloumb=sc.nextInt();
        int[][] arr=new int[row][coloumb];
        System.out.println("enter element in the array");
        for(int i=0;i<row;i++){
            for(int j=0;j<coloumb;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <coloumb ; j++) {
                System.out.print(arr[i][j]+" ");
            }

        }
        System.out.println();
        System.out.println(Arrays.deepToString(arr));
        System.out.println("enter a number");
        int target=sc.nextInt();
        search(target,arr,row,coloumb);
    }
}
