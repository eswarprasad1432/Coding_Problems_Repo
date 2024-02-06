package com.java.codingQuestions;

import java.util.Scanner;

public class RevreseStringgApp {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string");
		String str1=scanner.nextLine();
		String res=ReverseString.reverseString(str1);
		System.out.println("The Reverse of "+str1+" is "+res);
		
		scanner.close();

	}

}
