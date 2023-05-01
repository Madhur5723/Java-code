import java.util.Scanner;

public class Employee {
	private int id;
	private String name;
	private double sal;
	Scanner sc=new Scanner(System.in);
	public void create()
	{
		System.out.println("empid");
		id=sc.nextInt();
		System.out.println("name");
		name=sc.next();
		System.out.println("sal");
		sal=sc.nextDouble();
	}

	public void display()
	{
		System.out.println("empid"+id);
		System.out.println("name"+name);
		System.out.println("sal"+sal);
	}
}
