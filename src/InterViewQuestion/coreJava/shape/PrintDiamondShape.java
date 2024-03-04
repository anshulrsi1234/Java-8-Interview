package corejava.shape;

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
	
 */
public class PrintDiamondShape {

	public static void main(String[] args) {
		
		int colmneSize= 8;
		
		for (int i = 1; i < colmneSize; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}

	}

}
