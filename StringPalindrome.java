package com.java.codingQuestions;

import java.util.Scanner;

public class StringPalindrome 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string to check it is palindrome or not");
		String str1=scan.nextLine();
		String res=isPalindrome(str1);
		if(str1.equals(res))
		{
			System.out.println("String "+str1+" is a  palindrome");
		}
		else
		{
			System.out.println("string "+str1+" is not a palindrome");
		}
		
		scan.close();
		
	}
	public static String isPalindrome(String str1)
	{
		char [ ] ch1=str1.toCharArray();
		char[ ] ch2=new char[ch1.length];
		int temp=ch1.length-1;
		for(int i=0;i<ch1.length;i++)
		{
			ch2[temp]=ch1[i];
			temp--;
		}
		String str2=new String(ch2);
		return str2;
	}
}
