package Demo;

public class Functions {
	

	public static void main(String[] args) {
		
		
		 Functions fn=new Functions();
		 
		 fn.test();
		 
		 int h=fn.test1();
		 
		 System.out.println(h);
		 
		 String k=fn.test2();
		 
		 System.out.println(k);
		 
		 int t=fn.test3(5, 10);
		 
		 System.out.println(t);

	}
	

	
	
	
	
	public void test(){
		System.out.println("No Return type");
	}
	
	public int test1(){    //No input but some output
		int a=10;
		int b=5;
		int c=a+b;
		return c;
	}
	
	public String test2(){
		String s="Selenium";
		return s;
	}
	
	public int test3(int a,int b){  //giving and geeting some output
		int c=a+b;
		return c; 
	}
	
	
	

}
