package InterViewQuestion.coreJava;

import java.util.Comparator;


public class version implements Comparator<version>{
	
	String version1;
	
	String version2;
	
	public version(String version1, String version2) {
		super();
		this.version1 = version1;
		this.version2 = version2;
	}
	
	public String getVersion1() {
		return version1;
	}

	public void setVersion1(String version1) {
		this.version1 = version1;
	}

	public String getVersion2() {
		return version2;
	}

	public void setVersion2(String version2) {
		this.version2 = version2;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public int compare(version o1, version o2) {
		// TODO Auto-generated method stub
		if(Long.parseLong(o1.getVersion1().replace(".","")) > Long.parseLong(o2.getVersion2().replace(".",""))) {
			return 1;
		}else if(Long.parseLong(o1.getVersion1().replace(".","")) < Long.parseLong(o2.getVersion2().replace(".",""))) {
			return -1;
		}
		return 0;
	}

}
