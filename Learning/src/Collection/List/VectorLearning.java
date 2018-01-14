package Collection.List;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class VectorLearning {

	public static void main(String[] args) {
		Vector<String>  vector = new Vector<String>();
		vector.add("1");
		vector.add("2");
		vector.add("3");
		
		Enumeration<String> enumeration = vector.elements();
		
		while(enumeration.hasMoreElements()){
			System.out.println("Value=="+enumeration.nextElement());
		}
		
		
		
	
	}

}
