package com.JAVA_Programing.javabsic;

import java.util.Scanner;

public class hardlevelrecursionproblem {
    public static void hanoi(int n,String source,String temp,String destination){
        if(n==1){
            System.out.println("transferdisc  "+n+" from "+source+" to "+destination);
            return;
        }
        hanoi(n-1,source,destination,temp);
        System.out.println("transfer "+n+" from "+source+" to "+destination);
        hanoi(n-1,temp,source,destination);


    }
    public static void reverse(String a,int index){
        if(index<0){
            return;
        }
        System.out.print(a.charAt(index));
        reverse(a,index-1);
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  disc=1;
        hanoi(disc,"s", "h","d");
        System.out.println("enter a string");
        String a=sc.next();
        int length=a.length();
        reverse(a,length-1);



    }
}
