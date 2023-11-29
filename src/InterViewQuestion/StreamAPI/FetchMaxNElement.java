package InterViewQuestion.StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

// Class is exposed to fetch Max and Min 'N' element.

public class FetchMaxNElement {
	
	//Main Method...
	public static void main(String[] args) {
		
		List<Integer> listOfIntegers = Arrays.asList(11, 13, 9, 20, 7, 3, 30,90,20);
		
		Integer max_Value = Collections.max(listOfIntegers);
		Integer maxIndex = listOfIntegers.indexOf(max_Value);
		
		System.out.println("Max Value :: "  + max_Value  + " \t Min Index :: " + maxIndex);
		
		List<String> listOfString = Arrays.asList("blue", "Blue", "Java", "gem", "test", "Babu", "Zri");
		Collections.sort(listOfString);
		
		System.out.println("Sorted String By Collection :::: "  + listOfString);
		
		
		int maxValue =   listOfIntegers
						.stream()
						.max((x,y) -> x-y)
						.get();
		
		System.out.println("Max Value is ::::  "  + maxValue);
		
		
		int maxValue_= listOfIntegers.stream().max((x,y) -> x.compareTo(y)).get();
		
		System.out.println("MaxValue By compareTo methgod :::: "  + maxValue_ );
		
		// sort in descending-order and get 2nd largest element
        int secondLargestNumber = listOfIntegers
                .stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        
        System.out.println("Second Largest Number :::: "  + secondLargestNumber);
        
        
        // sort in descending-order and get 3nd largest element
        int thirdLargestNumber = listOfIntegers
                .stream()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst()
                .get();
        
        System.out.println("Third Largest Number ::::  "  + thirdLargestNumber);
        
        // sort in ascending -order and get 3nd lowest element
        int thirdLowestNumber = listOfIntegers
                .stream()
                .sorted()
                .skip(2)
                .findFirst()
                .get();
        
        System.out.println("Third Lowest Number :::: "  + thirdLowestNumber);
        
        // Sum of all elements
        int sum = listOfIntegers.stream().mapToInt(Integer::intValue).sum();
        
        System.out.println("Sum of all elements :::: "  + sum);
        
        // Min of all elements
        Integer min = listOfIntegers
		        		.stream()
		        		.min(Comparator.comparing(Integer::valueOf))
		        		.get();
        
        System.out.println("The Minimum number is ::: " + min);
        
        // Max of all elements
		Integer max =   listOfIntegers
		        		.stream()
		        		.max(Comparator.comparing(Integer::valueOf))
		        		.get();
		
		System.out.println("The Maximum number is: " + max);
		
		// Max of all elements
	    List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		Set<Integer> set = new LinkedHashSet<>();
		
		System.out.println("==========================================================");
		
		myList.stream().sorted().filter(n -> !set.add(n)).forEach((data) -> {
			System.out.println("Duplicate Element is ::: " + data);
		});
		
		System.out.println("==========================================================");
		
		System.out.println("The Unique element from list is ::: " + set);
        
	}

}

