package InterViewQuestion.coreJava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//This class is exposed to fetch a number of higher and lower.
public class FetchHighestAndLowest {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,3,4,9,8,7};
		
		Arrays.sort(arr);
		
		// Fetch 2nd Highest Numer.
		
		int second_highestNum = arr[arr.length-2];
		System.out.println(" Second Highest Number ::: " + second_highestNum);
		
		int lowest = arr[1];
		System.out.println(" Second Lowest Number :::  " + lowest);
		
		
		// Get 2 Highest Number via - java 8
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		List<Integer> secHighestList = list.stream().sorted(Comparator.reverseOrder()).limit(2).collect(Collectors.toList());
		
		System.out.println(" Two Highest Record ::: " + secHighestList);
		
		// Add sum of two highest Number
		
		int sum = secHighestList.stream().reduce((a,b)-> a+b).get();
		
		System.out.println(" Sum of two Number  ::: " + sum);
		

	}

}
