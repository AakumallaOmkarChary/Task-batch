import com.omkar.assignment.employees.Manager;
import com.omkar.assignment.employees.Developer;
import com.omkar.assignment.utilities.Employeeutilities;

public class AssignmentMain {
public static void main (String args [])
{
	// manager object 
	Manager manager = new Manager(" omkar", 101,60000," java Development team");
	// create developer object
	 Developer developer = new Developer(" rohith", 102, 70000,"java");
	 System.out.println("====MANAGER==");
	 Employeeutilities.displayManager(manager);
	 System.out.println();
	 // display developer details
	 System.out.println("==========DEVELOPER======");
	 Employeeutilities.displayDeveloper(developer);
	 System.out.println();
	 System.out.println("====AFTER SALARY INCREASES===");
	 Employeeutilities.increaseSalary(manager,5000);
	 Employeeutilities.increaseSalary(developer,3000);
			System.out.println("manager salary" + manager.getSalary());
			System.out.println("developer salary"+ developer.getSalary());
			
			
			
			
}
}
