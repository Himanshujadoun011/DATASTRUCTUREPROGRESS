package com.JAVA_Programing.DATA_STRUCTURE;
import java.util.*;

public class LongestSubstringWithAtMostKDistinctCharacters {
    class Solution {
        public int kDistinctChar(String s, int k) {
            //your code goes here
            HashMap<Character, Integer> st = new HashMap<>();
            int i=0;
            int j=0;
            int max=0;
            while(j<s.length()){
                char curr=s.charAt(j);
                st.put(curr,st.getOrDefault(curr, 0) + 1);
                while(st.size()>k){
                    char cu=s.charAt(i);
                    st.put(cu,st.getOrDefault(cu, 0) - 1);
                    if (st.get(cu) == 0) {
                        st.remove(cu);
                    }
                    i++;
                }
                max = Math.max(max, j - i + 1);
                j++;
            }
            return max;
        }
    }
}
