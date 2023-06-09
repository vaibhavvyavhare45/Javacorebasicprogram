package com.prowings.interviewprogram;

import java.util.HashMap;
import java.util.Map;

public class OccurenceByChar {
    public static void main(String[] args) {
        String s="Vaibhav";
        char []ch=s.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for (char c:ch) {
            if(!map.containsKey(c)) {
                map.put(c, 1);
            }
            else {
                Integer i = map.get(c);
                map.put(c, i + 1);
            }
        }
        System.out.println(map);
    }

}
