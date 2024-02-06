package com.java.codingQuestions;

import java.util.Scanner;

public class FriendlyPairs {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=scan.nextInt();
		System.out.println("Enter second number");
		int num2=scan.nextInt();
		int res1=ammicablePairs(num1);
		int res2=ammicablePairs(num2);
		if(res1/num1==res2/num2)
		{
			System.out.println("Ammicable Pairs");
		}
		else
		{
			System.out.println("Not Ammicable Pairs");
		}
		scan.close();
	}
	public static int ammicablePairs(int num)
	{
		int sum1=0;
	
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				sum1=sum1+i;
			}
		}
		return sum1;
		
	
	}

}
