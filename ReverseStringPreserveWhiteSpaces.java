package com.java.codingQuestions;

import java.util.Scanner;

public class ReverseStringPreserveWhiteSpaces {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string to reverse by preserving whitespaces");
		String str1=scan.nextLine();
		String res=preserveSpaces(str1);
		System.out.println(res);
		scan.close();
		
		
	}
	public static String preserveSpaces(String str1)
	{
		char [ ] ch1=str1.toCharArray();
		char [ ] ch2=new char[ch1.length];
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]==' ')
			{
				ch2[i]=ch1[i];
			}
		}
		int j=ch1.length-1;
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]!=' ')
			{
				if(ch2[j]==' ')
				{
					j--;
				}
				ch2[j]=ch1[i];
				j--;
			}	
		}
		String str2=new String(ch2);
		return str2;
		
	}
	

}
