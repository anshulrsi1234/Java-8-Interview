package InterViewQuestion.coreJava.shape;

/**
 
		 * 
	    * * 
	   * * * 
	  * * * * 
	 * * * * * 
	  * * * * 
	   * * * 
	    * * 
	     * 
  
 * @author anshul
 *
 */
public class DiamondStar {

	public static void main(String[] args) {

		int i , j , k, row= 5;
		
		// Increase 
		for (i = 0; i <= row-1; i++) {
			
			for (j = row-1; j >= i; j--) {
				System.out.print(" ");
			}
			for (k = 0; k <= i; k++) {
				System.out.print("*" +" ");
			}
			System.out.println();
		}
		// Decrease 
		for (i = 0; i <= row-1; i++) {
			
			for (j = -1; j <= i; j++) {
				System.out.print(" ");
			}
			for (k = 0; k <= row-i-2; k++) {
				System.out.print("*" +" ");
			}
			System.out.println();
		}

	}

}
