package com.java.codingQuestions;

import java.util.Scanner;

public class RemoveSpaces {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=scan.nextLine();
		String res=removeSpaces(str);
		System.out.println(res);
		scan.close();
		

	}
	public static String removeSpaces(String str)
	{
		StringBuilder str2=new StringBuilder();
		char [ ] ch1=str.toCharArray();
		
		for(char c:ch1)
		{
			if(!Character.isWhitespace(c))
			{
				str2.append(c);
			}			
		}
		return str2.toString();
		
		
		
	}

}
