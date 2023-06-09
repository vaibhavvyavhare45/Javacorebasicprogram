package com.prowings.interviewprogram;

import java.util.*;

public class SortMapByValue {
    public static void main(String[] args) {
        HashMap<String,Integer> m=new HashMap<>();
        m.put("a",77);
        m.put("b",7);
        m.put("c",3);
        m.put("d",45);
        sortByValue(m);

    }
    public static  void sortByValue(HashMap<String,Integer> hm){
        Set<Map.Entry<String,Integer>> set=hm.entrySet();
        ArrayList<Map.Entry<String,Integer>> al=new ArrayList<>(set);
        Collections.sort(al, new EntryValueComparator());
        for (Map.Entry<String,Integer> entry:al){
            System.out.println(entry.getKey()+" "+entry.getValue());

        }
    }

}
