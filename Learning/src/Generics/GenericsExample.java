package Generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class GenericsExample {

	public static void main(String[] args) {
		
		System.out.println("Number of cores=="+Runtime.getRuntime().availableProcessors());
		
		
		BaseClass[] baseclassArray= new DerivedClass[2];
		baseclassArray[0] = new DerivedClass();
		//baseclassArray[1] = new BaseClass();
		
		for (int i = 0; i < baseclassArray.length; i++) {
			System.out.println("valuee=="+baseclassArray[i]);
		}
		
		
		//List<Number>  abc = new ArrayList<Integer>();
		
		HashSet<String>  hashSet = new HashSet<String>();
		
		//hashSet.add(e)

	}

}
