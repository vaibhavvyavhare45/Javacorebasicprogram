package com.prowings;

public class FindEvenOddNumberwithoutUsingModulo {

   static boolean isEven(int a){
       boolean isEven=true;
       for(int i=1;i<=a;i++){
           isEven=!isEven;
       }
       return  isEven;
   }


    public static void main(String[] args) {
    int n=102;
    if(isEven(n)){
        System.out.println("the number is even ");
    }
    else {
        System.out.println("the number is odd  ");
    }
    }
}
