package com.JAVA_Programing.JavaBasic.Array;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        // to add element in arraylist
        list.add(25);
        list.add(432);
        list.add(25);
        list.add(6023);
        list.add(70);
        list.add(80234);
        System.out.println(list);
        // for print all element of the array list
        for (int i = 0; i <list.toArray().length ; i++) {
            System.out.print(list.get(i)+" ");

        }
        System.out.println();
        System.out.println(list.toArray().length);//for length of the arraylist
        //to access element
        System.out.println(list.get(1)); //1== index
        // to  set or update element
        list.set(1,30);
        System.out.println("after set element st index=1 "+list.get(1));
        // remove element
        list.remove(5);// 5==index
        System.out.println("arraylist after remove element ");
        for (int i = 0; i <list.toArray().length ; i++) {
            System.out.print(list.get(i)+" ");

        }
        System.out.println();
        // sort element of the list
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

    }
}
