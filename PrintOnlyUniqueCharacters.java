package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintOnlyUniqueCharacters {
	
	public static void main(String[] args) {

		String input = "pappu";

		//Convert String to Character array
		char[] arr1 = input.toCharArray();

		//Create a new Set -> HashSet
		Set<Character> set1 = new HashSet<Character>();

		//Add each character to the Set and if it is already there, remove it
		for (int i=0;i<arr1.length;i++) {
			int count =0;
			for (int j=0;j<arr1.length;j++) {
				if (arr1[i]==arr1[j]) {
					count=count+1;
				}
				if (count==0) {
					set1.add(arr1[i]);
				}			
			}
		}
		System.out.println("Unique Char:" +set1);
	}

}
