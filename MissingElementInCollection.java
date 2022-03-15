package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementInCollection {

	public static void main(String[] args) {

		List<Integer> listMissingnumber = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 7, 6, 8));

		Collections.sort(listMissingnumber);

		int size = listMissingnumber.size();

		for (int i = 0; i < size; i++) {
			if (i + 1 != listMissingnumber.get(i)) {
				System.out.println(i + 1);
				break;

			}

		}

	}

}
