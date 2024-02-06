package com.java.codingQuestions;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		int res=factorial(num);
		System.out.println(res);
		scan.close();



	}
	public static int factorial(int num)
	{
		if(num==1)
		{
			return 1;
		}
		else
		{
			return num*(factorial(num-1));
		}
	}
	
}


