package com.ajp;

import java.util.Scanner;

public class ExampleWhile 
{

	public static void main(String[] args)
	{
		int num=1,total=0,limit;
		System.out.println("enter your limit for total=");
		Scanner sc=new Scanner(System.in);
		limit=sc.nextInt();
		while (num<=limit)
		{
			total+=num;
			num++;
			
		}
		System.out.println(total);

	}

}
