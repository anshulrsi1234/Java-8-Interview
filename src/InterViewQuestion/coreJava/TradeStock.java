package InterViewQuestion.coreJava;

/**
 * We are trading some share in the stock market. Write a program in java to get the max profit.
 * 
 * Company : Altimetrik 
 * Date :
 * Level : L1 Round
 */
public class TradeStock {

	public static void main(String[] args) {

		// [9,3,2, 1 ,5,7,2, 8 ,3,4] -> Max diff is 7, from 1 and 8.

		// Case1:
		int[] value = { 9, 3, 2, 1, 5, 7, 2, 8, 3, 4 };

		// Case 2: // int[] value = {9, 8, 5, 4};

		int differece = 0;
		int firstItem = 0;
		int max = 0, max1 = 0;

		for (int i = 0; i < value.length; i++) { // 9

			firstItem = value[i];

			for (int j = i + 1; j < value.length; j++) {

				if (firstItem < value[j]) { // 9 < 3
					differece = (value[j] - firstItem);

					if (differece > max) {
						max = differece;
					}
				}

			}
		}

		System.out.println("Max Profit is :::::: " + max);

		/**
		 *  Case 3: Print is Minimum losses here........
		 */

		for (int i = 0; i < value.length; i++) { // 9

			firstItem = value[i];

			for (int j = i + 1; j < value.length; j++) {

				if (firstItem > value[j]) { // 9 < 8
					differece = (value[j] - firstItem);

					if (differece < max1) {
						max1 = differece;
					}
				}

			} // end of J for loop
		} // end of if i loop

		System.out.println("Min Losses is :::::: " + max1);

	}

}
