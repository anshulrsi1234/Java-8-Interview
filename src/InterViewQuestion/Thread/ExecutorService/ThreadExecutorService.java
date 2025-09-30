package InterViewQuestion.Thread.ExecutorService;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadExecutorService {
	
	
	public static void main(String[] args) {
		
		
	   Callable<String> callable = () -> {

			System.out.println("Entered Callable");

			Thread.sleep(2000);

			return "Hello";

		};
		

		System.out.println("Starting new Thread");

		ExecutorService executorService = Executors.newSingleThreadExecutor();

		Future<String> future = executorService.submit(callable);

		System.out.println("Doing something else");

		System.out.println("Retrieve thread result");

		String result = null;
		try {
			result = future.get();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		} // this blocks till result is available
		System.out.println("Result is:" + result);
		
		executorService.shutdown();
			
	}

}
