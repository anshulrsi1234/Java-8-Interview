package InterViewQuestion.coreJava;


public class VersionCompare {
	
	public static void main(String[] args) {
		
	version ver = new version("1.01", "1.001");
	
	int result = ver.compare(ver, ver);
	
	System.out.println(result);
		
	}
	
	
}
