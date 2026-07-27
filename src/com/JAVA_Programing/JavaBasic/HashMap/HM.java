package com.JAVA_Programing.JavaBasic.HashMap;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class HM {
    static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        // add element
        hm.put("Bulandshahr",130);
        hm.put("Aligarh",80);
        hm.put("Delhi",85);
        System.out.println(hm);
        // if key is already exist & we use put function it update the value of the key
        hm.put("Aligarh",79);
        System.out.println(hm);
        //check key is exist or not
        System.out.println(hm.containsKey("Aligarh"));
        //check te value is exist or not
        System.out.println(hm.containsValue(33));
        // get value of a specific key
        System.out.println(hm.get("Delhi"));
        //iteration in map
        for(Map.Entry<String,Integer> s:hm.entrySet()){
            System.out.println(s.getKey()+" ");
            System.out.println(s.getValue()+" ");
        }
        //make set of keys or values
        Set<String> key=hm.keySet();
        System.out.println(key);
        for(String k:key){
            System.out.println(k+" "+hm.get(k));
        }
        // to remove element
        hm.remove("Delhi");
        System.out.println(hm);


    }
}
