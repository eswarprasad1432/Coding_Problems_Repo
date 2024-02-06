package com.java.codingQuestions;

import java.util.Scanner;

public class LeadingAndTrailingSpaces {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=scan.nextLine();
		str=str.trim();
		System.out.println("After striiping"+str);
		scan.close();
		
		
		

	}

}
