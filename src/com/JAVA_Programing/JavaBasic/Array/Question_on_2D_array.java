package com.JAVA_Programing.JavaBasic.Array;

import java.util.Scanner;

public class Question_on_2D_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] array=new int[n][m];
        System.out.println("enter the elements of the array");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j]=sc.nextInt();

            }

        }
        System.out.println("transpose of the matrix");{
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <m; j++) {
                    System.out.print(array[j][i]+" ");
                }

            }
        }
    }
}
