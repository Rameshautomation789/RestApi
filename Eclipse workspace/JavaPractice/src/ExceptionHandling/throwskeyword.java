package ExceptionHandling;

public class throwskeyword {

	public static void main(String[] args)  throws ArithmeticException {
		
		throwskeyword obj=new throwskeyword();
		obj.sum();
		
	}

	
	public void sum() throws ArithmeticException {
		add();
	}
	
	public void add() throws ArithmeticException {
		int i=9/0;   //exception lie
	}
	
	
	
	// to avoid exception in run time
	
	public void mul(){
		try{
			add();
		}catch(ArithmeticException e){
			e.printStackTrace();
			e.getMessage();
		}
		
	}
}
