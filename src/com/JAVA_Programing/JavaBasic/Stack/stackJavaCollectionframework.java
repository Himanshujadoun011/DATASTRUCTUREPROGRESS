package com.JAVA_Programing.JavaBasic.Stack;

import java.util.Stack;

public class stackJavaCollectionframework {
    public static void pushatbottom(int data,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushatbottom(data,s);
        s.push(top);
    }
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverse(s);
        pushatbottom(top,s);

    }
    static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(22);
        s.push(24);
        s.push(34);
        System.out.println(s.peek());
        //System.out.println("poped element"+s.pop());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        //pushatbottom(2,s);
        reverse(s);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }

    }
}
