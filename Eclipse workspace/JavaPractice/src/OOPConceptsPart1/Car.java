package OOPConceptsPart1;

public class Car {
	
	int model;
	int wheel;

	public static void main(String[] args) {
		
		
		//new Car();  --- This is the object of car class;
		//new   --- is the keyword to create an object
		// a,b,c are refrence variables
		
		Car a=new Car();
		Car b=new Car();
		Car c=new Car();
		
		
		a.model=2015;
		a.wheel=4;
		
		b.model=2014;
		b.wheel=4;
		
		c.model=2013;
		c.wheel=4;
		
		
		System.out.println(a.model);
		System.out.println(a.wheel);
		
		
		System.out.println(b.model);
		System.out.println(b.wheel);
		
		
		System.out.println(c.model);
		System.out.println(c.wheel);
		
		

	}

}
