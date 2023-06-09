package com.prowings;

import java.util.HashMap;
import java.util.Map;

public class MatchStringCharacterInarray {
    public static void main(String[] args) {
        String[] arr = {"pu","ple","rp","up","le"};
        String s = "Vaibhav";
        boolean result = canConstruct(arr, s);
        System.out.println(result);
    }
    public static boolean canConstruct(String[] arr, String s) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 0; i <= s.length(); i++) {
            if (!dp[i]) {
                continue;
            }
            for (String str : arr) {
                if (i + str.length() <= s.length() && s.substring(i, i + str.length()).equals(str)) {
                    dp[i + str.length()] = true;
                }
            }
        }

        return dp[s.length()];
    }




}
