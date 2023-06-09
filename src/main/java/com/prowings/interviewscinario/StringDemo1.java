package com.prowings.interviewscinario;

public class StringDemo1 {
    public static void main(String[] args) {
        String s1 = "123";
        Object o1 = s1;
        System.out.println(s1 == o1);
        System.out.println(s1.equals(o1));
        System.out.println(s1.equals("123"));
        System.out.println(o1.equals("123"));

        s1.concat("4");
        System.out.println(s1.equals(o1));
    }
}
