package JavaProgramming;

public class RemoveJunkandSpecialCharsinaString {

	public static void main(String[] args) {
		
		String s="@##$$ Selenium@12345";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);

	}

}
