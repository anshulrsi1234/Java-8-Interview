package InterViewQuestion.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// This Program is written to count repeated Number/String
public class CountRepeatWord {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,2,5,4,7,8,9,5,7,1);
		
		List<String> listString = Arrays.asList("Anshul","Singhal","Ankur", "Singhal","MOM", "Singhal");
		
		
		Map<Integer, Long> newList  = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(newList);
		
		
		Map<String, Long> newStringList = listString.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(newStringList);
		
		int [] arr = {1,2,3,4,5,6,2,5,4,7,8,9,5,7,1};
		// Convert arrays to List of Integer.
		List<Integer> list_1 = Arrays.stream(arr).boxed().collect(Collectors.toList());
		Map<Integer, Long> newList_  = list_1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(" <<<<< newList_ >>>> " + newList_);
		 
		 
	}

}
