import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sf=0;
		Bike b=null;
		Automobile a=null;
		int C=0;
		System.out.println("1-Car\n2-Bike");
		System.out.println("Enter your choice");
		C=sc.nextInt();
		if(C==1)
		{
		
		int ch=0;
		do {
		System.out.println("1-Maruti\n2-Toyota\n3-BMW\n");
		System.out.println("Enter your choice");
		ch=sc.nextInt();
		if(ch==1) {
		a=new Maruti();
		System.out.println("==========MARUTI===============");
		display(a,b, "Maruti ");
		}
		else if(ch==2) {
		a=new Toyota();
		System.out.println("============TOYOTA==============");
		display(a,b, "Toyota ");
		}
		else if(ch==3) {
		a=new BMW();
		System.out.println("============BMW==============");
		display(a,b, "BMW ");
		}
		else
		{
			System.out.println("\nINVALID CHOICE");
		}
		System.out.println("do you want to continue PRESS 1");
		ch=sc.nextInt();
	}while(ch==1);
		System.out.println("Thankyou Visit Again");
	
	}

		else if(C==2)
		{
			do {
				System.out.println("1-Hero-Honda\n2-Bajaj");
				System.out.println("Enter your choice");
				int ch=sc.nextInt();
				if(ch==1)
				{
					a=new HeroHonda();
					display(a, b,"Hero-Honda");
				}
				
				System.out.println("do you want to continue press 1");
				C=sc.nextInt();
			}while(C==1);
			System.out.println("======THANKYOU============");
		}
		
		
	}
	
	
	public static void display(Automobile a,Bike b, String str)
	{
		System.out.println(str+ "Model:"+a.Model());
		System.out.println(str+ "Colour:"+a.Color());
		System.out.println(str+ "Price:"+a.Price());
		if(a instanceof Bike)
		{
			Bike b1=(Bike)a;
			System.out.println(str+ "CC"+b1.CC());
					
		}
		
		
	}

}
