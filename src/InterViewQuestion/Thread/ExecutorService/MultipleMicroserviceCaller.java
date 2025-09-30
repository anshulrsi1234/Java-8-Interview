package InterViewQuestion.Thread.ExecutorService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleMicroserviceCaller {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executorService = Executors.newFixedThreadPool(3); // Example with 3 threads

		List<Callable<String>> tasks = new ArrayList<>();
		
		tasks.add(() -> callMicroservice("Service A"));
		tasks.add(() -> callMicroservice("Service B"));
		tasks.add(() -> callMicroservice("Service C"));

		List<Future<String>> results = executorService.invokeAll(tasks);

		for (Future<String> future : results) {
			System.out.println("Result: " + future.get()); // Blocks until each result is available
		}

		executorService.shutdown();
	}

	private static String callMicroservice(String serviceName) throws InterruptedException {
		System.out.println("Calling " + serviceName + "...");
		Thread.sleep(1000); // Simulate network latency or processing
		return serviceName + " response";
	}
}