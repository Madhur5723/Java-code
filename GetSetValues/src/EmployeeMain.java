import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee eobj=new Employee();
		Scanner sc=new Scanner(System.in);
		//setting values
		System.out.println("id");
		eobj.setId(sc.nextInt());
		System.out.println("name");
		eobj.setName(sc.next());
		System.out.println("sal");
		eobj.setSal(sc.nextDouble());
		
		//getting values 
		System.out.println("id:"+eobj.getId());
		System.out.println("name:"+eobj.getName());
		System.out.println("sal:"+eobj.getSal());

	}

}
