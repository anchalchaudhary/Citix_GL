package assignment1;
import java.util.*;

public class CollectionsExample {

	@SuppressWarnings("rawtypes")
	public static void main(String args[]) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(1);
		arrList.add(20);
		arrList.add(15);
		Iterator iter = arrList.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}
}
