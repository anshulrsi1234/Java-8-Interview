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
		
		//Use Submit if response required. OR Used Submit when you need any response
		Future<?> future = executors.submit(() -> {
			// TODO
		});
		
		// Use execute if response not required. // Execute not return any response
		executors.execute(() -> {
			// TODO 
		});
		
		System.out.println("Hello :::::::");
	}

}
