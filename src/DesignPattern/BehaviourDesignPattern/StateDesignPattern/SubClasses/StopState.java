package DesignPattern.BehaviourDesignPattern.StateDesignPattern.SubClasses;

import DesignPattern.BehaviourDesignPattern.StateDesignPattern.Context;
import DesignPattern.BehaviourDesignPattern.StateDesignPattern.State;

/**
 * 
 * @author Anshul
 *
 * @date  Apr 23, 2023
 */
public class StopState implements State {

	public void doAction(Context context) {
		System.out.println("Player is in stop state");
		context.setState(this);
	}

	public String toString() {
		return "Stop State";
	}
}
