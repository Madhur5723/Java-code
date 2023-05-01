import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("empid");
		int id=sc.nextInt();
		System.out.println("empname");
		String name=sc.next();
		System.out.println("Empsal");
		double sal=sc.nextDouble();
		Employee em=new Employee(id,name,sal);
		System.out.println("id"+em.getId());
		System.out.println("Name"+em.getName());
		System.out.println("sal"+em.getSal());
		
		//if we want to update the balance
				em.setSal(30000);
				System.out.println("new bal"+em.getSal());


	}

}
