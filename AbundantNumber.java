package com.java.codingQuestions;

import java.util.Scanner;

public class AbundantNumber {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=scan.nextInt();
		boolean res=abundant(a);
		if(res==true)
		{
			System.out.println("Entered number "+a+" is abundant");
		}
		else
		{
			System.out.println("Entered number "+a+" is  not abundant");
		}
		scan.close();
		
	}
	public static boolean abundant(int num)
	{
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		if(sum>num)
		{
			return true;
		}
		else
		{
			return false;
		}

	}
	
	

}
