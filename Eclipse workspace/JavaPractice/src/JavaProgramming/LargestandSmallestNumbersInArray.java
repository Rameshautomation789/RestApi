package JavaProgramming;

import java.util.Arrays;

public class LargestandSmallestNumbersInArray {

	public static void main(String[] args) {
		
		
		int numbers[]={-10,20,50,70,90};
		
		int largest=numbers[0];
		
		int smallest=numbers[0];
		
		for(int i=1;i<numbers.length;i++){
			if(numbers[i]>largest){
				largest=numbers[i];
			}
			else if(numbers[i]<smallest){
				smallest=numbers[i];
			}
		}
		
		
		System.out.println("The Given Array is "  + Arrays.toString(numbers));
		System.out.println("Largest Number is " + largest);
		System.out.println("Smallest Number is " + smallest);

	}

}
