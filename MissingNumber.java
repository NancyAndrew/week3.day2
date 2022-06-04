package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
	
	public static void main(String[] args) {

		int[] numbers = {4,6,7,2,3,1,9,10,8,8,6,2};
		System.out.print("Input Numbers:");
		for(int i=0;i<numbers.length;i++) {
			System.out.print(" "+numbers[i]);
		}
		System.out.println();
		//Remove the duplicates using Set and Make sure the set is in the ascending order
		Set<Integer> set2 = new TreeSet<Integer>();
		for (int i=0;i<numbers.length;i++) {
			set2.add(numbers[i]);
		}
		System.out.println("Tree Set in ASCII order: "+set2);

		List<Integer> list = new ArrayList<Integer>(set2);

		//Iterate from the starting number and verify the next number is + 1
		for(int i=0;i<list.size();i++) {
			//If did not match, that is the number
			if (list.get(i)!=i+1) {
				System.out.println("Missing Number in List: "+(i+1));
				break;
			}

		}
	}
}
