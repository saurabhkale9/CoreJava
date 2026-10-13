package collection;

import java.util.ArrayList;

public class ArrayListDemo3 {

	public static void main(String[] args) {

		
		
		ArrayList<Employee> employees= new ArrayList<Employee>();
//		emp.add(new Employee()).
	employees.add(new Employee(1, "Saurabh", "Nighoj", 20000, "CS", "Male"));
	employees.add(new Employee(1, "Sunny", "Daund", 21000, "CS", "Male"));
	employees.add(new Employee(1, "Gauri", "Pimpri", 40000, "BSC", "Female"));
	employees.add(new Employee(1, "Shubham", "nagar", 22000, "BCA", "Male"));

//	for(Employee emp:employees) {
//		if(emp.getAddress().equals("Nighoj"))
//		System.out.println(emp);
//	}
	
//	for(Employee emp: employees) {
//		if(emp.getDep().equals("CS")) System.out.println(emp);
//	}
	
//	for(Employee emp:employees) {
//		if(emp.getSalary()>20000) System.out.println(emp);
//	}
	
//	for(Employee emp:employees) {
//		if(emp.getGender().equals("Female")) {
//			double existingSalary=emp.getSalary();
//			
//			emp.setSalary(existingSalary+5000);
//			System.out.println(emp);
//		}
//			
//	}
	
	for(Employee emp:employees) {
		if(emp.getName().equals("Saurabh"))
		{
			emp.setName("SaurabhKale");
		}
		System.out.println(emp);
	}
	
	
	
	}

}
