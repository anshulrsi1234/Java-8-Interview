package InterViewQuestion.StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedList {
	
	// Output should like Blue,black, blue
	public static void main(String[] args) {
		
		List<String> colorList = Arrays.asList("black", "Blue", "purple", "blue", "Grey", "green", "Red", "pink");
		
		Comparator<String> comparator = Comparator.comparing(s ->  Character.toLowerCase(s.charAt(0)));
		
		colorList.sort(comparator.thenComparing(Comparator.naturalOrder()));
		
		System.out.println(colorList);
	}
}
