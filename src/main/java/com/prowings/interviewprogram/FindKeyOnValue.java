package com.prowings.interviewprogram;

import java.util.HashMap;
import java.util.Map;

public class FindKeyOnValue {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("a",5);
        map.put("b",1);
        map.put("c",15);
        map.put("b",12);
        System.out.println(map);
        int targetValue=1;
        String foundKey=null;
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if (entry.getValue().equals(targetValue)){
                foundKey= entry.getKey();
                break;
            }
        }
        if (foundKey!=null){
            System.out.println("found key: "+ foundKey);
        }
        else{
            System.out.println("key not found on value: "+targetValue);
        }



    }
}
