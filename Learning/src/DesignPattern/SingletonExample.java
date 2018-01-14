package DesignPattern;

public class SingletonExample {

	public static void main(String[] args) {
		SingletonClass.getInstance();

	}

}



class SingletonClass{
	
	private static SingletonClass instance;
	
	private SingletonClass(){
		super();
	}
	
	public static SingletonClass getInstance(){
		if(instance == null){
			synchronized (SingletonClass.class) {
				if(instance == null)
					return instance = new SingletonClass();
			}
			
		}
		return instance;
	}
}
