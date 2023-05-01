import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
	
		Employee em=new Employee(1,"Madhur",10000);
		System.out.println("id"+em.getId());
		System.out.println("Name"+em.getName());
		System.out.println("sal"+em.getSal());
		
		//if we want to update the balance
				em.setSal(30000);
				System.out.println("new bal"+em.getSal());


	}

}
