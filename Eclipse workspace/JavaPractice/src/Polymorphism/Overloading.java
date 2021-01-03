package Polymorphism;

import OOPConceptsPart1.MethodOverloading;

// PolyMorphism.

// 1.Static/Complietime/Early Binding -  Overloading
// 2.Dynamic/Runtime/Lazy Binding - Overriding

public class Overloading {
	

	public static void main(String[] args) {
		
		
		MethodOverloading obj=new MethodOverloading();
		
		obj.sum();
		obj.sum(2);
		obj.sum(5, 10);
		
	}
	
	// We can overload main methods also
	
	// Method Overloading --- when the method name is same with different arguments or input parameters within the same class.
	
	public void sum(){
		System.out.println("Sum Method - Zero Param");
	}
	
	public void sum(int i){
		System.out.println("Sum Method - 1 input Param");
	}

	public void sum(int i, int j){
		System.out.println("Sum Method - 2 input Param");
	}
	

}
