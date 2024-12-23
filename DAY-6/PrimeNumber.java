package com.ajp;

import java.util.Scanner;

public class PrimeNumber 
{
	boolean  prime(int number)
	{
		int target = number/2;
		boolean value=true;
		for (int i=2; i<target; i++)
		{
			if(target%i==0)
				value=false;
		}
		
      return value;
	}

	public static void main(String[] args)
	{
		PrimeNumber p=new PrimeNumber();
		boolean res=p.prime(2);
		if(res)
		{
			System.out.println("is prime");
		}
		else
		{
			System.out.println("is not prime");
		}
		
	}

}
