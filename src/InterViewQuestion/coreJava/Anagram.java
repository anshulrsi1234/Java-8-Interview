package InterViewQuestion.coreJava;

/**
 * Two strings are said to be anagram if we can form one string by arranging the characters of another string. For example, Race and Care
 * @author anshul
 *
 */
public class Anagram {

	public static void main(String[] args) {
		
		String myString1  = "snow"; 
		
		String myString2  = "owns"; 
		
		// TODO Auto-generated method stub
		
		Boolean result = getAnagramString(myString1, myString2);
		
		System.out.println(result ? "Function is Anagram" : "function is not Anagram");
		
	}
	
	
 public static Boolean getAnagramString(String str1, String str2) {
	  
	boolean isAnagram = false;
	
	for(int i = 0 ; i < str2.length() ; i++) {
		
		char value = str2.charAt(i);
		
		if(str1.contains(String.valueOf(value))) {
			isAnagram = true;
		}else {
			isAnagram = false;
			return isAnagram;
		}
	}
	
	return isAnagram;
	
  }

}
