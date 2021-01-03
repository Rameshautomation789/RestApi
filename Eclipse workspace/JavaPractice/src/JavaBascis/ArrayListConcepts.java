package JavaBascis;

import java.util.ArrayList;

public class ArrayListConcepts {

	
	public static void main(String[] args) {

		ArrayList arlist=new ArrayList();
		
		arlist.add("Tom");
		arlist.add(12);
		
		System.out.println(arlist.size());
		
		arlist.add("Test");
		arlist.add(100);
		arlist.add(200);
		
		System.out.println(arlist.size());
		
		System.out.println(arlist.get(2));
		
		System.out.println(arlist.get(4));
		
	System.out.println("************************************************");	
	
	
		for(int i=0;i<arlist.size();i++){
			System.out.println(arlist.get(i));
		}
		
		
		ArrayList<String> arr=new ArrayList<String>(); // We Can Store only String values here 
		
		arr.add("Test");
		
		
		ArrayList<Integer> oarry=new ArrayList<Integer>(); // We Can Store only Integer values here 
		
		oarry.add(100);
		
		
	}

}
