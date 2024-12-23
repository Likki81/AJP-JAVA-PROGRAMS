package com.ajp;

import java.util.Scanner;

public class Results 
{
	int sub1,sub2,sub3,sub4;
	void findresult()
	{
    if(sub1>=35 && sub2>=35 && sub3>=35 && sub4>=35)
    { 	
		int avg,total;
		char grade;
		total=sub1+sub2+sub3+sub4;
		avg=total/4;
		if(avg>=80)
		{
			grade='A';
		}
		else if(avg>=60)
		{
			grade='B';
		}
		else if(avg>=40)
		{
			grade='C';
		}
		else
		{
			grade='D';
		}
		switch (grade) {
		case 'A': 
		{
			System.out.println("grade is="+grade);
			break;
		}
		case 'B': 
		{
			System.out.println("grade is="+grade);
			break;
		}
		case 'C': 
		{
			System.out.println("grade is="+grade);
			break;
		}
		case 'D': 
		{
			System.out.println("grade is="+grade);
			break;
		}
		default:
			System.out.println("FAIL");
		}
			
	}
    else
    {
    	System.out.println("student is failed");
    }
    	
	}

	public static void main(String[] args) 
	{
		System.out.println("enter 4 subjects marks=");
		Scanner sc=new Scanner(System.in);
		Results r=new Results();
		r.sub1=sc.nextInt();
		r.sub2=sc.nextInt();
		r.sub3=sc.nextInt();
		r.sub4=sc.nextInt();
		r.findresult();
		
	}

}
