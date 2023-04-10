package InterViewQuestion.StreamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

// Fetch Duplcate element from the list....

public class FetchDuplicateElement {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,3,5,6,7,8,9,7,6,4,8,8,3,5,2);
		
		Set<Integer> set = new HashSet<>();
		
		Set<Integer> duplicateElement = null;
		
		Set<Integer> data = list.stream().filter(ele -> !set.add(ele)).collect(Collectors.toSet());
		
		System.out.println("data-1  = "  + data  +"\n");
		 
		data.forEach(x-> System.out.println("duplicateElement-1  = "  + x));
		
		System.out.println("=====Step 2=======" + "\n");
		
		Map<Integer, Long> result = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		//Case 1 :
		//duplicateElement = list.stream().filter(n -> result.get(n) > 1).collect(Collectors.toSet());
		
		//Case 2 :
		duplicateElement = result.entrySet().stream().filter(ele -> ele.getValue() > 1).map(ele -> ele.getKey()).collect(Collectors.toSet());
		
		System.out.println("<<< duplicateElement-2 >>>> " + duplicateElement);
		
		
	}

}
