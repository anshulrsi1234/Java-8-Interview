package test;

interface FunInterface {
	
	Object clone() throws CloneNotSupportedException;
	
	default void getEmployeeData(){
		
	}
	
	default void getEmployeeData1(){
		
	}
	
	static String isEmpty() {
		return null;
	}

}
