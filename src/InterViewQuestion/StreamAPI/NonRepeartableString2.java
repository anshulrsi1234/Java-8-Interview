package InterViewQuestion.StreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

// Program to return non repeatable number. 
public class NonRepeartableString2 {
	
	public static void main(String[] args) {
		
		String str = "java programming";
		
		Map<String,Integer> map = new LinkedHashMap<>();
		
		for (char ch : str.toCharArray()) {
			if(String.valueOf(ch).trim().length() > 0) {
				map.put(String.valueOf(ch),map.containsKey(String.valueOf(ch)) ? map.get(String.valueOf(ch))+1 : 1);
			}
		} 
		
		 System.out.println(">>> map <<<<<" + map);
		
		 // ================  2nd Ways ================================================================================================ 
		 String hello = map.entrySet().stream().filter(i -> i.getValue()==1).map(i ->i.getKey()).collect(Collectors.toList()).toString();
		 System.out.println(">>> Non Repeatble Result is  <<<<<" +hello);
		
	}

}
