package com.JAVA_Programing.DATA_STRUCTURE;
import java.util.* ;
public class searchinstring {
    public static void main() {
        Scanner sc=new Scanner(System.in);
        String name="Kunal";
        char target='j';
        System.out.println("enter start and end index for search b/n range ");
        int s=sc.nextInt();
        int e= sc.nextInt();
        System.out.println(stringsearch(name,target));
        System.out.println(stringsearch(name,target,s,e));

    }
    static boolean stringsearch(String str,char x){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(x==str.charAt(i)){
                return true;
            }
        }
        return false;

    }
    //for search element in given range code
    static boolean stringsearch(String str,char x,int start, int end){
        if(str.length()==0){
            return false;
        }
        for(int i=start;i<end;i++){
            if(x==str.charAt(i)){
                return true;
            }
        }
        return false;

    }
}

