package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesInCollection {
	
	public static void main(String[] args) {
		
		List<Integer> listContainDuplicate= new ArrayList<Integer>(Arrays.asList(14,12,13,11,15,14,18,16,17,19,18,17,20));

		Collections.sort(listContainDuplicate);
		
		Set<Integer> set = new HashSet<Integer>();
		for(Integer duplicate : listContainDuplicate) {
			if(!set.add(duplicate)) {
				System.out.println(duplicate);
			}

		}
		
	}

}
