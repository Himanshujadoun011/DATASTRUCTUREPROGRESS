package com.JAVA_Programing.JavaBasic.LinkedList;

public class main {
    static void main(String[] args) {
        Doubly_LinkedList ll=new Doubly_LinkedList();
        ll.addfirst(22);
        ll.addfirst(23);
        ll.addlast(35);
        ll.addlast(32);
        System.out.println("tail=>"+ll.tail.data+" head=>"+ll.head.data);
        ll.display();
        ll.displayreverse();
    }
}

