package JavaBascis;

public class TwoDimensionArray {

	public static void main(String[] args) {
		
		
		// Two Dimension Array is combination Rows and columns
		
		// As Example String[3][5]  -   3-Rows and 5- Columns
		
		String x[][]=new String[3][5];
		
		System.out.println(x.length);              /// It will give no of rows
		
		System.out.println(x[0].length);            // It will give no of columns of 0 Row
		

		
		// 1st Row
		
		x[0][0]="A";
		x[0][1]="B";
		x[0][2]="C";
		x[0][3]="D";
		x[0][4]="E";
		
		
		String z[][]=new String[3][5];
		z[0][0]="A";
		z[0][0]="A";
		
	}

}
