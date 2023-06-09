package com.prowings;

public class PalindromeInArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 1, 2, 3};
        System.out.println(isPalindrome(a));
    }
    public static boolean isPalindrome(int a[]) {
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            if (a[left] != a[right]) {
                return false;
            }
            left++;
            right--;

        }
        return true;
    }
}
