package OOPConceptsPart1;

public class LocalVsGlobalVariables {

	
		// Global variables --- Class variables
		
			String s="tom";
			int age=25;
		
		
		public static void main(String[] args) {
			
	              int i=10;          // Local Varibales
	              System.out.println(i);
	              
	              LocalVsGlobalVariables obj=new LocalVsGlobalVariables();
	              System.out.println(obj.s);             // calling Global variables 
	              System.out.println(obj.age);
	              
	              // calling sum method
	              obj.sum();
	              
		}
	
		
		public void sum(){
			int a=10;  // Local Variable
			int b=20;  // Local Variable
			System.out.println(a);
			System.out.println(b);
		}
	
		
}
