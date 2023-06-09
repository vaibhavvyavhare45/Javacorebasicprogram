package com.prowings;

import java.util.Arrays;

public class ConcatSortedArray {
    public static void main(String[] args) {
        int a[] = {4, 2, 9, 7};
        int b[] = {3, 1, 6, 8};
        concatSortedArray(a, b);

    }

    public static int[] concatSortedArray(int[] a, int b[]) {
        int c[] = new int[a.length + b.length];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            c[index] = a[i];
            index++;
        }
        for (int i = 0; i < b.length; i++) {
            c[index] = b[i];
            index++;
        }
        for (int i = 0; i < c.length; i++) {
            for (int j = i; j < c.length; j++) {
                if (c[i] > c[j]) {
                    int temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(c));
        return c;
    }
}
