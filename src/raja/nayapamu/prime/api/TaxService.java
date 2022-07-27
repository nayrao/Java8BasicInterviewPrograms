package raja.nayapamu.prime.api;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {

	public static List<Employee> evaluateTaxusers(String input){
		
		if(input.equalsIgnoreCase("tax")) {
		return Database.getEmployees().stream().filter(emp->emp.getSalary() >50000).collect(Collectors.toList());
		}
		return Database.getEmployees().stream().filter(emp->emp.getSalary() < 50000).collect(Collectors.toList());
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(evaluateTaxusers("taxs"));
	}
}
