package OOPConceptsPart2;

public class Test {

	public static void main(String[] args) {

		
		//Static ploymorphism OR compile time polymorphism
		BMW b=new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.threadsafe();
		
		System.out.println("***********************************");
		
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		
		
		System.out.println("***************************************");
		
		//Top Casting
		Car c1=new BMW();  // Child class obj can be referred by parent class refrence variable  ----Dynamic polymorphism OR Runtime polymorphism
		c1.start();
		c1.stop();
		c1.refuel();
		
		
		//Down Casting
		BMW b1=(BMW)new Car(); // give exception -   ClassCastException
		
		
	}

}
