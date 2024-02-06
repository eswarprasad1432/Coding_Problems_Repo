package com.java.codingQuestions;

import java.util.Scanner;

public class SwapApp {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Swap s=new Swap();
		s.swapTwo(a, b);
		sc.close();
		

	}

}
