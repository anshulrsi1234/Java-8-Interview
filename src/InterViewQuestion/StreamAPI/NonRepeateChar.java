package InterViewQuestion.StreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

/** 
 * Write a program to java to return non repeatable char.
 * 
 * Company : CSK Global
 * Date : 6-Aug-2025
 * Level : L1
 */
public class NonRepeateChar {

	public static void main(String[] args) {
		
		// First Non Repeatable char
		String str = "Mahesh";

		Map<Character, Long> value = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));

		System.out.println(value);
		
		Entry<Character, Long> data = value.entrySet().stream().filter(key -> key.getValue()==1).findFirst().get();
		
		System.out.println("First Non Repetable Value  " + data);

	}

}
