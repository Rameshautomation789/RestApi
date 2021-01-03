package JavaProgramming;

public class ReverseString {

	public static void main(String[] args) {

		String s="Selenium";
		
		// 1. Using for loop method
		
		String rev="";
		
		int len=s.length();
		
		for(int i=len-1;i>=0;i--){
			rev=rev+s.charAt(i);
		}
		
		System.out.println(rev);
		
		
		System.out.println("*********************************************");
		
		
		// 2. Using String Buffer
		
		StringBuffer sb=new StringBuffer(s);
		
		System.out.println(sb.reverse());
		
		
	}
	

}
