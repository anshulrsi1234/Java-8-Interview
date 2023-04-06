package InterViewQuestion.Thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// This Question is ask in many Company i.e How will you create the Thread Pool.
public class ThreadPool {
	
	public static void main(String[] args) {
		
		Executor ec= Executors.newFixedThreadPool(10);
		ExecutorService executors = Executors.newFixedThreadPool(4);
		
		//Use Submit if response required.
		Future<?> future = executors.submit(() -> {
			
						  });
		
		executors.execute(() -> {
			
		});
		
		System.out.println("Hello :::::::");
	}

}
