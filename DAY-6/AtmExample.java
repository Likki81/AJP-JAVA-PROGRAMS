package com.ajp;

import java.util.Scanner;

public class AtmExample 
{
   int ch,amount,total=0;
  void welcome()
  {
	
	while (true)
	{
		System.out.println("1.deposit");
		System.out.println("2.withdraw");
		System.out.println("3.display total amount");
		System.out.println("4.exit");
		System.out.println("enter your choice=");
		Scanner s=new Scanner(System.in);
		ch=s.nextInt();
		switch(ch)
    {
		case 1:
		{
			System.out.println("enter amount you want to deposit=");
			Scanner sc=new Scanner(System.in);
			amount=sc.nextInt();
			total+=amount;
			break;
		}
		case 2:
		{
			System.out.println("enter amount you want to withdraw=");		
			Scanner sc=new Scanner(System.in);
			amount=sc.nextInt();
			if(total==0) {
				System.out.println("no balnce");
			}
			else if(total<amount)
			{
				System.out.println("there is no sufficient amount for withdraw");
				System.out.println("first check your balance");
			}
			else if(total>=amount)
			{		
		    
			total-=amount;
			
			}
			else
			{
				System.out.println("invalid input");
			}
			break;
			
		}
		case 3:
		{
			
			System.out.println("total amount is="+total);
			break;
		}
		case 4:
			System.out.println("thank you");
			break;
	}
  }
  }
	

	public static void main(String[] args) 
	{
		AtmExample a=new AtmExample();
		a.welcome();

	}

}
