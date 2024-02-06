package com.java.codingQuestions;

import java.util.*;

public class UniqueLetters {

    public static void main(String[] args) {
        String str = "aabbccddee";
        System.out.println(Arrays.toString(uniqueLetters(str)));
    }

    public static char[] uniqueLetters(String str) {
        Set<Character> uniqueSet = new HashSet<>();
        char[] strArray = str.toCharArray();

        for (char c : strArray) {
            uniqueSet.add(c);
        }

        char[] uniqueArray = new char[uniqueSet.size()];
        int index = 0;

        for (char c : uniqueSet) {
            uniqueArray[index++] = c;
        }

        return uniqueArray;
    }
}
