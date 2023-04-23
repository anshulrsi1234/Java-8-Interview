package DesignPattern.BehaviourDesignPattern.StrategyDesignPattern;

import DesignPattern.BehaviourDesignPattern.StrategyDesignPattern.SubClasses.operationAdd;
import DesignPattern.BehaviourDesignPattern.StrategyDesignPattern.SubClasses.operationMultiply;
import DesignPattern.BehaviourDesignPattern.StrategyDesignPattern.SubClasses.operationSub;

/**
 * @author Anshul
 *
 * @date  Apr 23, 2023
 */
public class StrategyPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Step 1 : 
		Context context = new Context(new operationAdd());
		System.out.println(context.executeStrategy(10, 5));;
		
		//Step 2 : 
		context = new Context(new operationSub());
		System.out.println(context.executeStrategy(10, 5));
		
		//Step 3 : 
		context = new Context(new operationMultiply());
		System.out.println(context.executeStrategy(10, 5));
		
	}

}
