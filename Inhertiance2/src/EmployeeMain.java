
public class EmployeeMain {
	public static void main(String[] args) {
		Manager m=new Manager(1,"Madhur",10000,2000);
		System.out.println("=================MANAGER DATA==============");
		display(m, "Manager");
		System.out.println("============================================");
		Developer d=new Developer(2,"Mohit",30000,4);
		System.out.println("=================DEVELOPER DATA==============");
		display(d,"Developer");
		System.out.println("============================================");
		TestingDepartment td=new TestingDepartment(3,"Mukesh",40000,3);
		System.out.println("=================TESTER DATA==============");
		display(td,"Tester ");
		System.out.println("============================================");
		
		
	}
	public static void display(Employee e,String str)
	{
		System.out.println(e);
	}

}
