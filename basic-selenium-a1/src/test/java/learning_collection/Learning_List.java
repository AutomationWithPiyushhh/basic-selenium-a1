package learning_collection;

import java.util.ArrayList;
import java.util.List;

public class Learning_List {
	public static void main(String[] args) {
		List<Object> students = new ArrayList<>();

		students.add("Akshay kumar");
		students.add("Anisha");
		students.add("Arpit");
		students.add("vishal");
		students.add("Udit");
		students.add("Tejaswita");
		students.add("Tejaswita");
		
		System.out.println(students.size());

		System.out.println(students.get(5)); // teja 1 fetch

		students.remove(5);  // teja 1 remove
		
		System.out.println(students.get(6)); // teja 2 fetch
	}
}
