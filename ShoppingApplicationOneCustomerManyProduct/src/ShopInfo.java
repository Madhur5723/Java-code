import java.util.Scanner;

public class ShopInfo {
	public Customer create()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Customer id");
		int custid=sc.nextInt();
		System.out.println("Customer name");
		String custname=sc.next();
		System.out.println("Customer mobileno");
		String mobno=sc.next();
		
		System.out.println("====================================================");
	
		System.out.println("City");
		String city=sc.next();
		System.out.println("State");
		String state=sc.next();
		System.out.println("Pincode");
		int pincode=sc.nextInt();
		
		System.out.println("==============================================");
		Product prodarr[]=new Product[3];
		for(int i=0;i<prodarr.length;i++)
		{
			System.out.println("Product id");
			int prodid=sc.nextInt();
			System.out.println("Product name");
			String prodname=sc.next();
			System.out.println("Product price");
			double prodprice=sc.nextInt();
			System.out.println("Product Qty");
			int prodqty=sc.nextInt();
			Product prod=new Product(prodid, prodname, prodprice, prodqty);
			prodarr[i]=prod;
			

			
		}
	Address addr=new Address(city, state, pincode);
	Customer cust=new Customer(custid, custname, mobno, prodarr, addr);
	return cust;
	}
	
	public static void display(Customer cust)
	{
		System.out.println("=====================================");
		System.out.println("Customer id:"+cust.getCustid());
		System.out.println("Customer name:"+cust.getCustname());
		System.out.println("Customer Mobileno:"+cust.getMobno());
		System.out.println("");
		System.out.println("==================Address Details=============");
		System.out.println("Customer city:"+cust.getAddr().getCity());
		System.out.println("Customer State:"+cust.getAddr().getState());
		System.out.println("Customer Pincode:"+cust.getAddr().getPincode());
		System.out.println("");
		System.out.println("===================Product Details======================");
		System.out.println("Product id:"+cust.getProd().getProdid());
		System.out.println("Product Name:"+cust.getProd().getProdname());
		System.out.println("Product Price:"+cust.getProd().getProdprice());
		System.out.println("Product Quantity:"+cust.getProd().getProdqty());
		

	}

}
