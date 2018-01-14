package Collection.Set;

import java.util.HashSet;

public class HashSetLearning {

	public static void main(String[] args) {
		HashSet<String>  hashSet = new HashSet<String>();
		if(hashSet.add(null))
			System.out.println("Value added");
		else
			System.out.println("Value not added");
		
		System.out.println("Szie=="+hashSet.size());
		if(hashSet.add(null))
			System.out.println("Value added");
		else
			System.out.println("Value not added");
		
		System.out.println("Szie=="+hashSet.size());
		HashSet<Student>  hashSet1 = new HashSet<Student>();
		
		hashSet1.add(new Student("Raj"));
		hashSet1.add(new Student("Raj"));
		hashSet1.add(new Student("Raj"));
		
		System.out.println("Size  raj=="+hashSet1.size());
		
		hashSet.add("hai");
		hashSet.add("hello");
		hashSet.add("how");
		hashSet.add("are");
		for (String string : hashSet) {
			System.out.println("Value=="+string);
		}
		
	}
	
	

}


class Student{
	private String name;
	
	public Student(String name){
		this.name= name;
	}
	
	public boolean equals(Object obj){
		Student stu=(Student)obj;
		if(stu.name.equals(this.name))
			return true;
		else
			return false;
		
	}
	
	/*public int hashCode(){
		return this.name.hashCode();
	}*/
	
	
}
