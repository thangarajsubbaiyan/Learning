package Collection.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetLearning {

	public static void main(String[] args) {
		TreeSet<String>  treeSet = new TreeSet<String>();
		treeSet.add("hai");
		treeSet.add("hello");
		treeSet.add("how");
		treeSet.add("are");
		
		Iterator<String>  iterator = treeSet.iterator();
		for (String string : treeSet) {
			System.out.println("Value=="+string);
		}
		
		
		

	}

}
