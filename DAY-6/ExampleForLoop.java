package com.ajp;

public class ExampleForLoop {

	public static void main(String[] args) 
	{
		int range = 20,sum=0;
		for (int i = 0; i < range; i++) 
		{
		   if(i%2!=0)	//odd numbers sum
			 sum+=i;
		}
		System.out.println(sum);
		

	}

}
