package Polymorphism;

public class OverridingTest {

	public static void main(String[] args) {
		
		OverridingChildclass objch=new OverridingChildclass();
		
		objch.add();
		objch.sum();
		
		OverridingParentclass objparent=new OverridingParentclass();
		
		objparent.add();
		objparent.sum();
		
		OverridingParentclass obj=new OverridingChildclass(); 
		
		obj.add();
		obj.sum();
		

	}

}
