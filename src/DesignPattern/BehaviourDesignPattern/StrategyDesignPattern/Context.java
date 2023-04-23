package DesignPattern.BehaviourDesignPattern.StrategyDesignPattern;

/**
 * @author Anshul
 *
 * @date  Apr 23, 2023
 */
public class Context {
	
	private Strategy strategy;

	/**
	 * @param strategy
	 */
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public int executeStrategy(int n1, int n2){
		return strategy.doOperation(n1, n2);
	}

}
