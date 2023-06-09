package com.prowings.interviewprogram;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapUniqueValKey {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"a");
        map.put(2,"a");
        map.put(3,"b");
        map.put(4,"b");
        map.put(5,"b");
        map.put(6,"c");
       Map<Integer,String> m=new HashMap<>();
       Set<String> set=new HashSet<>();
        for (Map.Entry<Integer,String> entry:map.entrySet()) {
            if(!set.contains(entry.getValue())){
                m.put(entry.getKey(), entry.getValue());
                set.add(entry.getValue());
            }

        }
        System.out.println();
    }
}
