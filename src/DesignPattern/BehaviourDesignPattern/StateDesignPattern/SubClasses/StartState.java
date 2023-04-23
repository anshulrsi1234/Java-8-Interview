package DesignPattern.BehaviourDesignPattern.StateDesignPattern.SubClasses;

import DesignPattern.BehaviourDesignPattern.StateDesignPattern.Context;
import DesignPattern.BehaviourDesignPattern.StateDesignPattern.State;

/**
 * 
 * @author Anshul
 *
 * @date  Apr 23, 2023
 */
public class StartState implements State {

   @Override
   public void doAction(Context context) {
      System.out.println("Player is in start state");
      context.setState(this);	
   }

   public String toString(){
      return "Start State";
   }

}