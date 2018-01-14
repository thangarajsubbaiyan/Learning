package Map;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;

public class ConcurrentHashmapExample {

	public static void main(String[] args) {
		ConcurrentHashMap<String, String>  concurrentHashMap = new ConcurrentHashMap<String, String>();
		ConcurrentHashmapClass class1 = new ConcurrentHashmapClass(concurrentHashMap);
		ConcurrentHashmapClass class2 = new ConcurrentHashmapClass(concurrentHashMap);

		Thread thread1 = new Thread(class1,"Thread1");
		Thread thread2 = new Thread(class1,"Thread2");
		
		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Get value=="+concurrentHashMap.size());
		
	}

}




class ConcurrentHashmapClass  implements Runnable{
	
	ConcurrentHashMap<String, String>  concurrentHashMap;
	
	
	
	
	public ConcurrentHashmapClass(ConcurrentHashMap<String, String>  concurrentHashMap){
		this.concurrentHashMap=concurrentHashMap;
	}


	@Override
	public void run() {
		
		int i=0;
		
		while(i<20){
			concurrentHashMap.put(String.valueOf(i)+Thread.currentThread().getName(), String.valueOf(i));
			i++;
		}
		
		/*System.out.println("Thread enetering run method=="+Thread.currentThread().getName());
		System.out.println("Get value=="+concurrentHashMap.size());
		concurrentHashMap.put("1", "1");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Exit=="+Thread.currentThread().getName());*/
	}
	
}
