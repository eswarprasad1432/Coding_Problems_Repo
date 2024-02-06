package com.java.codingQuestions;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String str = "((Mission)) (Successful))";
        System.out.println(Arrays.toString(uniqueParentheses(str)));
    }

    public static String[] uniqueParentheses(String str) {
        List<String> validStrings = new ArrayList<>();
        dfs(str, 0, 0, validStrings);
        return validStrings.toArray(new String[0]);
    }

    public static void dfs(String str, int left, int right, List<String> validStrings) {
        for (int i = left; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                dfs(str, i + 1, right, validStrings);
            } else if (str.charAt(i) == ')') {
                if (right > left) {
                    dfs(str, i + 1, right - 1, validStrings);
                } else {
                    String temp = str.substring(0, i) + str.substring(i + 1);
                    validStrings.add(temp);
                }
            }
        }
    }
}
