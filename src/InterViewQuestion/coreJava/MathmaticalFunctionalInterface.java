package InterViewQuestion.coreJava;

/**
 * This question is being asked in Alfardan Exchange systems
 * 
 * Company = Alfardan Exchange
 * 
 * Write a functional Interface  that will return multiply of two number.
 * 
 */
public class MathmaticalFunctionalInterface {

	public static void main(String[] args) {
		
		MathmaticalFuntion mathFunction = (a, b) ->  {
			return a*b;
		};
		
		MathmaticalFuntion addFunction = (a, b) ->  {
			return a+b;
		};
		
		 int value =  mathFunction.multiple(5,6);
		 
		 System.out.println(" Multiply Value is :::: " + value);
		 
		 System.out.println(" Add Value is ::::::::: " + addFunction.multiple(5,6));
		  
	}
}
