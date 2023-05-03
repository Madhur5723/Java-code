//this program will tell wheather 2 object data are same or different
public class Main {
	public static void main(String[] args) {
		Account obj1=new Account(101,"Madhur",10000);
		Account obj2=new Account(101,"Madhur",10000);
		System.out.println("Using equals method");
		if(obj1==obj2)
		{
			System.out.println("obj1 is same as obj2 by == operators");
		}
		else
		{
			System.out.println("obj1 is not same as obj2 by == operators");
		}
		System.out.println("=================================================");
		System.out.println("Using equals method");
		if(obj1.equals(obj2))
		{
			System.out.println("obj1 is same as obj2 by equal operator");
		}
		else
		{
			System.out.println("obj1 is  not same as obj2 by equal operator");

		}
	}

}
