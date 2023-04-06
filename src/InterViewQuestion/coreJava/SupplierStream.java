package InterViewQuestion.coreJava;

import java.util.Arrays;

public class SupplierStream {

	public static void main(String[] args) {
		
		String[]  stArry={"Amit","Ball","call","Amit","eff"};
        Arrays.stream(stArry).forEach(System.out::println);
        
        long count = Arrays.stream(stArry).filter(i->"Amit".equals(i)).count();
        System.out.println("<<< Count >>>> " + count);
        
		
	}
	
	
}
