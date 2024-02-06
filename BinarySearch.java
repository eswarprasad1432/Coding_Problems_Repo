package com.java.codingQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int [ ] arr=new int[scan.nextInt()];
		System.out.println("Enter the contents of an array in sorted order");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Enter the key to be searched");
		int key=scan.nextInt();
		int res=binarySearch(arr, key);
		if(res>=0)
		{
			System.out.println(key+" is found at "+res);
		}
		else
		{
			System.out.println(key+" Element not found");
		}
		scan.close();
	}
	public static int binarySearch(int [ ] arr,int key)
	{
		int low=arr[0];
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==key)
			{
				return mid;
			}
			else if(key>arr[mid])
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		return -1;
	}

}
