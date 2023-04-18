package InterViewQuestion.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MaxMinOperation {
	
	public static void main(String[] args) {
		
		Stream<String> s = Stream.of("Java", "Python", "Scala"); 
		Optional<String> min = s.min((s1, s2) -> s2.length() - s1.length()); 
		min.ifPresent(System.out::println); 
		
		List<String> valueList = new ArrayList<>();
		valueList.add("Joe");
		valueList.add("John");
		valueList.add("Sean");
		
		
		String result = valueList.stream().reduce("",(a,b) -> b);
		System.out.println("result>>>>>> " +result);
		
		// get 2nd last element from the stream.
		long count = valueList.stream().count();
		String result1 = valueList.stream().skip(count-1).findFirst().get();
		System.out.println("result1 >>>>>> " +result1);
		
		
	}
	

}
