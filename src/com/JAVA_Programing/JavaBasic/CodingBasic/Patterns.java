package com.JAVA_Programing.JavaBasic.CodingBasic;

import java.util.Scanner;

public class Patterns {
    public static void main(){
        int n=5,m=5;
       /* for(i=0;i<5;i++){
            for(j=1;j<6;j++){
                System.out.print(" *");
            }
            System.out.println();
        }*/
        /*for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1||j==1||i==n||j==m){
                    System.out.print("*");

                }else{
                    System.out.print(" ");
                }
            }
        System.out.println();
        }*/
        /*for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
        }*/
        /*for(int i=1;i<=n;i++){
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }*/
        /*for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(); 

        }*/
    }

    public static class loops {
        public static  void main(){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();

            for(int i=1;i<11;i=i+1){

                System.out.println("*");

            }



        }
    }
}
