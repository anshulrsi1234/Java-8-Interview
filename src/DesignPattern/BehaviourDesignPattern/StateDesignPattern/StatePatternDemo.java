package DesignPattern.BehaviourDesignPattern.StateDesignPattern;

import DesignPattern.BehaviourDesignPattern.StateDesignPattern.SubClasses.StartState;
import DesignPattern.BehaviourDesignPattern.StateDesignPattern.SubClasses.StopState;

/**
 * 
 * @author Anshul
 *
 * @date  Apr 23, 2023
 */
public class StatePatternDemo {
	
	public static void main(String[] args) {
		
      Context context = new Context();

      StartState startState = new StartState();
      startState.doAction(context);

      System.out.println(context.getState().toString());

      StopState stopState = new StopState();
      stopState.doAction(context);

      System.out.println(context.getState().toString());
      
   }

}
