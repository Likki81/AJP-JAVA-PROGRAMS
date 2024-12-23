package com.ajp;

public class EmployeDetails {

	public static void main(String[] args) 
	{
		
     Employe e= new Employe();
     e.id=1;
     e.name="likki";
     e.setSalary(100000);
     System.out.println("employe details="+e.id+","+e.name+","+e.getSalary());
     
     
//     Employe em=new Employe();
     e.employeinformation();
     
	}

}
