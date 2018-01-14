package Multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorExample {

	public static void main(String[] args) {
		
		List<Future<String>>  futures = new ArrayList<Future<String>>();
	ExecutorService executorService = new ThreadPoolExecutor(5, 10, 1, TimeUnit.MINUTES, new LinkedBlockingQueue<>(2));
	System.out.println("Thread pool created");
	
	futures.add(executorService.submit(new Webservice2()));
	
	
	System.out.println("webservice2 submitted");
	futures.add(executorService.submit(new Webservice1()));
	
	System.out.println("webservice1 submitted");
	
	for (Future<String> future : futures) {
		try {
			System.out.println("Future results=="+future.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	System.out.println("Main program completed");
	
	}

}


class Webservice1 implements Callable<String>{

	@Override
	public String call() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "webservice1 completeed";
		
	}
	
}


class Webservice2 implements Callable<String>{

	@Override
	public String call() {
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "webservice2 completeed";
		
	}
	
	
	
}
