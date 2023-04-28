package com.prowings.interviewprogram;

import java.util.Arrays;
import java.util.Scanner;

public class AdditionOfThreeElementArray {
    public static void main(String[] args) {
        int[] a = {1, 5, 6, 8, 9, 4};

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the targetsum : ");
        int targetSum = sc.nextInt();
        for (int i = 0; i < a.length - 2; i++) {
            for (int j = i + 1; j < a.length; j++) {
                for (int k = j + 1; k < a.length; k++) {
                    if (a[i] + a[j] + a[k] == targetSum) {
                        int[] result = {a[i], a[j], a[k]};
                        System.out.println(Arrays.toString(result));
                    }
                }
            }
        }

    }

}
