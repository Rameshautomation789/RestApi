package OOPConceptsPart1;

public class StaticandNonStatic {
	
	
	String s="Tom";    //Non static global varibale
	static int age=25;        //static global variable
	

	public static void main(String[] args) {
		
		//How to call Static methods and variables
		
		//1. direct calling
		
		sum();
		
		System.out.println(age);
		
		
		// 2.calling by className
		
		StaticandNonStatic.sum();
		
		System.out.println(StaticandNonStatic.age);
		
		//How to call Non Static methods and variables
		
		StaticandNonStatic obj=new StaticandNonStatic();
		
		obj.sendmail();
		
		System.out.println(obj.s);
		
		
		// can i access static methods by using obj reference? Yes
		
		obj.sum();   // warning will be given (i.e The static method sum() from the type Static and NonStatic should be accessed in a static way)
		
		
	}

	
	
	public void sendmail(){
		System.out.println("Send Mail");
	}
	
	public static void sum(){
		System.out.println("Sum Method");
	}
	
	
	
	
}
