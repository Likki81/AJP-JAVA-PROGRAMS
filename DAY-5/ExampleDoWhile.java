package com.ajp;

import java.util.Scanner;

public class ExampleDoWhile /*(exit control loop) first excute the satements after check the condition and in this
      if condition is not satisfied also the statemts are excuted at once in do */
{
	 int num1=0,sum=0;
	 int sumofeven(int range)
	{

		
		
		do {
			if (num1%2==0)
			{
				sum+=num1;
				num1++;
			}
			
		} while (num1>=range);
		
		return sum;
	}
	
	

	public static void main(String[] args) 
	{
	  ExampleDoWhile ed=new ExampleDoWhile();
      Scanner sc=new Scanner(System.in);
      int res=ed.sumofeven(sc.nextInt());
      System.out.println(res);
      
	}

}
