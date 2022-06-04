package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementsInArray {
	
	public static void main(String[] args) {
		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};
		// Sort the array
		Arrays.sort(arr);
		List<Integer> lis=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			lis.add(arr[i]);
		}
		Collections.sort(lis);
		System.out.println("Sorted List: "+lis);
		// loop through the array (start i from arr[0] till the length of the array)

		//find missing element in list -iterator variable is not equal to the array values
		for(int i=0;i<lis.size();i++) {
			if(lis.get(i)!=i+1) {
				System.out.println("Missing Element " +(i+1));
				break;
			}
		}
	}

}
