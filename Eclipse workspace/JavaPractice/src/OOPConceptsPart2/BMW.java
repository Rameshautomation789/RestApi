package OOPConceptsPart2;

public class BMW extends Car{
	
	// Overriding
	
	// When same method is present in parent class as well as in child class with the same name and same no of arguments is called method overriding
	
	public void start(){  // overridden method
		System.out.println("BMW........ Start");
	}

	public void threadsafe(){
		System.out.println("BMW........ Threadsafe");
	}
	

}
 