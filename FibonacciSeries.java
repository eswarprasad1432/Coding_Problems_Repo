package com.java.codingQuestions;

public class FibonacciSeries 
{
    public static int printSeries(int num)
    {
    	if(num==0)
    	{
    		return 0;
    	}
    	else if(num==1)
    	{
    		return 1;
    	}
    	else
    	{
    		return printSeries(num-1)+printSeries(num-2);
    	}
    		
    }
}
