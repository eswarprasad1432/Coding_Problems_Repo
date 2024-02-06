package com.java.codingQuestions;

public class ReverseString 
{
	public static String reverseString(String str)
	{
		char [ ] ch1=str.toCharArray();
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
