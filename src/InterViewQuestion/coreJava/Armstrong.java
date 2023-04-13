package InterViewQuestion.coreJava;

import java.util.Scanner;

// This Question is asked in American Express.
public class Armstrong {

    public static void main(String[] args) {
    	
    	int number = 0, originalNumber, remainder, result = 0;
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("Enter the number: ");
    	
		// reads the limit from the user
    	number = sc.nextInt();

        originalNumber = number;

        while (originalNumber > 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}