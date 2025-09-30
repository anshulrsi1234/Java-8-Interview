package InterViewQuestion.coreJava.shape;

/**
 * 

  	 A 
    A B 
   A B C 
  A B C D 
 A B C D E 
  A B C D 
   A B C 
    A B 
     A 

 * 
 * @author anshul
 *
 */
public class DiamondAlphabet {

	// Main driver method
	public static void main(String[] args) {

		int i, j, k, alphabet = 65;

		int rows = 5;

		for (i = 0; i <= rows - 1; i++) {   // 0 to (5-1) = 4
			
			for (j = rows - 1; j >= i; j--) {  //  4  to 0
				System.out.print(" ");
			}
			for (k = 0; k <= i; k++) {    // 0  to 4
				char ch = (char) (alphabet + k);
				System.out.print(ch + " ");
			}
			System.out.println();
		}

		// Step 2
		for (i = 0; i <= rows - 1; i++) 
		{
			for (j = -1 ; j <= i; j++ ) 
			{
				System.out.print(" ");
			}
			for (k = 0; k <= rows - i - 2; k++ )  // 
			{
				char ch = (char) (alphabet + k);
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}
}
