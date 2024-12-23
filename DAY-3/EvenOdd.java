package com.ajp;

import java.util.Scanner;

public class EvenOdd 
{
	void check(int a)
	{
		if (a%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		

	}

}
