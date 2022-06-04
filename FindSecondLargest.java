package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {
	

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		List<Integer> lis = new ArrayList<Integer>();
		for(int i=0;i<data.length;i++) {
			lis.add(data[i]);
		}
		// List added
		System.out.println("List: "+lis);
		// Sorted List	
		Collections.sort(lis);
		System.out.println("Sorted List: "+lis);
		// Print second largest in list
		System.out.println("Second Largest Number: " +lis.get(lis.size()-2));

	}

}
