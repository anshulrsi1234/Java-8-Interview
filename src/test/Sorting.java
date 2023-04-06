package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Sorting {

	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		String s= "Anshul";
		
		char[] ch= s.toCharArray();
		
		for (char c : ch) {
			set.add(Character.toString(c));
		}
		
		Arrays.sort(ch);
		
		System.out.println(ch);
		
		// Case 2: Now Sorted the name in List
		List<EmployeeTest> list = Arrays.asList(
				new EmployeeTest("Anshul"),
				new EmployeeTest("Singhal"),
				new EmployeeTest("Pawan")
			);
		
		List<EmployeeTest> s1 = list.stream().sorted(Comparator.comparing(EmployeeTest::getName).reversed()).collect(Collectors.toList());
		
		Set<String> result = set.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toSet());
		
		System.out.println("result >>>" +result);
	}
	
	static class EmployeeTest {
		
		String name;

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		
		public EmployeeTest(String name) {
			super();
			this.name = name;
		}
		
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "EmployeeTest [name=" + name + "]";
		}
		
		
	}
	
}
