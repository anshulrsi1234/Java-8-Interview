package InterViewQuestion.coreJava;

public class desirePattern {
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6}; 
		
		// i for rows and j for columns
		
// ====================================================================================================================
		
		/**
			Case 1 :   if Length-6  |  Array-[1,2,3,4,5,6] |  Group- 4  |  Iterations- 7
				
			// Print Out Like below
			
			'1', '2', '3', '4'
			'5', '6', '1', '2'
			'3', '4', '5', '6'
			'1', '2', '3', '4'
			'5', '6', '1', '2'
			'3', '4', '5', '6'
			'1', '2', '3', '4'

	   */
		
		// int group = 4; int arrLength = 6; int iteration = 7;
		
		 /**
		  
		   Case 2 : if  Group - 5 | Iterations- 2 |  Array-[1,2,3,4,5,6]
		
		   // Print Out Like below
		  
		      '1', '2', '3', '4', '5'
			  '6', '1', '2', '3', '4'
			  
		  */
		
		int group = 5; int arrLength = 6; int iteration = 2;
		   
		/**
		 * 
		     Case 3 :  if Group- 3 | Iterations- 3
		   
		 	// Print Out Like below
		   
		      '1', '2', '3'
			  '4', '5', '6'
	          '1', '2', '3'
		*/
		   
		  // int group = 3; int arrLength = 6; int iteration = 3;
		   
// =====================================================================================================================		   
		   
		int newCounter = 1; int j = 1;
		
		boolean rowPrint = false;
		
		for (int i = 1; i <= iteration; i++) {  // loop for Row iteration 
			
			for (j = 1; j <= group; j++) { // loop for group length / Column iteration
				
				if(rowPrint && newCounter < arrLength) {
					newCounter++;
					System.out.print("'" + newCounter + "'" + (j < group ? "," : ""));
				}
				else if(rowPrint && newCounter == arrLength) {
					newCounter = j-2;
					if(newCounter > 0) {
						System.out.print("'" + newCounter + "'" + (j < group ? "," : ""));
					}else {
						newCounter= newCounter + 2;
						System.out.print("'" + newCounter + "'" + (j < group ? "," : ""));
					}
				}else {
					if(newCounter > 0) {
						System.out.print("'" + j + "'" + (j < group ? "," : ""));
						newCounter = j;
					}
				}
			 } // end of for Loop
			
			rowPrint = true;
			System.out.println();
			
		} // end of for loop 
			
			
	}

	
}


