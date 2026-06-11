package learning_collection;

import java.util.HashSet;
import java.util.Set;

public class Learning_set {
	public static void main(String[] args) {
		Set<Object> homeTown = new HashSet<>();

		homeTown.add("Banaras");
		homeTown.add("Bulandshahar");

		homeTown.add("Rewa");
		homeTown.add("Sarangpur");

		homeTown.add("Kanpur");
		homeTown.add("Kanpur");

		System.out.println(homeTown.size());

//		System.out.println(homeTown.get(3));

		homeTown.remove("Kanpur");

		for (Object i : homeTown) {
			System.out.println(i);
		}
	}
}
