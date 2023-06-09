package com.prowings.interviewprogram;

import java.util.Arrays;

public class ArrayEvenAndOddNum {
    public static void main(String[] args) {
        int a[]={1,2,5,4,7,8,11,20};
       arrayEvenAndOdd(a);

    }
    public static  void arrayEvenAndOdd(int a[]){
        int b[]=new int[a.length];
        int index=0;
        //ad all the even num in resultant array
        for(int i=0;i< a.length;i++){
            if(a[i]%2==0){
                b[index]=a[i];
                index++;
            }
        }
        //ad all the odd num in resultant array
        for(int i=0;i< a.length;i++){
            if(a[i]%2!=0){
                b[index]=a[i];
                index++;
            }
        }
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
