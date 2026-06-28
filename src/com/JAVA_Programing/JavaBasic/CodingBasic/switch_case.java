package com.JAVA_Programing.JavaBasic.CodingBasic;

import java.util.Scanner;

public class switch_case {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1 for greet in English, 2 for Hindi, 3 for Franch");
        int button=sc.nextInt();
        /*if(button==1){
            System.out.println("Hello");
        }else if(button==2){
            System.out.println("Namaste");
        }else if(button==3){
            System.out.println("Bonjour");
        }else{
            System.out.println("Invalid Input");
        }*/
        switch(button){
            case 1:{
                System.out.println("Hello");
                break;
            }
            case 2:{
                System.out.println("Namaste");
                break;
            }
            case 3:{
                System.out.println("bonjour");

            }
            default:{
                System.out.println("Invalid input");
            }
        }
    }
}
