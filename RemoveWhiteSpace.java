package com.java.codingQuestions;

import java.util.Scanner;

public class RemoveWhiteSpace {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=scan.nextLine();
		str=str.replaceAll(" ","");
		System.out.println(str);
		scan.close();

	}

}
