package InterViewQuestion.StreamAPI;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

//This Question is ask in Frequency Company
public class Occurance {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,1,2,4,5};
		
		Map<Integer,Integer> map= new HashMap<Integer,Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			
			if(map.containsKey(arr[i])) {
				map.put(arr[i],map.get(arr[i])+1);
			}else {
				map.put(arr[i],1);
			}
		}
		
		//=============================== case 2 =========================================================================
		
		// Display data in List
		System.out.println("======================== Display data in List============================== \n");
		List<Entry<Integer, Integer>> value = map.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()).collect(Collectors.toList());
		System.out.println(value + " \n");
		
		// Display data in print
		System.out.println("------------print usig system.out.print method------------------------------------------- ");
		map.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()).forEach(System.out::println); // or any other terminal method
		
	}
	
	    

}
