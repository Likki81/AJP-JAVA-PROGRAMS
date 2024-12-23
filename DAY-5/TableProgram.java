package com.ajp;

public class TableProgram 
{
	void printable(int number)
	{
		int i=1;
		while(i<=10)//while loop or entry control loop
		{
			System.out.println(number+"*"+i+"="+number*i);
			i++;
		}
	}

	public static void main(String[] args) 
	{
		TableProgram tp=new TableProgram();
		tp.printable(5);
	}

}
