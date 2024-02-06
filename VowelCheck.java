package com.java.codingQuestions;

public class VowelCheck 
{
	public static boolean vowelCheck(String str1)
	{
	     char [ ] ch=str1.toCharArray();
	     for(int i=0;i<ch.length;i++)
	     {
	    	 if(ch[i]=='a' ||ch[i]=='e' || ch[i]=='o' || ch[i]=='i' || ch[i]=='u' )
	    	 {
	    		return true;
	    	 }
	     }
	     return false;   
	}

}
