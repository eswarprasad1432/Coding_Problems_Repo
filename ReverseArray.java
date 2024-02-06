package com.java.codingQuestions;

import java.util.*;

public class ReverseArray{

    public static void main(String[] args) 
    {
    	Scanner scanner=new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        System.out.println(Arrays.toString(reverseArray(arr)));
        scanner.close();
    }

    public static int[] reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // swap arr[left] and arr[right]
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // move left and right pointers
            left++;
            right--;
        }

        return arr;
        
    }
    
}
