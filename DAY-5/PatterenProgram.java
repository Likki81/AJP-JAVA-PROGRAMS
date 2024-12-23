package com.ajp;

public class PatterenProgram
{
	 static int start=1;
	static void pattern(int end)
	{
		
		while(start<=end)
		{
			System.out.println(start+" ");
			
			start++;
			
		}
	}

	public static void main(String[] args) 
	{
		int start=1,end=5;
		while(start<=end)
		{
			pattern(start);
			System.out.println();
			start++;
		}
	}

}
