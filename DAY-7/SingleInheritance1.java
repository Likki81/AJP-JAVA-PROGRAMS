package com.ajp;

public class SingleInheritance1 extends SingleInheritance 
{
	String address;
	int no_employes;
	String manager_name;
     SingleInheritance1() 
     {
	super();
		System.out.println("Single Inheritance1 constructor");
	}

     
	public SingleInheritance1(int bankcode,String name,String type,String address, int no_employes, String manager_name) {
		super(bankcode,name,type);
		this.address = address;
		this.no_employes = no_employes;
		this.manager_name = manager_name;
		System.out.println("SBI details="+address+","+no_employes+","+manager_name);
	}


	public static void main(String[] args)
	{
		SingleInheritance1 s=new SingleInheritance1(111,"SBI","private","hyd",200,"mani");
		SingleInheritance1 s1=new SingleInheritance1();
		

	}

}
