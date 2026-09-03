
public class Employee {
	
	int salary;
	String name;
	int empId;
	Employee(int salary ,String name,int empId){
		this.salary = salary;
		this. name = name;
		this.empId=empId;
	}
	void details()
	{
		System.out.println("Employee name "+ name );
		System.out.println("Employee salary "+ salary);
		System.out.println("Employuee id " + empId );
	}
	void fulldetails() {
		this.details();
	}
	

	public static void main(String[] args) {
	Employee obj = new Employee (2300,"omkar",101);	
	 obj.fulldetails();
	}

}
