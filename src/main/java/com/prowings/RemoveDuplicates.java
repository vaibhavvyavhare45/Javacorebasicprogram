package com.prowings;

import java.util.stream.Stream;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s="AAABBBAAABABCCCC";
        Stream<Character> uniqueChar=s.chars().distinct().mapToObj(c->(char)c);
       uniqueChar.forEach(System.out::print);

    }
}
