package InterViewQuestion.coreJava;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 16;
		
		int increment = 8;
	
		for(int i=1 ; i <= count ;i++) {     // 1     8

			 if(i > increment){   // 9  > 8
			 
				for(int j = count-- ; j <= i  ; j --) {       // j < =  i   
					System.out.print(" * ");
				}
				
			 }else{
				for(int j =1 ; j <= i ; j ++){       // i= 8
					System.out.print(" * ");
				}
				
			 } //end of else
			 System.out.println(" ");
			} // end of For
			

	}

}
