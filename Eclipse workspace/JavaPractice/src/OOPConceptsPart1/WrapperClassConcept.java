package OOPConceptsPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		// String to int
		String s="100";
		
		int i=Integer.parseInt(s);
		
		System.out.println(i);
		
		//String to Double
		
		String y="23.5";
		
		double d=Double.parseDouble(y);
		
		System.out.println(d);
		
		//String to boolean
		
		String z="true";
		
		boolean b=Boolean.parseBoolean(z);
		
		System.out.println(b);
		
		// int to String conversion
		
		int k=100;
		
		String m=String.valueOf(k);
		
		System.out.println(m);
		
		
		
	}

}
