package test;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;


public class java8 {
	
	private Lock locks= new ReentrantLock(false);
			
	
	public static void main(String[] args) {
		
		String siteName ="TM BGC";
		
		Set<String> siteSet = new HashSet<String>();
		
		siteSet.add("TM BGC");
		siteSet.add("BRQH");
		
		boolean isDifferentSite =  siteSet.stream().anyMatch(site -> !site.equals(siteName));
		
		System.out.println(">>siteSet <<< " + isDifferentSite);
		
		System.identityHashCode(siteName);
		
		
		List<List<String>> list = Arrays.asList(Arrays.asList("a","d"),Arrays.asList("b","c"));
		System.out.println(list);
		
		List<String> list1= list.stream().flatMap(Collection::stream).collect(Collectors.toList());
		System.out.println(list1);
		
		Map<String, List<String>> people = new HashMap<>();
		people.put("John", Arrays.asList("555-1123", "555-3389"));
		people.put("Mary", Arrays.asList("555-2243", "555-5264"));
		people.put("Steve", Arrays.asList("555-6654", "555-3242"));

		List<String> phones = people.values().stream().flatMap(Collection::stream).collect(Collectors.toList());
		System.out.println(phones);
		
		List<Integer> list2   = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> newList = list2.stream().collect(Collectors.toList());
		 
		System.out.println(newList);
	}


	
	
	
	

}
