package com.JAVA_Programing.javabsic;

import java.util.Scanner;

public class bitmanipulation {
    //for find the bit at any position
    public static void get(int number,int position){
        int bit=1<<position;
        if((bit&number)==0){
            System.out.println("the bit is 0");
        }else{
            System.out.println("the bit is 1");
        }
    }
    //to set a bit to 1 at any position
    public static void set(int number,int position){
        int bit=1<<position;
        int new_number=bit|number;
        System.out.println(new_number);

    }
    //for set 0 at given position
    public static  void clear(int number,int position){
        int bit=1<<position;
        bit=~bit;
        int new_number=bit&number;
        System.out.println(new_number);
    }
    //to uppdate a specific digit at given position
    public static void update (int number,int position,int whattoupdate){
        if(whattoupdate==1){
            set(number,position);
        }else{
            clear(number,position);
        }
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int number=sc.nextInt();
        System.out.println("enter 1 for get bit , enter 2 for set bit , enter 3 for clear bit , enter 4 for update ");
        int operation=sc.nextInt();
        if(operation==1){
            System.out.println("enter position");
            int position=sc.nextInt();
            get(number,position);
        }else if(operation==2){
            System.out.println("enter position");
            int position=sc.nextInt();
            set(number,position);
        }else if(operation==3){
            System.out.println("enter position");
            int position=sc.nextInt();
            clear(number,position);
        }else if(operation==4){
            System.out.println("enter 1 or 0");
            int whattoupdate=sc.nextInt();
            System.out.println("enter position");
            int position=sc.nextInt();
            update(number,position,whattoupdate);
        }else{
            System.out.println("enter valid chooice");
            sc.close();
        }
    }
}
