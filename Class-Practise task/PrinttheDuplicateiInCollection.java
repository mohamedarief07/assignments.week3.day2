package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PrinttheDuplicateiInCollection {

	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("Adam");
		obj.add("Ben");
		obj.add("Zara");
		obj.add("Adam");
		obj.add("Charlie");
		obj.add("James");
		obj.add("Ben");

		// System.out.println(obj);
		int size = obj.size();
		// System.out.println(size);

		Set<String> set = new HashSet<String>();

		for (int i = 0; i < size; i++) {
			if (set.contains(obj.get(i))) {
				System.out.println(obj.get(i) + " is duplicated");

			} else {

				set.add(obj.get(i));

			}

		}

	}
}