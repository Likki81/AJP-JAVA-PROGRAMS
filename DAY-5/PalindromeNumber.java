package com.ajp;

public class PalindromeNumber 
{
	int num,rem=1,sum=0;
	
	void palindrome(int num)
	{
		int temp=num;
		while(num>0)
		{
			
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
			
		}
		
		if(sum==temp)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

	public static void main(String[] args) 
	{
		
		PalindromeNumber pn=new PalindromeNumber();
		pn.palindrome(121);
		

	}

}
