package Multithreading;

public class ThreadExample {

	public static void main(String[] args) {
		
		System.out.println("no of processors=="+ Runtime.getRuntime().availableProcessors());
		ThreadClass threadClass = new ThreadClass();
		threadClass.start();
		try {
			threadClass.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main Thread completed");

	}

}



class ThreadClass extends Thread{
	
	
	public void run(){
		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		System.out.println("Is Daemon="+Thread.currentThread().isDaemon());
	}
	
}
