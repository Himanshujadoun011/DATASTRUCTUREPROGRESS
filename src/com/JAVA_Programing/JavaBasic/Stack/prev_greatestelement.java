package com.JAVA_Programing.JavaBasic.Stack;

import java.util.Arrays;
import java.util.Stack;

public class prev_greatestelement {
    static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(prev_greatest(arr)));
    }

    private static int[] prev_greatest(int[] arr) {
        int[] result=new int[arr.length];
        result[0]=-1;
        Stack<Integer> s=new Stack<>();
        s.push(arr[0]);
        for(int i=1;i<arr.length;i++){
            while(!s.isEmpty() && s.peek()<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                 result[i]=-1;
            }else{
                result[i]=s.peek();
            }
            s.push(arr[i]);
        }
        return result;
    }
    private static int[] prev_smaller(int[] arr) {
        int[] result=new int[arr.length];
        result[0]=-1;
        Stack<Integer> s=new Stack<>();
        s.push(arr[0]);
        for(int i=1;i<arr.length;i++){
            while(!s.isEmpty() && s.peek()>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                result[i]=-1;
            }else{
                result[i]=s.peek();
            }
            s.push(arr[i]);
        }
        return result;
    }
}
