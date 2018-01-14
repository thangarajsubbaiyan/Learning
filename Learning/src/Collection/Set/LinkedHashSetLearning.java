package Collection.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetLearning {

	public static void main(String[] args) {
		LinkedHashSet<String>  linkedHashSet= new LinkedHashSet<String>();
		linkedHashSet.add("hai");
		linkedHashSet.add("hello");
		linkedHashSet.add("how");
		linkedHashSet.add("are");
		linkedHashSet.add(null);
		linkedHashSet.add(null);
		for (String string : linkedHashSet) {
			System.out.println("Value=="+string);
		}
		
	}

}
