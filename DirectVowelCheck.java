package com.java.codingQuestions;

import java.util.Scanner;

public class DirectVowelCheck {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scan.nextLine();
		boolean res=containsVowels(str);
		System.out.println(res);
		scan.close();
	}
	public static boolean containsVowels(String str)
	{
	           return str.toLowerCase().matches(".*[aeiou].*");
	}

}
