package com.prowings.interviewprogram;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortedMapByValue {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 12);
        map.put("c", 27);
        map.put("d", 9);
        System.out.println(map);
//        Map<String,Integer> sortedByValue=map.entrySet().stream().sorted((e1,e2)->{
//            return e1.getValue()-e2.getValue();
//        }).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1, LinkedHashMap::new));
//        System.out.println(sortedByValue);
//
        Map<String, Integer> mp = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldvalue, newvalue) -> oldvalue, LinkedHashMap::new));
        System.out.println(mp);


    }
}
