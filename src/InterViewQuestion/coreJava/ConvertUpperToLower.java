package InterViewQuestion.coreJava;

public class ConvertUpperToLower {
	
	// Convert the String testCode  to  test_code

	// Convert the test_code -> testCode

	// Convert the testCode  -> test_code

	// Convert the test_code_new -> testCodeNew
	
	public static void main(String[] args) {
		
		System.out.println(getData("testCode"));
		
	}
	
	public static String getData(String inputData) {

		 String str = inputData;  
		 
		 StringBuffer sb  = new StringBuffer();
		 
		 if(str.contains("_")){   // // test_code_new
		 
			 String[] array = str.split("_");
			 
			 for(int i = 0 ; i< array.length; i++) {
			 
			 if(i > 0){
				String Value = String.valueOf(array[i].charAt(0)).toUpperCase();
				String newArrayString  = array[i].replaceAll(String.valueOf(array[i].charAt(0)), Value);
				sb.append(newArrayString);
				continue;
			 }
				sb.append(array[i]);
			 }
			 
		}
		else { // testCode - >test_code
		
			for(int i= 0; i < str.length(); i++){
				
				if(Character.isUpperCase(str.charAt(i))){
					sb.append("_" + String.valueOf(str.charAt(i)).toLowerCase());
				}
				else{
					sb.append(str.charAt(i));
				}
			}
		
			
		
		}
		
		return sb.toString();
		
		}

}
