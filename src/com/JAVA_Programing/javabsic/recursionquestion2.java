package com.JAVA_Programing.javabsic;

import java.util.HashSet;

public class recursionquestion2 {
    public static void move(String str,int i,int count,String result){

        if(i==str.length()){
            for(int j=0;j<count;j++){
                result=result+'x';
            }
            System.out.println(result);
            return;
        }
        if(str.charAt(i)=='x'){
            count++;
            move(str,i+1,count,result);
        }else {
            result+=str.charAt(i);
            move(str,i+1,count,result);
        }

    }
    public static boolean[] map=new boolean[26];
    public static void remove(String str,int i,String result){
        if(i==str.length()){
            System.out.println(result);
            return;
        }

        char current=str.charAt(i);
        if(map[current-'a']==true){
            remove(str,i+1,result);
        }else{
            result+=current;
            map[current-'a']=true;
            remove(str,i+1,result);
        }

    }
    public static void substring(String str,int i,String result){
        if(i==str.length()){
            System.out.println(result);
            return;
        }
        char current=str.charAt(i);
        substring(str,i+1,result+current);
        substring(str,i+1,result);
    }
    public static void unniquesubstring(String str,int i,String result,HashSet<String> set1){
        if(i==str.length()){
            if(set1.contains(result)){
                return;
            }else{
                System.out.println(result);
                set1.add(result);
                return;
            }
        }
        char current=str.charAt(i);
        unniquesubstring(str,i+1,result+current,set1);
        unniquesubstring(str,i+1,result,set1);
    }

    static void main(String[] args) {
        String str="axbcxxd";
        String  str1="asdnniasaaajd";
        String str2="aaa";
        HashSet<String> set=new HashSet<>();
        move(str,0,0,"");
        remove(str1,0,"");
        substring(str2,0,"");
        unniquesubstring(str2,0,"",set);

    }
}
