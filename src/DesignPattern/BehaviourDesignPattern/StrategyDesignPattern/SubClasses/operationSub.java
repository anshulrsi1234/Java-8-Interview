package DesignPattern.BehaviourDesignPattern.StrategyDesignPattern.SubClasses;

import DesignPattern.BehaviourDesignPattern.StrategyDesignPattern.Strategy;

/**
 * @author Anshul
 *
 * @date  Apr 23, 2023
 */
public class operationSub implements Strategy {

	/* (non-Javadoc)
	 * @see DesignPattern.BehaviourDesignPattern.StrategyDesignPattern.Strategy#doOperation(int, int)
	 */
	@Override
	public int doOperation(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1-n2;
	}

}
