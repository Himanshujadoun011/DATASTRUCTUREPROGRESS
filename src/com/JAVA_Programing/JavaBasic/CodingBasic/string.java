package com.JAVA_Programing.JavaBasic.CodingBasic;

import java.util.Scanner;

public class string {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("enter size of string array");
//        int n=sc.nextInt();
//        String[] arr=new String[n];
//        int combinelength=0;
//        System.out.println("enter elements in string array");
//        for (int i = 0; i <n ; i++) {
//            arr[i]=sc.next();
//            combinelength+=arr[i].length();
//        }
//        System.out.println("length of all string="+combinelength);
        System.out.println("enter string");
        String str=sc.next();
        String result=" ";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='i'){
                result+='e';
            }else{
                result+=str.charAt(i);
            }

        }
        System.out.println(result);
    }

}
