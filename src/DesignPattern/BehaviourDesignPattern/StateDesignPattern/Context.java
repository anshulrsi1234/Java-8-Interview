package DesignPattern.BehaviourDesignPattern.StateDesignPattern;

/**
 * 
 * @author Anshul
 *
 * @date Apr 23, 2023
 */
public class Context {
	
	private State state;

	public Context() {
		state = null;
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}
}
