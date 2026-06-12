package com.JAVA_Programing.Traning;
import java.util.*;

public class Assignment {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number to find factorial");
        int a=sc.nextInt();
        System.out.println(factorial(a));
        int[] nums={3,0,1};
        int sum=0;
        for(int i=0;i<=nums.length;i++){
            sum+=i;
        }
        for(int j=0;j<nums.length;j++){
            sum-=nums[j];
        }
        System.out.println(sum);

    }
    static int factorial(int x){
        int fact=1;
//        if(x<=0){
//            return 1;
//        }else{
//            return x*factorial(x-1);
//        }
        for(int i=1;i<=x;i++){
            fact=fact*i;
        }
        return fact;




    }

}
