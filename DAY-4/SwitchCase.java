package com.ajp;

import java.util.Scanner;

public class SwitchCase 
{

	public static void main(String[] args)
	{
		char ch;
		System.out.println("enter a charcters from a to d=");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		switch(ch) {
		case 'a': 
		{
			System.out.println("choosen character is="+ch);
			break;
			
		}
		case 'b': 
		{
			System.out.println("choosen character is="+ch);
			break;
			
		}
		case 'c': 
		{
			System.out.println("choosen character is="+ch);
			break;
			
		}
		case 'd': 
		{
			System.out.println("choosen character is="+ch);
			break;
			
		}
		default:
			System.out.println("choosen character is invalid");
			

		}
	}

}
