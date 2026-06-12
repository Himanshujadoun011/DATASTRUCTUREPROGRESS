package com.JAVA_Programing.Traning;

import java.util.Scanner;

public class Q2_1 {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        System.out.println(sum(a));

    }
    static int sum(int x){
        return (x+sum(x-1));
    }
}
