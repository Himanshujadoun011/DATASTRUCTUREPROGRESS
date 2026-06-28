package com.JAVA_Programing.JavaBasic.Recursionconcept;

import java.util.Scanner;

public class recursion {
    public static int factorial(int x){
        if(x==0){
            return 1;
        }else{
            return x*factorial(x-1);
        }
    }
    public  static void fabonaci(int a,int b ,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        fabonaci(b,c,n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number for find a foctorial ");
        int n=sc.nextInt();
        int fact=factorial(n);
        System.out.println(fact);
        int a=0;
        int b=1;
        System.out.println("enter no. of terms");
        int n1=sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        fabonaci(a,b,n1-2);
    }
}
