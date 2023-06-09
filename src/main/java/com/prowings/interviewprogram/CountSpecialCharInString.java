package com.prowings.interviewprogram;

public class CountSpecialCharInString {
    public static void main(String[] args) {
        String s="Vaibhav#@!";
        String specialCharRemoved="";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))){
                count++;
            }
            else{
                specialCharRemoved=specialCharRemoved+s.charAt(i);
            }

        }
        if(count==0) {
            System.out.println("there is no special character in string");
        }
        else {
            System.out.println("there is a special character in String " + count);
        }
        System.out.println(specialCharRemoved);
    }
}
