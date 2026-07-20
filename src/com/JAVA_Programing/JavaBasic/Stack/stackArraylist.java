package com.JAVA_Programing.JavaBasic.Stack;

import java.util.ArrayList;

public class stackArraylist {
    public static class stack{
        static ArrayList<Integer> stack=new ArrayList<>();

        static boolean is_empty(){
            return stack.isEmpty();
        }
        static void push(int data){
            stack.add(data);
        }
        static int pop(){
            int top=stack.getLast();
            stack.removeLast();
            return top;
        }
        static void peak(){
            if(is_empty()){
                System.out.println(-1);
            }else {
                System.out.println("top="+stack.getLast());
            }
        }
    }
    static void main(String[] args){
        stack s=new stack();
        s.push(22);
        s.push(245);
        s.push(23);
        s.peak();
        System.out.println("poped element="+s.pop());
        s.peak();
    }

}
