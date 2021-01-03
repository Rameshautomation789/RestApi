package Encapsulation;

public class Test1encapsulation {
	

	public static void main(String[] args) {
		
		Testencapsulation obj=new Testencapsulation();
		
		obj.setId(102);
		
		System.out.println("id is " + obj.getId());
		
		obj.setName("Selenium");
		
		System.out.println("Name is  "  + obj.getName());
		
      //obj.id=20
		
	//	obj.place="SPL";   Plcae is a Public Varibale so we can assign value here
		
		
	}

}
