package com.java.codingQuestions;

import java.util.Scanner;

public class SentenceReversal 
{
	public static void main(String[] args) 
	{
           Scanner scan=new Scanner(System.in);
           System.out.println("Enter the sentence to get reversed");
           String str1=scan.nextLine();
           String res=reverseSentence(str1);
           System.out.println(res);
           scan.close();
           
           
	}
	public static String reverseSentence(String str1)
	{
		String wordarr[ ]=str1.split(" ");
		String revword=null;
		String revString=" ";
		for(int i=0;i<wordarr.length;i++)
		{
			String word=wordarr[i];
			char[ ] wa=word.toCharArray();
			char [ ] rwa=new char[wa.length];
			int j=wa.length-1;
			for(int k=0;k<wa.length;k++)
			{
				rwa[j]=wa[k];
				j--;	
			}
			 revword=new String(rwa);
			 revString=revString+revword+" ";
		}
		return revString;
		
	}

}
