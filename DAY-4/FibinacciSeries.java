package com.ajp;

public class FibinacciSeries {

	public static void main(String[] args) 
	{
		int f1=0,f2=1,f3,n=0 ;
		System.out.println(f1+","+f2);
		while(n<=10)
		{
		   	f3=f1+f2;
		   	System.out.println(f3);
		   	f1=f2;
		   	f2=f3;
		   	n++;
		   	
		}
				

	}

}
