package com.JAVA_Programing.DATA_STRUCTURE;
import java.util.*;

public class twodarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][3];
        System.out.println("Enter element in 3*3 array");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter no to search");
        int target= sc.nextInt();
        System.out.println(searchelement(arr,target));



    }
    static String searchelement(int[][] num,int x){
        if(num.length==0){
            return "not found";
        }
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                if(num[i][j]==x){
                    return "found";
                }
            }
        }
        return "not found";

    }

}
