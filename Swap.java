package com.java.codingQuestions;

public class Swap 
{

	public void swapTwo(int a,int b)
	{
		System.out.println("Before Swapping the values a="+a+" b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping the values a="+a+" b="+b);
		
	}
}
