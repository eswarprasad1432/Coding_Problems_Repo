package com.java.codingQuestions;

import java.util.Scanner;

public class FibSeries {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the range");
		int count=scan.nextInt();
		int num1=0;
		int num2=1;
		for(int i=0;i<count;i++)
		{
			System.out.print(num1+" ");
			int num3=num1+num2;
			num1=num2;
			num2=num3;
		}
		scan.close();
	}

}
