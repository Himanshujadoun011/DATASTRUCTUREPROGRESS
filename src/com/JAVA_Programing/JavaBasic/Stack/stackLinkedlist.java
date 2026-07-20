package com.JAVA_Programing.JavaBasic.Stack;

public class stackLinkedlist {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class stack{
        public static  Node head;
        public static boolean isempty(){
            if(head==null){
                return true;
            }
            return false;
        }
        public static void push(int data){
            Node newnode=new Node(data);
            if(isempty()){
                head=newnode;
                return;
            }
            newnode.next=head;
            head=newnode;
        }
        public static int pop(){
            if(isempty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        public static int peek(){
            if(isempty()){
                return -1;
            }
            return head.data;
        }
    }

    static void main(String[] args) {
        stack s=new stack();
        s.push(25);
        s.push(22);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println((s.peek()));

    }
}
