package com.java.codingQuestions;

import java.util.Scanner;

public class FibonacciSeriesApp {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the range upto which series has to be printed");
		int num=scan.nextInt();
		for(int i=0;i<num;i++)
		{
		int res= FibonacciSeries.printSeries(i);
		System.out.print(res+" ");
		}
		scan.close();
	}

}
