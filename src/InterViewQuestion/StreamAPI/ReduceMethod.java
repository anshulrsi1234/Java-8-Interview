package InterViewQuestion.StreamAPI ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Program for non Repeatable
public class ReduceMethod {
	
	public static void main(String[] args) {
		
	// Getting the Sum of Number
		
	List<Integer> list = Arrays.asList(1,2,3,5,6,7,8);
	
	int sum = list.stream().reduce(0,Integer::sum);
		
	System.out.println("<< sum >>> " + sum);
	
	
	// Getting the Sum of Number
	
	List<String> numString = Arrays.asList("1","2","3","5","6","7","8");
	
	String joinString = numString.stream().collect(Collectors.joining());
		
	System.out.println(joinString);
	
	// Getting the output as in A-B-C-D format
	List<String> stringList = Arrays.asList("A","B","C","D","E","F","G");
	
	String stringSum = stringList.stream().collect(Collectors.joining("-"));
	
	System.out.println("string-Sum = " + stringSum);
	
	
	// Getting the out put as {A,B,C,D,E,F,G}
	List<String> stringList1 = Arrays.asList("A","B","C","D","E","F","G");
	
	String stringSum1 = stringList1.stream().collect(Collectors.joining(",", "{", "}")); 
	
	System.out.println(stringSum1);
	
	List<String> letters = Arrays.asList("j", "a", "v", "a", "t", "e", "c", "h", "o", "n", "l", "i", "n", "e"); 
	
	// 1) Join  the String value # out put is = javatechonline
	
		String result = letters.stream().reduce(" ", (partialString, element) -> partialString + element);
		System.out.println("<<< letters >>>>>>>" + result);
		
	// 2) ========================= Via String :: Concat =============================================================
	
		String result_ = letters.stream().reduce(" ", String::concat);
		System.out.println("<<< Result by reduce(String::concat) >>>>>>> " + result_);
	
	// 3) ========================= Via Collectors :: joining =========================================================
		String result_11 = letters.stream().collect(Collectors.joining());
		System.out.println("<<< String by Collectors.joining() >>>>>>>" + result_11);
	
	}

}
