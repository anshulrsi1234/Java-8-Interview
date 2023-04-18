package InterViewQuestion.StreamAPI;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * 
 * @author anshul
 *
 */
// This Question is asked in EY and Frequncy Company

public class SortedMapByValue {
	
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		Map<String,Integer> newMap = new LinkedHashMap<String,Integer>();
		
		map.put("Jayant", 80);
        map.put("Abhishek", 90);
        map.put("Danish", 40);
        map.put("Anushka", 80);
        map.put("Amit", 75);
        
        System.out.println("===========Sort Map By Key ================================================================");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        
        System.out.println("===========Sort Map By Value ==============================================================");
        map.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue()).forEach(System.out::println);
        
        System.out.println("=============================New Ways to put in Map ===================================");
        map.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue()).forEachOrdered(c -> newMap.put(c.getKey(), c.getValue()));
        System.out.println(">>> newMap >>>> " + newMap +"\n");
        
        System.out.println("=============================New Method ===================================");
        
        Map<String, Integer> sortBykey = sortedMapByKey(map);
        System.out.println(">>> sortBykey >>>> " + sortBykey);
        
        Map<String, Integer> sortByValue = sortedMapByValue(map);
        System.out.println(">>> sortByValue >>>> " + sortByValue);
        
	}
	
	public static <K extends Comparable<? super K>,V> Map<K,V> sortedMapByKey(Map<K,V> unSortedMap){
		Map<K,V> map = new LinkedHashMap<>();	
		Stream<Map.Entry<K,V>> streamMap = unSortedMap.entrySet().stream();
		streamMap.sorted(Map.Entry.comparingByKey()).forEachOrdered(c -> map.put(c.getKey(),c.getValue()));;
		return map;
	}
	
	
	public static <K,V extends Comparable<? super V>> Map<K,V> sortedMapByValue(Map<K,V> unSortedMap){
		Map<K,V> map = new LinkedHashMap<>();	
		Stream<Map.Entry<K,V>> streamMap = unSortedMap.entrySet().stream();
		streamMap.sorted(Map.Entry.comparingByValue()).forEachOrdered(c -> map.put(c.getKey(),c.getValue()));;
		return map;
	}

}
