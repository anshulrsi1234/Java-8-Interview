package InterViewQuestion.coreJava;

/**
 * 
 * @author anshul
 *
 */
public class SingleTon {
		
		private static SingleTon singleton;
		
		private SingleTon() {
			
			//This section prevent to create the object from Reflection API.
			if(singleton != null){
				throw new RuntimeException("Do not try to break the Singleton class");
			}
		}
		
		/**
		 * 
		 * @return
		 */
		public static synchronized SingleTon getInstance() {
			
			if(singleton ==null) {
				singleton = new SingleTon();
			}
			return singleton;
		}
		
		// Clone stop the object creation
		@Override
		protected Object clone() throws CloneNotSupportedException {
			return super.clone();
		}
		
		// To prevent from serialized and deserialized
		public Object readResolve() {
			return singleton;
		}

}
