package com.java.codingQuestions;

import java.util.Scanner;

public class VowelCheckApp {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str1=sc.nextLine();
		str1.toLowerCase();
		 boolean res=VowelCheck.vowelCheck(str1);
		 if(res==true)
		 {
			 System.out.println(str1+" contains vowels");
		 }
		 else
		 {
			 System.out.println(str1+" does not contains any vowels");
		 }
		sc.close();

	}

}
