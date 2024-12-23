package com.ajp;

public class FactorialNumber 
{
	int num,fact=1;
	int fact(int num)
	{
		while(num>=1)
		{
			fact=fact*num;
			num--;
			
		}
		return fact;
	}
	

	public static void main(String[] args) 
	{
		FactorialNumber fn=new FactorialNumber();
		int res=fn.fact(5);
        System.out.println(res);
	}

}
