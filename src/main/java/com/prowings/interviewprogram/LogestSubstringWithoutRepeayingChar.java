package com.prowings.interviewprogram;

import java.util.HashSet;
import java.util.Set;

public class LogestSubstringWithoutRepeayingChar {
    public static void main(String[] args) {
    String s="abcabcbb";
    lengthOf(s);
    }
    public static int lengthOf(String s){
        int length=s.length();
        Set<Character> set=new HashSet<>();
        int i=0,j=0,maxLength=0;
        while (i<length && j<length){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                maxLength=Math.max(maxLength,j-i);
            }
            else {
                set.remove(s.charAt((i++)));
            }
        }
        return maxLength;
    }
}
