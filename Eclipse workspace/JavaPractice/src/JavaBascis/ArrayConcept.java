package JavaBascis;

public class ArrayConcept {

	public static void main(String[] args) {

		
	// Array -  to store similar data type values in a array variable
		
		// 1.lower bound/index=0
		// 2.Upper bound/index=n-1 (n is size of an array)
		
	// disadvantages of an Array
		
		//1. Size is fixed (static Array) ---- To Overcome this problem  we use collections i.e Arraylist,Hashtable for Dynamic Array
		//2.Store only similar data types ----- TO Overcome of this problem, we use object array
		
	int i[]=new int[4];
	
	i[0]=10;
	i[1]=20;
	i[2]=30;
	i[3]=40;
	
	
	System.out.println(i[1]);
	
	System.out.println(i.length);
	
	
	String s[]=new String[3];
	
	s[0]="Test";
	s[1]="Hi";
	s[2]="welcome";
	
	
	System.out.println(s.length);
	
	
	
	
	//*************************** Using object array *******************************************
	
	Object obj[]=new Object[5];
	obj[0]="2";
	obj[1]="Test";
	obj[2]="10.25";
	obj[3]='s';
	obj[4]="True";
	
	
	System.out.println(obj.length);
	
	System.out.println("**********************************************");
	
	
	for(int k=0;k<obj.length;k++){
		System.out.println(obj[k]);
	}
		
		
	}

}
