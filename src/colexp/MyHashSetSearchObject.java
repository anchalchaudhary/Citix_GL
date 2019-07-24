package colexp;

import java.util.HashSet;

public class MyHashSetSearchObject {

	public static void main(String args[]) {
		HashSet<Price> lhs = new HashSet<Price>();
		lhs.add(new Price("Banana", 20));
		lhs.add(new Price("Apple", 40));
		lhs.add(new Price("Orange", 30));
	}
}
