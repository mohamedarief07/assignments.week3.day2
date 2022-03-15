package week3.day2;

import java.util.ArrayList;

public class PrintAdamIs4 {

	public static void main(String[] args) {
		int count=0;
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("Adam");
		obj.add("Ben");
		obj.add("Zara");
		obj.add("Adam");
		obj.add("Charlie");
		obj.add("James");
		obj.add("Ben");
		obj.add("Adam");
		obj.add("George");
		obj.add("Adam");
		//System.out.println(obj);
		int size = obj.size();
		
		//Set<String> set = new HashSet<String>();
		for (int i = 0; i < size; i++) {
	if (obj.get(i).contains("Adam")) {
		count++;
		
	}
			
		} System.out.println("Print the number of times Adam Occured : " +count);

	}

}
