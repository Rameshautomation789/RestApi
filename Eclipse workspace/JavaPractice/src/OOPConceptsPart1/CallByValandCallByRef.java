package OOPConceptsPart1;

public class CallByValandCallByRef {

	  int i=10;
	  int j=20;
	  
	public static void main(String[] args) {

		
		CallByValandCallByRef obj=new CallByValandCallByRef();
	
	  System.out.println("Call by Value start");	
	
		/// call by value
		int x=50;
		int y=60;
		
		int z=obj.sum(x, y);      //call by value OR pass by value
		System.out.println(z);
		
		System.out.println(x);
		System.out.println(y);
		
     System.out.println("Call by Value end");	

	//**********************  
		
		// call by Reference
		
	System.out.println("Call By Reference start");
		
		System.out.println(obj.i);
		
		System.out.println(obj.j);
		
	System.out.println("After swaping");	
	
	    obj.swap(obj);
	    
		System.out.println(obj.i);
		
		System.out.println(obj.j);
		
	System.out.println("Call By Reference End");
		
	}

	
	
	public int sum(int a,int b){
		a=20;
		b=30;
		int c=a+b;
		return c;
	}
	
	// call by reference OR pass by refrence(it is possible using obj reference)
	public void swap(CallByValandCallByRef t){
		int temp;
		temp=t.i;    // temp-10
		t.i=t.j;      // t.i -20
		t.j=temp;     //t.i- 10
	}
	
	
}
