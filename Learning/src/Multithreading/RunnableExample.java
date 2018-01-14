package Multithreading;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunnableExample {

	public static void main(String[] args) {
		Runnable runnable = new RunnableClass(10000);
		
		Runnable runnable1 = new RunnableClass(20000);
		
		
		ExecutorService executorService =Executors.newFixedThreadPool(2);
	
		
		ArrayList<Future>  arrayList = new ArrayList<Future>();
		arrayList.add(executorService.submit(runnable));
		arrayList.add(executorService.submit(runnable1));
		
		
	  
		for (Future future2 : arrayList) {
			try {
				System.out.println("Future value=="+future2.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Main Thread completed");
	}
	
	

}



class RunnableClass implements  Runnable {
	
	long sleepTime;
	
	RunnableClass(long sleepTime){
		this.sleepTime= sleepTime;
	}
	
	public void run() {
		try {
			
			Thread.currentThread().sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Completed Sleep time"+sleepTime);
		
	}
}
