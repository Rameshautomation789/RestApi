package ListConcept;

import java.util.LinkedList;

public class linkedList {

	public static void main(String[] args) {
		
		LinkedList<String> li=new LinkedList<String>();
		
		li.add("QTP");
		li.add("Selenium");
		li.add("UFT");
		li.add("Java");
		li.add("RestApi");
		
		
		//Get values
		System.out.println(li.get(2));  //UFT
		
		//Set Values
		
		li.set(2, "HPUFT");
		
		System.out.println(li.get(2));  // HPUFT
		
		li.removeFirst();
		
		System.out.println(li.size());
		
		li.addFirst("QTP");
		
		

	}

}
