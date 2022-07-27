package raja.nayapamu.prime.api;

public class Employee {
	
	private int id;
	private String name;
	private String departement;
	private long salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(int id, String name, String departement, long salary) {
		this.id = id;
		this.name = name;
		this.departement = departement;
		this.salary = salary;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", departement=" + departement + ", salary=" + salary + "]";
	}

	
	
}
