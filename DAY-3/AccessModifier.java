package java_projects;

public class AccessModifier
{
	public static void main(String[] args)
	{
		Car c=new Car();
		c.capacity=4;
		c.name="audi";
		c.speed=250;
		c.setMillage(20);
		System.out.println("car details="+c.capacity+","+c.name+","+c.speed+","+c.getMillage());
		
	}

}
