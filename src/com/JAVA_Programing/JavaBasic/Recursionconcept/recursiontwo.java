package com.JAVA_Programing.JavaBasic.Recursionconcept;

import java.util.Scanner;

public class recursiontwo {
    public static int height(int x,int n){
        if(n==0){
            return 1;
        }
        if (x==0){
            return 0;
        }
        return x*height(x,n-1);

    }
    public static int height2(int x,int n){
        if(n==0){
            return 1;
        }
        if (x==0){
            return 0;
        }
        if(n%2==0){
            return height2(x,n/2)*height(x,n/2);
        }else {
            return height2(x,n/2)*height2(x,n/2)*x;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of x");
        int x=sc.nextInt();
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        System.out.println(height2(x,n));
    }
}
