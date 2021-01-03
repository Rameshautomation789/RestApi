package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		// Static Array
		
		int a[]=new int[3];   // SIze is 3
		
		ArrayList ar=new ArrayList();
		
		ar.add(10);
		ar.add("Tom");
		ar.add(20);
		
		System.out.println("Size of the Arry :" + ar.size());
		
		
		// to print all the values from Arraylist
		//1. for loop
		//2. Iterator

		for(int i=0;i<ar.size();i++){
			System.out.println(ar.get(i));
		}
		
	System.out.println("************************");	
	
		//2. Iterator
		
		Iterator it=ar.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		// Generic vs Non Generic
		
		ArrayList<String> ar1=new ArrayList<String>();   // geenric way
		ar1.add("Tom");         // Allows only String type values
		//ar1.add(20);         //throw ane rror he method add(int, String) in the type ArrayList<String> is not applicable for the arguments (int)
		ar1.add("Test");
		ar1.add("Test123");
		
		
//***********************************************************
		
		//****************** Non-generic array list **************
		
		ArrayList al=new ArrayList();
		
		//****************** Generic array list **************
		
		ArrayList<String> al1=new ArrayList<String>();
		
		
	}

}
