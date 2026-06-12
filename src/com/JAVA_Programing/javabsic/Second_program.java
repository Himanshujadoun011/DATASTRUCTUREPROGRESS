package com.JAVA_Programing.javabsic;

import java.util.*;
public class Second_program {
    public static void main(){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter a number ");
    int x=sc.nextInt();
    if(x%2==0) {
        System.out.println("No. is not odd");
    }
    else {
        System.out.println("No. is odd ");
    }
}
}