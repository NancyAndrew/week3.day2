package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	
	public static void main(String[] args) {
		//a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";		
		// b) Initialize an integer variable as count	
		int count = 0;
		// c) Split the String into array and iterate over it 
		char[] arr1 = text.toCharArray();
		Set<Character> set1 = new LinkedHashSet<Character>();
		// d) Initialize another loop to check whether the word is there in the array
		for (int i=0;i<arr1.length;i++) {
			// e) if it is available then increase and count by 1. 
			if(set1.add(arr1[i])) {
				// f) if the count > 1 then replace the word as "" 
				count=count+1;
				// g) Displaying the String without duplicate words	
				System.out.print(arr1[i]);

			}
		}
	}
}
