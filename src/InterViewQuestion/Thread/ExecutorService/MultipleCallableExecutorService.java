package InterViewQuestion.Thread.ExecutorService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Here multiple callable method will be called in exectorservice.
 * This question is being ask in CRIS 
 * Company = CRIS
 * Date : 16-Aug-2025
 */
public class MultipleCallableExecutorService {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		// Declare a List of Callable objects with unspecified return types
	    List<Callable<Object>> callableList = new ArrayList<>();
	    
	    // Create an ExecutorService to execute the Callables
        ExecutorService executorService = Executors.newFixedThreadPool(3);
		
	    // Add Callable objects with different return types
	    
	    callableList.add(() -> {
	        Thread.sleep(1000); // Simulate some work
	        return "Task 1 completed";
	    });

	    callableList.add(() -> {
	        Thread.sleep(500); // Simulate some work
	        return 123; // Returns an Integer
	    });

	    callableList.add(() -> {
	        Thread.sleep(700); // Simulate some work
	        return true; // Returns a Boolean
	    });
	    
	    Future<String> future1 =  executorService.submit(()-> "Hello");
	    
	    List<Future<Object>> futures = executorService.invokeAll(callableList);
	    
	    // Retrieve and print the results from the Futures
        for (Future<?> future : futures) {
            System.out.println("Result: " + future.get());
        }
	    
	    
	    
	}

}
