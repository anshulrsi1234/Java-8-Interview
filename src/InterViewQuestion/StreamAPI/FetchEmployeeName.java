package InterViewQuestion.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import util.Employee;

// Fetch Employee name from list of Employees

public class FetchEmployeeName {
	
	public static void main(String[] args) {
		
		List<Employee> empList = Arrays.asList(
				  new Employee("1", "Anshul-1","11","1000"),
				  new Employee("2", "Anshul-2","12","1002"),
				  new Employee("3", "Anshul-3","13","1003"),
				  new Employee("4", "Anshul-4","14","1004"),
				  new Employee("5", "Anshul-5","15","1005"),
				  new Employee("6", "Anshul-6","16","1006"),
				  new Employee("7", "Anshul-7","17","1007"),
				  new Employee("8", "Anshul-8","18","1008")
			  );
		
		List<String> emp  = empList.stream().map(Employee::getName).collect(Collectors.toList());
		
		System.out.println(emp);
		
	}

}
