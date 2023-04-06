package InterViewQuestion.StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import util.Employee;


/**
 * This class is used to return 2nd highest salary of Employee.
 * 
 * @author Anshul
 *
 */
public class SecondHighSalary {
	
	public static void main(String[] args) {
		
		 List<Employee> empList = Arrays.asList(
				  new Employee("1", "Anshul1","11","1000"),
				  new Employee("2", "Anshul2","12","1002"),
				  new Employee("3", "Anshul3","13","1003"),
				  new Employee("4", "Anshul4","14","1004"),
				  new Employee("5", "Anshul5","15","1005"),
				  new Employee("6", "Anshul6","16","1006"),
				  new Employee("7", "Anshul7","17","1007"),
				  new Employee("8", "Anshul8","18","1008")
			  );
		 
		List<Employee> result = empList.stream().sorted((o1, o2) -> o2.getSalary().compareTo(o1.getSalary())).limit(2).skip(1).collect(Collectors.toList());
		
		result.forEach(data -> {
			System.out.println(" >>>> Name >>>> " + data.getName() + " >>>>  Salary >>>>>  " + data.getSalary());
		});
		
		
		List<Employee> result1 = empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(2).skip(1).collect(Collectors.toList());
		
		result1.forEach(data -> {
			System.out.println(" >>>> Name2 >>>> " + data.getName() + " >>>>  Salary2 >>>>>  " + data.getSalary());
		});
		
	}

}
