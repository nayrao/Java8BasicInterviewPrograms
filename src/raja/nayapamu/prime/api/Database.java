package raja.nayapamu.prime.api;

import java.util.ArrayList;
import java.util.List;

public class Database {
	
	public static List<Employee> getEmployees(){
		
		List<Employee> listOfEmployee=new ArrayList<>();
		listOfEmployee.add(new Employee(100, "John", "IT",60000));
		listOfEmployee.add(new Employee(111, "Jacob", "CIVIL",90000));
		listOfEmployee.add(new Employee(375, "Raja", "Mechanical",50000));
		listOfEmployee.add(new Employee(420, "Peter", "Mandal",40000));
		listOfEmployee.add(new Employee(108, "Ash", "IT",160000));
		listOfEmployee.add(new Employee(100, "John", "IT",10000));
		
		return listOfEmployee;
		
	}

}
