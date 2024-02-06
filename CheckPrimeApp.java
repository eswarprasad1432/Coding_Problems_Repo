package com.java.codingQuestions;

import java.util.Scanner;

public class CheckPrimeApp {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number to check it is prime or not");
		int num=scan.nextInt();
		CheckPrime c=new CheckPrime();
		for(int i=0;i<num;i++)
		{
			boolean res=c.primeCheck(i);
			if(res==true)
			{
				System.out.print(i+" ");
			}
		}
		scan.close();

	}

}
