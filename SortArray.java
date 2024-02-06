package com.java.codingQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int [ ] arr=new int[scan.nextInt()];
		System.out.println("Enter the array contents");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		sortedArray( arr);
		scan.close();
		

	}
	public  static void sortedArray(int [ ] arr)
	{
		Arrays.sort(arr);
		for(int a:arr)
		{
			System.out.println(a);
		}
	}

}
