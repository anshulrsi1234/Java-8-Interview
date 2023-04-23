package DesignPattern.BehaviourDesignPattern.StrategyDesignPattern.SubClasses;

import DesignPattern.BehaviourDesignPattern.StrategyDesignPattern.Strategy;

/**
 * 
 * @author Anshul
 *
 */
public class operationAdd implements Strategy {

	@Override
	public int doOperation(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1+n2;
	}

}
