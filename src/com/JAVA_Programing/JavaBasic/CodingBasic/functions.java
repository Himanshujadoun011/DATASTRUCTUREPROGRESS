package com.JAVA_Programing.JavaBasic.CodingBasic;
import java.util.*;


public class functions {
    //Syntax returntype functionname(parameters[x,y]){}
    static int factorial(int x){
        if(x==0){
            return 1;
        }else{
            return x*factorial(x-1);
        }
    }
    static int average(int x,int y, int z){
        return ((x+y+z)/3);
    }
    static int sumodd(int x){
        int sum=0;
        for(int i=1;i<=x;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        return sum;

    }
    static void curcumfarance(int radius){
        double cur=2*3.14*radius;
        System.out.println(cur);
    }
    static void fabonacy(int n){
        int fac1=0;
        int fac2=1;
        System.out.println(fac1);
        System.out.println(fac2);
        for (int i = 0; i <n; i++) {
            int fac3=fac1+fac2;
            System.out.println(fac3);
            fac1=fac2;
            fac2=fac3;

        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       /* System.out.println("enter a number ");
        int x=sc.nextInt();
        System.out.println("factorial of this no.. is "+ factorial(x));
        int positive=0;
        int negative=0;
        int zeros=0;
        int choice=1;
        do{
            System.out.println("enter a number ");
            int e=sc.nextInt();
            if(e>0){
                positive++;
            }else if(e<0){
                negative++;
            }else{
                zeros++;
            }
            System.out.println("type 1 for re enter a number  and for cancel type 0");
            choice=sc.nextInt();
        }while(choice==1);
        System.out.println("positive no."+positive + "...negative no:"+negative +"...zeros:"+zeros);*/
        System.out.println("enter two number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(Math.pow(a,b));
        fabonacy(5);


    }

}
