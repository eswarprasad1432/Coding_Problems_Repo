package com.java.codingQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the size");
		int [ ] arr = new int[scan.nextInt()];
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		int res[ ]=bubbleSort(arr);
		System.out.println(Arrays.toString(res));
		scan.close();
		

	}
	public static int[ ] bubbleSort(int [ ] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;i++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		
		}
		return arr;
	}

}
