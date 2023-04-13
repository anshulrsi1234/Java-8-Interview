package test;

import java.util.HashSet;
import java.util.Set;

public class TestEnum  {
	
	public static void main(String[] args) {
		
		Set<Student> set = new HashSet<>();
		
		Student S1 = new Student(10,"Anshul");
		Student S2 = new Student(10,"Anshul");
		Student S3 = new Student(11,"Singhal");
		
		set.add(S1);
		set.add(S2);
		set.add(S3);
		
		System.out.println(set.toString());
	}

}
