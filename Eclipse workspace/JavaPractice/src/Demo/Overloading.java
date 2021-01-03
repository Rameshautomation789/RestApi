package Demo;

public class Overloading {

	public static void main(String[] args) {
		
		Overloading obj=new Overloading();
		
		obj.sum();
		obj.sum(2);
		obj.sum("2");
		
      	}
	
	
	
	
	
	public void sum(){
		System.out.println("No parameter");
	}
	
	public void sum(int a){
		System.out.println("one parameter");
	}
	
	public void sum(String s){
		System.out.println("String parameter");
	}
	
	public void sum(int a, int b){
		System.out.println("two parameters");
	}
	
	

}
