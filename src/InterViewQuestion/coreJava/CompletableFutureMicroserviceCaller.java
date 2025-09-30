package InterViewQuestion.coreJava;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureMicroserviceCaller {

	public static void main(String[] args) throws ExecutionException, InterruptedException {
		
		CompletableFuture<String> serviceA = CompletableFuture.supplyAsync(() -> callMicroservice("Service A"));
		CompletableFuture<String> serviceB = CompletableFuture.supplyAsync(() -> callMicroservice("Service B"));
		CompletableFuture<String> serviceC = CompletableFuture.supplyAsync(() -> callMicroservice("Service C"));

		// Wait for all services to complete and then process results
		CompletableFuture<Void> allServices = CompletableFuture.allOf(serviceA, serviceB, serviceC);
		allServices.join(); // Blocks until all futures are complete

		System.out.println("Service A result: " + serviceA.get());
		System.out.println("Service B result: " + serviceB.get());
		System.out.println("Service C result: " + serviceC.get());
	}

	private static String callMicroservice(String serviceName) {
		System.out.println("Calling " + serviceName + "...");
		try {
			Thread.sleep(1000); // Simulate network latency or processing
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		return serviceName + " response";
	}
}