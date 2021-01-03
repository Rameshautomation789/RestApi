package ExceptionHandling;

public class throwkeyword {
	
	public static void main(String[] args) {
			
		
		// Generating Own Exception
		
		System.out.println("ABC");
		
		try {
			throw new Exception("Ramesh Exception");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("PQR");
		
		
		
		
		
		// ************************** As exmple
		
		   String Execution_flag="N";
	  
		   if(Execution_flag.equals("N")){
			   try {
				throw new Exception("Execution flag value is No");
			} catch (Exception e) {
				e.printStackTrace();
			}
			   
		   }
		
		   
		   
			
		}
	
	
	
}
