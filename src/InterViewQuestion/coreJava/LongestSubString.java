package InterViewQuestion.coreJava;


/**
 * Company : CDK Global 
 * Date : 12 Aug -25
 * Round : L2
 * 
 * Find the length of the longest substring without repeating characters.
 * 
 * Input: abdedecadfb Output String : ecadfb , length : 6
 */

public class LongestSubString {

	public static void main(String[] args) {

		String str = "abdedecadfb";
		StringBuffer sb = new StringBuffer();

		char[] ch = str.toCharArray(); // a,b,d,e,d,e,c,a,d,f,b

		for (int i = 0; i < ch.length; i++) {

			char firstChar = ch[i]; // a

			for (int j = i + 1; j <= ch.length;) {

				String subString = str.substring(j, str.length());

				if (!subString.contains(String.valueOf(firstChar))) {
					sb.append(firstChar);
					break;
				} else {
					break;
				}
			}

		}

		System.out.println("Length of the repeating characters ::: " + sb);

	}

}
