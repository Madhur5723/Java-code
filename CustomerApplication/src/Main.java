import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter custid");
		int custid=sc.nextInt();
		System.out.println("Enter cname");
		String cname=sc.next();
		System.out.println("Enter mob");
		int mob=sc.nextInt();
		System.out.println("===============================");
		System.out.println("Enter Accno");
		int accno=sc.nextInt();
		System.out.println("Enter AccountType");
		String acctype=sc.next();
		System.out.println("Enter Accbal");
		int accbal=sc.nextInt();
		System.out.println("=======================================");
		System.out.println("Enter city");
		String city=sc.next();
		System.out.println("Enter state");
		String state=sc.next();
		System.out.println("Enter pincode");
		int pincode=sc.nextInt();
		
		Address addr=new Address(city, state, pincode);
		Account acc=new Account(accno, state, accbal);
		Customer cust=new Customer(custid, cname, state, acc, addr);

		display(cust);
		
	}
		public static void display(Customer cust)
		{
			System.out.println(cust.getCustid());
			System.out.println(cust.getCname());
			System.err.println(cust.getMobno());
			System.out.println("=============================");
			System.out.println(cust.getAcc().getAccbal());
			System.out.println(cust.getAcc().getAccno());
			System.out.println(cust.getAcc().getAcctype());
			System.out.println("=================================");
			System.out.println(cust.getAddr().getCity());
			System.out.println(cust.getAddr().getPincode());
			System.out.println(cust.getAddr().getState());
		}
	}


