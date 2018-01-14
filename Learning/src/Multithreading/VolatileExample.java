package Multithreading;

public class VolatileExample {
	
	private volatile boolean  display=true;
	
	public void display(){
		while(display){
			System.out.println("VolatileExample");
		}
	}
	
	public void stopDisplay(){
		this.display = false;
	}

	public static void main(String[] args) {
		VolatileExample volatileExample = new VolatileExample();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				volatileExample.display();
				
			}
		});
		
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				volatileExample.stopDisplay();
				
			}
		});
		
		
		t1.start();
		t2.start();

	}

}
