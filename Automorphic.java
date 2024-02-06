package com.java.codingQuestions;

import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args) 
	{
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter the number to check it is automorphic ot not");
	  int num=scan.nextInt();
	  int sq=num*num;
	  String ssq=Integer.toString(num);
	  String num2=Integer.toString(sq);
	  if(num2.endsWith(ssq))
	  {
		  System.out.println("Automorphic");
	  }
	  else
	  {
		  System.out.println("Not Automorphic");
	  }
	  scan.close();
	  
	  
		
	  

	}

}
