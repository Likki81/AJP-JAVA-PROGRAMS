package com.ajp;

public class RangePrimeNumber 
{
	void rangeprime(int range)
	{
		boolean b=true;
		for(int i=2;i<=range;i++)
		{
			b=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					b=false;
					break;
				}
			}
			if(b)
			{
				System.out.println(i+" ");
			}
			
		}
		
	}

	public static void main(String[] args) 
	{
		RangePrimeNumber r=new RangePrimeNumber();
	    r.rangeprime (10);
		
	}

}
