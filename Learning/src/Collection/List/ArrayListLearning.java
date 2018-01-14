package Collection.List;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayListLearning {
	
	public static void main(String args[]){
		
	final ArrayList<String>  arrayList = new ArrayList<String>();
	
	
	
	
	
	
		
	List<Item>  listItem = new ArrayList<Item>();	
	
	Item tv= new Item("TV",500);
	Item iphone= new Item("Iphone 7",900);
	Item tshirt= new Item("T-Shirt",10);
	Item nightPant= new Item("Night pant",20);	
	
	listItem.add(tv);
	listItem.add(iphone);
	listItem.add(tshirt);
	listItem.add(nightPant);
	Collections.sort(listItem);
	for (Item item : listItem) {
		System.out.println("item name=="+item.getName());
	}
		
	List<String>  list = new ArrayList<String>();
	list.add("1");
	list.add("2");
	list.add("3");
	list.add("4");
	list.add("5");
	
	List<String>  list1=  list.stream().filter((s)->s.equalsIgnoreCase("1")).collect(Collectors.toList());
	
	

	
	System.out.println("List size1=="+list1.size());
	
	String str1[]={"Hai","hello","how","how"};
	
	
	
	HashSet<String>  haStrings= new HashSet<String>(Arrays.asList(str1));
	System.out.println("value=="+haStrings);
	
	for (Iterator iterator = list.iterator(); iterator.hasNext();) {
		String string = (String) iterator.next();
		
	}
	
	for (String string : list) {
		char charArray[] = string.toCharArray();
		
		
		
	}
	
	
	
	HashMap<String, String>  hashMap = new HashMap<String,String>();
	
	
	
	ArrayList<Set<Integer>> list2 = new ArrayList<Set<Integer>>();

	
	
	HashSet<Integer> hashSet = new HashSet<Integer>();
	hashSet.add(1);
	list2.add(hashSet);
	

	
	
	HashSet<Integer> linkhashSet = new HashSet<Integer>();
	linkhashSet.add(1);
	list2.add(linkhashSet);
	
	for (Set<Integer> integer : list2) {
		//System.out.println("value=="+integer);
	}
	
	
	String str[] ={"Hai","hello"};
	
	Iterator<String> iterator = list.iterator();
	while(iterator.hasNext()){
		//System.out.println("ArrayList value=="+iterator.next());
	}
	
	
		
	}

}

class Item  implements Comparable<Item>{
	
	private String name;
	
	private double price;
	
	public Item(String name,double price){
		this.name=name;
		this.price=price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int compareTo(Item o) {
		return this.name.compareTo(o.getName());
		/*if(this.name.compareTo(o.getName())==1)
				return -1;
		else if(this.name.compareTo(o.getName())==-1)
			return 1;
		else
			return 0;*/
		//return 0;
	}
	
	
}



