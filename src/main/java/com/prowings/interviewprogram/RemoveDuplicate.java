package com.prowings.interviewprogram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(1);
        li.add(4);
        li.add(3);
        li.add(2);
        System.out.println(li);

        //removing duplicate from list
        Set<Integer> set = new HashSet<>(li);
        System.out.println(set);

        //only print the duplicate  from list
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for (Integer number : li) {
            if (s1.contains(number))
                s2.add(number);
            else
                s1.add(number);
        }
        System.out.println(s2);

    }


}
