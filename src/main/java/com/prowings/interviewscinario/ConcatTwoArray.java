package com.prowings.interviewscinario;

import java.util.Arrays;

public class ConcatTwoArray {
    public static void main(String[] args) {
        int a[]={1,2,4};
        int b[]={0,3,5,8,9};
        sortConcatArray(a,b);
    }
    public static int[] sortConcatArray(int a[],int b[]){
        int c[]=new int[a.length+ b.length];
        int index=0;
        for(int i=0;i<a.length;i++){
            c[index]=a[i];
            index++;
        }
        for(int i=0;i<b.length;i++){
            c[index]=b[i];

            index++;
        }

        for(int i=0;i<c.length;i++){
            for (int j=i;j<c.length;j++){
                if(c[i]>=c[j]){
                    int temp=c[i];
                    c[i]=c[j];
                    c[j]=temp;
                }

            }


        }
        System.out.println(Arrays.toString(c));

      return c;
    }
}
