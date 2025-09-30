package testExmple;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {
	
    public static void main(String[] args) {
    	
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Uses ForkJoinPool.commonPool() internally
        names.parallelStream().forEach(name -> {
            System.out.println(Thread.currentThread().getName() + ": " + name);
        });
    }
}