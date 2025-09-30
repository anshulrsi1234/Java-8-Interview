package InterViewQuestion.coreJava.shape;

/**
 * 
	Write Down a code to print this output.
	
	*
	* *
	* * *
	* * * *
	* * * * *
	* * * * * *
	* * * * * * *
	* * * * * * * *
	* * * * * * *
	* * * * * *
	* * * * *
	* * * *
	* * *
	* *
	*
	
 */
public class PrintDiamondShape2 {
	
	public static void main(String[] args) {
		
		int colmneSize= 8;
		
		// Section increase 
		for (int i = 1; i < colmneSize; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		// Section decrease 
		for (int i = colmneSize-1; i >= 1; i--) {
			
			for (int j = 1; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
	}

}
