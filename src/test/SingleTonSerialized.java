package test;

import java.io.Serializable;

public class SingleTonSerialized  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static SingleTonSerialized  instance = new SingleTonSerialized();
	
	// implement readResolve method
    protected Object readResolve() {
        return instance;
    }
    
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
    	return instance;
    }

}
