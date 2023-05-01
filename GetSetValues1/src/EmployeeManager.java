import java.util.Scanner;

public class EmployeeManager {
	
	public Employee createEmployee()
	{
		Employee eobj=new Employee();
		Scanner sc=new Scanner(System.in);
		System.out.println("id");
		eobj.setId(sc.nextInt());
		System.out.println("name");
		eobj.setName(sc.next());
		System.out.println("sal");
		eobj.setSal(sc.nextDouble());
		return eobj;
	}
	public void displayEmployee(Employee eobj)
	{
		System.out.println("id:"+eobj.getId());
		System.out.println("name:"+eobj.getName());
		System.out.println("sal:"+eobj.getSal());
	}
}
