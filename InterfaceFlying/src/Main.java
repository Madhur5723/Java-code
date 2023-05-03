import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int o=0;
		Flying f=null;
		do
		{
		System.out.println("WELCOME TO FLYING SECTION");
		System.out.println("1-Helicopter\n2-Areoplane\n3-Jet");
		System.out.println("\nEnter your choice");
		int ch=sc.nextInt();
		if(ch==1)
		{
		System.out.println("==========HELICOPTER DETAILS=========");
		f=new Helicopter();
		display(f,"Helicopter ");
		}
		else if(ch==2) 
		{
		System.out.println("==========AREOPLANE DETAILS=========");
		f=new Areoplane();
		display(f,"Areoplane ");
		}
		else if(ch==3) {
		System.out.println("===========JET DETAILS=========");
		f=new Jet();
		display(f,"Jet ");
		}
		System.out.println("Continue Press 1");
		o=sc.nextInt();
		}while(o==1);
		System.out.println("THANKS VISIT AGAIN");
		
	}
	public static void display(Flying f,String str)
	{
		System.out.println(str+"Speed:"+f.speed());
		System.out.println(str+"CrewSize:"+f.crewsize());
		System.out.println(str+"Weight:"+f.Weight());

	}

}
