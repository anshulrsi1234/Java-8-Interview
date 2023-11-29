package InterViewQuestion.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import util.Employee;

// Convert Employees List into Map where Map id will be Emp ID
public class ConvertListToMap {
	
	public static void main(String[] args) {
		
	  List<Employee> empList = Arrays.asList(
		  new Employee("1", "(Anshul-1)","11","1000"),
		  new Employee("2", "Anshul-2","12","1002"),
		  new Employee("3", "Anshul-3","13","1003"),
		  new Employee("4", "Anshul-4","14","1004")
	  );
	  
	  Map<String, Employee> empMap = empList.stream().collect(Collectors.toMap(map -> map.getId(), map -> map));
	  
	  empMap.forEach((key,value) -> {
		 System.out.println(key + " ---" + value.getName() + "---" + value.getSalary());
	  });
	  
	  
	  // Convert List of Employee to map where key will be ID ..
	  Map<String, List<Employee>> emp_Map = empList.stream().collect(Collectors.groupingBy(Employee::getId));
	  
	  emp_Map.forEach((key,value) -> {
		  System.out.println(key + " ---" + value);
		  
	  });
	  
	  System.out.println("Print element in MAP :::: " + emp_Map);
	    
	}
}

