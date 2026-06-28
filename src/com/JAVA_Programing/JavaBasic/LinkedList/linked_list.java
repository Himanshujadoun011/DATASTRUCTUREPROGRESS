package com.JAVA_Programing.JavaBasic.LinkedList;

import java.util.*;

public class linked_list {
    static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.addFirst("himasnhu");
        list.add("Jadoun");
        list.addLast(" GL");
        list.addLast("Bajaj");
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
