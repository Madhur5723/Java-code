import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeManager em=new EmployeeManager();
		Employee eobj=em.createEmployee();
		em.displayEmployee(eobj);

	}

}
