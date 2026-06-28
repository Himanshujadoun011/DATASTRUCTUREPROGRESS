package com.JAVA_Programing.JavaBasic.Recursionconcept;

public class recursionquestion3 {
    public static String[] arr={".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void combination(String str,int idx,String result){
        if(idx==str.length()){
            System.out.println(result);
            return;
        }

        char current=str.charAt(idx);
        String str1=arr[current-'0'];
        for(int i=0;i<str1.length();i++){
            combination(str,idx+1,result+str1.charAt(i));

        }
    }

    static void main(String[] args) {
        combination("23",0,"");
    }
}
