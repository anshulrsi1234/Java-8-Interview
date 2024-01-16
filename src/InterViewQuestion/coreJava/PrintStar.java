package InterViewQuestion.coreJava;

/**
 * This Question is ask in John Deege company.
 * @author anshul
  
 
		*
		**
		***
		****
		*****
		******
		*******
		********
		*******
		******
		*****
		****
		***
		**
		*
 
 */
public class PrintStar {

	public static void main(String[] args) {
		int column = 8;
		int row = (column*2);
		
		// 8 Row star should be formed.
		for (int i = 1; i < row; i++) {
			// Column is more than defined value row
			if (column >= i) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println("");
			} else {
				// i== 5
				for (int j = (row - i); j > 0; j--) {
					System.out.print("*");
				}
				System.out.println("");
			}
		} // end of for loop.

	}

}
