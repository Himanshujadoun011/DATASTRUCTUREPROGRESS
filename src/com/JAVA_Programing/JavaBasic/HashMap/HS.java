package com.JAVA_Programing.JavaBasic.HashMap;

import java.util.HashSet;

public class HS {
    static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(23);
        set.add(12);
        set.add(21);
        System.out.println(set.size());//print size
        System.out.println(set.isEmpty());//return true or false acc to set is empty or not
        System.out.println(set.contains(21));//check element present or not
        System.out.println(set);//print set
        System.out.println(set.remove(21));//remove single element
        System.out.println(set);
        set.clear();//remove all elements at once
        System.out.println(set);

    }
}
