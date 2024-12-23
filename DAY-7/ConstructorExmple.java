package com.ajp;

public class ConstructorExmple 
{
	int sid;
	String sname;
	 ConstructorExmple() 
	 {
		 System.out.println("constructor will excute when object creates");
		
	}
	ConstructorExmple(int sid,String sname)
	{
	    this.sid = sid;//it will always points to the current object
		this.sname = sname;
		System.out.println(sid+" "+sname);
	}

	public static void main(String[] args) 
	{
		ConstructorExmple ce=new ConstructorExmple();
		ConstructorExmple ce1=new ConstructorExmple(1,"likki");
		

	}

}
