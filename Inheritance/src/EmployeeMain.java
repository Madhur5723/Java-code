
public class EmployeeMain {

	public static void main(String[] args) {
		Manager m=new Manager(1, "Madhur",10000,2000);
		System.out.println("==========MANAGER DATA============");
		display(m,"Manager");
		///////////////////////////////////////////////////////////////
		Developer d=new Developer(2,"Ayush",20000, 10);
		System.out.println("=============DEVELOPER DATA===========");
		display(d,"Developer");
		////////////////////////////////////////////////////////////////
		TestingDepartment td=new TestingDepartment(3,"Ganesh",20000, 1);
		System.out.println("=========TESTING DATA=========");
		display(td,"Tester");
		///////////////////////////////////////////////////////////////////
	
	}
	public static void display(Employee e,String str)
	{
		System.out.println(str+"id"+e.getEmpid());
		System.out.println(str+" Name"+e.getEmpname());
		System.out.println(str+" Sal"+e.getEmpsal());
		if(e instanceof Manager)
		{
			//downcasting
			Manager m=(Manager)e;
			System.out.println("Manager Bonus"+m.getBonus());
		}
		if(e instanceof Developer)
		{
			Developer d=(Developer)e;
			System.out.println("Developer hour"+d.getHour());
		}
		if(e instanceof TestingDepartment)
		{
			TestingDepartment td=(TestingDepartment)e;
			System.out.println("No of shifts"+td.getNooftestcases());
		}
		
		
	}

}
