package com.prowings;
import java.util.Scanner;
public class Main1 {
        public static void main(String[] args) {
            int count = 0;
            for (int i = 1; i <= 100; i++) {
                String numStr = Integer.toString(i);
                for (int j = 0; j < numStr.length(); j++) {
                    if (numStr.charAt(j) == '5') {
                        count++;
                    }
                }
            }
            System.out.println("The occurrence of digit 5 in the range from 1 to 500 is: " + count);
        }



}
