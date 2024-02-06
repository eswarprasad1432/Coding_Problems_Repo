package com.java.codingQuestions;

import java.util.Scanner;

public class OddArray {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=scan.nextInt();
		int [ ] arr=new int[size];
		System.out.println("Enter the contents");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		boolean res=containsOdd(arr);
		if(res==true)
		{
			System.out.println("Integer array contains odd numbers");
		}
		else
		{
			System.out.println("Integer array does not contains odd numbers");
		}
		scan.close();	
	}
	public static boolean containsOdd(int [ ] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				return true;
			}
		}
		return false;
	}

}
