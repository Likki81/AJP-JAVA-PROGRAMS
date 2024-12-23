package com.ajp;

public class Employe 
{
	public String name;
	private float salary;
	protected int id;
	
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
    public void employeinformation() 
    {
		System.out.println("employe data");
	}
	

}
