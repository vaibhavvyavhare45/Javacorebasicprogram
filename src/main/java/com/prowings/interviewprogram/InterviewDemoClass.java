package com.prowings.interviewprogram;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterviewDemoClass {
    public static void main(String[] args) {
        String str="vaibhav vyavhare java developer";
        List<String> li= Arrays.asList(str.split(""));
        Map<String,Long> charCount=li.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(charCount);
        System.out.println(li.size());



    }
}
