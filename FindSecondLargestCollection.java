package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindSecondLargestCollection {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>(Arrays.asList(3, 2, 11, 4, 6, 7));

		List<Integer> convertToList = new ArrayList<Integer>(set);
		Collections.sort(convertToList);
		Collections.reverse(convertToList);
		// System.out.println(convertToList);

		Integer FindSecondLargest = convertToList.get(1);
		System.out.println("Find the Second Largest : " + FindSecondLargest);

	}

}
