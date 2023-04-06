package InterViewQuestion;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleTonClass {
	
	ExecutorService executorService = Executors.newSingleThreadExecutor();
	
	Executor executor = Executors.newSingleThreadExecutor();
	
	private static SingleTonClass instance;
	
	
	public static synchronized SingleTonClass getInstance() {
		if(instance==null) {
			instance = new SingleTonClass();
		}
		return instance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return instance;
	}
	
	public Object readResolve(){
		return instance;
	}

}
