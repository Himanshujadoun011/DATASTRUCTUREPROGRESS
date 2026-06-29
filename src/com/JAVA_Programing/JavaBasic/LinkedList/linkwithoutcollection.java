package com.JAVA_Programing.JavaBasic.LinkedList;

public class linkwithoutcollection {
    node head;
    class node{
         String data;
         node next;
         node(String data ){
             this.data=data;
             this.next=null;
         }
    }
    public void addfirst(String data){
        node n=new node(data);
        if(head==null){
            head=n;
            return;
        }
        n.next=head;
        head=n;
    }
    public void addlast(String data){
        node n=new node(data);
        if(head==null){
            head=n;
            return;
        }
        node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=n;
    }
    public void print(){
        node current=head;
        while(current   !=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
    public void deletedirst (){
        if(head==null){
            return;
        }
        head=head.next;
    }
    public void deletelast(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        node secondlast=head;
        node last=head.next;
        while(last.next!=null){
            last=last.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;

    }
    public void reverseiterative(){
        if(head==null || head.next==null){
            return;
        }
        node previous=head;
        node current=head.next;
        while(current.next!=null){
            node next=current.next;
            current.next=previous;

            previous=current;
            current=next;
        }
        head.next=null;
        head=previous;
    }
    public static void main(String[] args) {
        linkwithoutcollection list=new linkwithoutcollection();
        list.addfirst("Himanshu");
        list.addlast("Jadoun");
        list.addlast("DSA");
        list.print();
        //list.reverseiterative();
        //list.print();

    }

}
