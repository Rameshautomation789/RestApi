package OOPConceptsPart1;

public class FunctionsInJava {

	public static void main(String[] args) {
		
		FunctionsInJava obj=new FunctionsInJava();
		// one object will be created,obj is reference variable, referring to this object.
		// after creating the object,the copy of all non static methods will be given to this object
		
	       obj.test();
	       
	       int l=obj.test1();
	       System.out.println(l);
	       
	       String s1=obj.test2();
	       System.out.println(s1);
	       
	       int d =obj.test3(10,5);
	       System.out.println(d);
		

	      //main method is void ---- never returns any value 
	       
	}
	
	
	
	
	// Non Static Methods
	
	
	// void  -does not return any value
	// return type - void
		public void test(){
			System.out.println("test method");
		}
	
		
		//return type - int
		// no input. some output
		public int test1(){     
			System.out.println("Test1 Method");
			int a=10;
			int b=20;
			int c=a+b;
			
			return c;
		}
		
		
		//return type String
		// no input,some input
		public String test2(){  
			System.out.println("Test2 Method");
			String s="Selenium";
			return s;
		}
		
		//return type int
		//x,y -- input parameters/arguments
		public int test3(int x,int y){
			System.out.println("test3 Method");
			int z=x/y;
			return z;
		}
	
	
	
}
