package com.prowings.interviewprogram;

public class PrimeNumber {
    public static void main(String[] args) {
      int min=2,max=50;

      for(int i=min;i<max;i++){
          int count=0;
          for(int j=2;j*j<=i;j++){
            if(i%j==0){
                count++;
                break;
            }
          }
          if(count==0){
              System.out.println(i);
          }
      }
    }
}
