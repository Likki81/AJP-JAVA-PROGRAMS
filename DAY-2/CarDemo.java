package com.ajp;

import java_projects.Car;

public class CarDemo extends Car {

	public static void main(String[] args)
	{
		Car car=new Car();
		car.speed=300;
		car.setMillage(30);
		
		
		CarDemo cd=new CarDemo();
		cd.name="Ford";
		cd.speed=200;
		cd.setMillage(18);
		System.out.println("car details="+car.speed+","+cd.name+","+cd.speed+","+cd.getMillage());
		
	}

}
