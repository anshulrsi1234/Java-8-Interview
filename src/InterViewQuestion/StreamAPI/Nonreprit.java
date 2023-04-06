package InterViewQuestion.StreamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Program for non repeatable String
public class Nonreprit {
	
	public static void main(String[] args) {
		
		String str ="java class java Anshul class";
		
		List<String> listString = Stream.of(str.split(" ")).distinct().collect(Collectors.toList());
		
		String finalString = String.join(",", listString);
		
		System.out.println("<<<< finalString >>>>>>>> " + finalString);
		
	}

}
