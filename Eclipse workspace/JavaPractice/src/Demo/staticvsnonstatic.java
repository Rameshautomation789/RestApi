package Demo;

public class staticvsnonstatic {
	
	String s="Selenium";
	
	static String h="QTP";

	public static void main(String[] args) {
		
		staticvsnonstatic obj=new staticvsnonstatic();
		
		// Non Static
		System.out.println(obj.s);
		
		  obj.sum();
		  
		  
		  // Static 
		  System.out.println(staticvsnonstatic.h);
		  
		  staticvsnonstatic.test1();
		  
		  
		  System.out.println(h);
		  test1();
		  
		  
		  obj.test1();

	}
	
	
	
	
	public void sum(){
		System.out.println("Non Static Method");
		
	}
	
	public static void test1(){
		System.out.println("Static Method");
	}

}
