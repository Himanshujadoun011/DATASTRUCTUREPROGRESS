package com.JAVA_Programing.JavaBasic.LinkedList;

public class Doubly_LinkedList {
    Node head;
    Node tail;
    class Node{
        Node prev;
        int data;
        Node next;
        Node(int data){
            this.prev=null;
            this.data=data;
            this.next=null;
        }
    }
    public void addfirst(int data){
        Node n=new Node(data);
        if(head==null){
            n.prev=null;
            head=n;
            return;

        }else {
            head.prev = n;
            n.next = head;
            head = n;
        }
    }
    public void addlast(int data){
        Node n=new Node(data);
        if(head==null){
            addfirst(data);
            return;
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        n.prev=current;
        current.next=n;
        tail=n;
    }
    public void display(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }
    public void displayreverse(){
        Node n=tail;
        while(n!=null){
            System.out.println(n.data);
            n=n.prev;
        }
    }
    public void deletefirst(){

    }


}
