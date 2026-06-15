package com.JAVA_Programing.javabsic;

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

    static void main(String[] args) {
        String str="axbcxxd";
        move(str,0,0,"");

    }
}
