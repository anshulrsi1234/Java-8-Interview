package InterViewQuestion.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Write a program to print 21,22,23,24
public class Stream {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("user:21","user:22","user:23","user:24");

		List<String> intValue = list.stream().map(i -> i.split(":")[1]).peek(System.out::println).collect(Collectors.toList());
		
		System.out.println(intValue);
	}
}
