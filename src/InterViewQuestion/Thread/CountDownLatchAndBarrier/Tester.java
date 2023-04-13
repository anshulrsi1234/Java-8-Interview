package InterViewQuestion.CountDownLatchAndBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Tester {
	
   public static void main(String args[]) throws InterruptedException {
	   
      ExecutorService executors = Executors.newFixedThreadPool(4);
      
      CyclicBarrier cyclicBarrier = new CyclicBarrier(4);
      
      executors.submit(new Service1(cyclicBarrier,"dev-1"));
      executors.submit(new Service1(cyclicBarrier,"dev-2"));
      executors.submit(new Service2(cyclicBarrier,"dev-3"));
      executors.submit(new Service2(cyclicBarrier,"dev-4"));
      executors.submit(new Service2(cyclicBarrier,"dev-5"));
      
      Thread.sleep(3000);
      
      System.out.println("Done");
   }
}

class Service1 implements Runnable {
	
   CyclicBarrier cyclicBarrier;
   
   public Service1(CyclicBarrier cyclicBarrier, String name) {
      super();
      this.cyclicBarrier = cyclicBarrier;
   }
   
   @Override
   public void run() {
	   
	   System.out.println("Current Thraed : " + Thread.currentThread().getName() + " |  Barrier : " + cyclicBarrier.getNumberWaiting());
      
      while (true) {
         try {
            cyclicBarrier.await();
         } catch (InterruptedException | BrokenBarrierException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
   }
   
}

class Service2 implements Runnable {
	
   CyclicBarrier cyclicBarrier;
   
   public Service2(CyclicBarrier cyclicBarrier,String name) {
      super();
      this.cyclicBarrier = cyclicBarrier;
   }
   
   @Override
   public void run() {
      System.out.println("Current Thraed : " + Thread.currentThread().getThreadGroup().getName() + " |  Barrier : " + cyclicBarrier.getNumberWaiting());
      while (true) {
         try {
            cyclicBarrier.await();
         } catch (InterruptedException | BrokenBarrierException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
   }
}