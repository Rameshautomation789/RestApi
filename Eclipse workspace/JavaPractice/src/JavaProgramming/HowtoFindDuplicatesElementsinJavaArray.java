package JavaProgramming;

import java.util.HashSet;
import java.util.Set;

public class HowtoFindDuplicatesElementsinJavaArray {

	public static void main(String[] args) {
		
		
		String names[]={"java","Selenium","Python","C","java","QTP"};
		
		// 1 .Comparing each Element
		
		for(int i=0;i<names.length;i++){
			for(int j=i+1;j<names.length;j++){
				if(names[i].equals(names[j])){
					System.out.println("Duplicate Element is : " + names[i]);
				}
			}
		}
		
			
		
		System.out.println("**************************");
		
		
		// 2. Using HashSet Method
		
		Set<String> store=new HashSet<String>();
		
		for(String name : names){
			if(store.add(name) == false){
				System.out.println("Duplicate Element is : " + name);
			}
		}
		
		
		
	}

}
