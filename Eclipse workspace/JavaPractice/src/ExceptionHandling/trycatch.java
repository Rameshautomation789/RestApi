package ExceptionHandling;

public class trycatch {

	public static void main(String[] args) {

        
		// uncaught Exception
//		int i=9/0;
//		System.out.println(i);
		
		//caught Exception
		
	//	Thread.sleep(2000);
		

		
	//	1. try catch 
		
		
		// ***************** UnChecked Exception ********************************
		// Unchecked Exception- we need to catch exception manually
		//unchecked exceptions are not checked by compiler at the time of compilation
		
      // int i=9/0;
		
	  
		// ***************** Checked Exception ********************************
		// Checked Exception-  these are must and should handled by the programmer
		//Checked Exceptions are checked at compile time only
		  
		 //Thread.sleep(2000);
		  
		  
		  try{
			  int i=9/0;
		  }catch(Throwable e){
			  e.printStackTrace();
			  e.getMessage();
		  }
		  
		  System.out.println("ABC");
		  System.out.println("ABC");

	}

}
