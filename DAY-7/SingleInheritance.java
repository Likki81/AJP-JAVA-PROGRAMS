package com.ajp;

public class SingleInheritance 
{
   int bankcode;
   String name;
   String type;
   
	 SingleInheritance()
	 {
		 System.out.println("this is RBI details");
		 
	}
	public SingleInheritance(int bankcode, String name, String type) {
	super();//in constructor first call is super
	this.bankcode = bankcode;
	this.name = name;
	this.type = type;
	System.out.println("RBI details="+name+","+bankcode+","+type);
}


}
