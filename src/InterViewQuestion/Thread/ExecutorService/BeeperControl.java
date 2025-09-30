package InterViewQuestion.Thread.ExecutorService;

import static java.util.concurrent.TimeUnit.SECONDS;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

public class BeeperControl {
	
	private final static ScheduledExecutorService scheduler =  Executors.newScheduledThreadPool(1);
	
	final static Runnable beeper = new Runnable() {
		
	      public void run() { 
	    	  System.out.println("beep"); 
	      }
	      
	};

	final static ScheduledFuture<?> beeperHandle = scheduler.scheduleAtFixedRate(beeper, 10, 10, SECONDS);
	
	public static void beepForAnHour() {
	    
	    scheduler.schedule(new Runnable() {
	    	
	      public void run() {
	    	  beeperHandle.cancel(true);
	       }
	      
	    }, 60 * 60, SECONDS);
	    
	}
	
	public static void main(String[] args) {
		
		// beepForAnHour();
		
		final ScheduledExecutorService scheduler =  Executors.newScheduledThreadPool(1);
		
		final Runnable beeper = () -> {
			try {
				Thread.sleep(100L);
				System.out.println("beep"); 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	 
		};

		final ScheduledFuture<?> beeperHandle = scheduler.scheduleAtFixedRate(beeper, 10, 10, SECONDS);
		  
	}
	
}