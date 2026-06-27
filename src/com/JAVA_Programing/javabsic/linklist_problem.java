package com.JAVA_Programing.javabsic;

import org.w3c.dom.Node;

import java.util.*;

public class linklist_problem {
    static void rem(LinkedList<Integer> list){
       while(list.getLast()>25){
           list.removeLast();
       }
        System.out.println(list.size());
    }
    static int search(int target, LinkedList<Integer> LinkedList){
        for(int i=0;i<LinkedList.size();i++){
            if(LinkedList.get(i)==target){
                return i;
            }
        }
        return -1;

    }
    static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        /*list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);
        int target = 7;
        int index=search( target, list);
        System.out.println(index);*/
        for(int i=1;i<51;i++){
            list.add(i);
        }
        System.out.println(list);
        System.out.println(list.size());
        rem(list);
        search(3,list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }

}
