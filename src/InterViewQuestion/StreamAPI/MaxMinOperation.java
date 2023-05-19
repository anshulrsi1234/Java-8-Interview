package InterViewQuestion.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
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
		
		// Fetch Max and Min Operation  
		
		int a[] = {1,2,5,6,3,2};  
		
	   Integer maxValue = Arrays.stream(a).boxed().max((x,y) -> x.compareTo(y)).get();
	   System.out.println("Max Value is " + maxValue);
	   
	   Integer minValue = Arrays.stream(a).boxed().min((x1,y1) -> x1.compareTo(y1)).get();
	   System.out.println("Min Value is " + minValue);
	   
	   
	}
	

}
