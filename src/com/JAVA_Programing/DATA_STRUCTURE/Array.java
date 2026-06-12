package com.JAVA_Programing.DATA_STRUCTURE;
import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter length of an array");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("enter elements in array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("enter element to find ");
        int a=sc.nextInt();
        linear_search(arr,a);
        minimum(arr);

        System.out.println("no. contain even digit="+ find(arr));

    }
    static void linear_search(int[] num,int  x){
        if (num.length== 0){
            System.out.println("not found");
        }
        for(int i=0;i< num.length;i++){
            int element=num[i];
            if(element==x){
                System.out.println("found at index "+ i);
                return;
            }


        }
        System.out.println("not found");

    }

    static void minimum(int[] num) {
        int min=num[0];
        for(int i=1;i<num.length;i++){
            if(min>num[i]){
                min=num[i];
            }


        }
        System.out.println("minimum value="+min);


    }

    static int find(int[] num) {
        int count=0;
        for(int i=0;i<num.length;i++){
            if(even(num[i])){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int x=digit(num);
        if( x%2==0){
            return true;
        }
        return false;

    }
    //check how many no. are contain even no of digits
    static int digit(int num) {
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;

    }

}
