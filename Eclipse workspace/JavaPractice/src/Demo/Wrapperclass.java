package Demo;

public class Wrapperclass {

	public static void main(String[] args) {
		
		String s="100";
		
		System.out.println(s+10);
		
		int i=Integer.parseInt(s);
		
		System.out.println(i+10);
		
		String s1=String.valueOf(i);
		
		System.out.println(s1+10);
		
		String y="22.23";
		
		double d=Double.parseDouble(y);
		
		System.out.println(y+5);
		
		System.out.println(d+5);
		
		String s2="true";
		
		boolean b=Boolean.parseBoolean(s2);
		
		System.out.println(s+2);
		
		System.out.println(b);
		

	}

}
