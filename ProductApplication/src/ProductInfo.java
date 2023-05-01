import java.util.Scanner;

//This class is responsible for creating
//Array and Display array
public class ProductInfo {
	public Product[] create()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many products you want");
		int n=sc.nextInt();
		//array formation
		Product prodarr[]=new Product[n];
		for(int i=0;i<prodarr.length;i++)
		{
			System.out.println("enter pr	oduct "+(i+1)+" Details:");
			System.out.println("=====================================");
			System.out.println("Enter product id");
			int prodid=sc.nextInt();
			System.out.println("Enter product name");
			String prodname=sc.next();
			System.out.println("Enter product Price");
			double prodprice=sc.nextDouble();
			prodarr[i]=new Product(prodid, prodname, prodprice);
		}
		return prodarr;

	}
	public void Display(Product prodarr[])
	{
		System.out.println("============================");
		for(int i=0;i<prodarr.length;i++)
		{
			System.out.println(prodarr[i].getId());
			System.out.println(prodarr[i].getProdname());
			System.out.println(prodarr[i].getProdprice());
		}
	}
	public Product searchData(Product prodarr[], int s)
	{
		//for each loop
		boolean b=false;
		Product ptemp=null;
		for(Product p:prodarr)
		{
			if(p.getId()==s)
			{
				ptemp=p;
				b=true;
				break;
			}
		}
		if(ptemp!=null)
		{
			System.out.println("Record Found");
		}
		else
		{
			System.out.println("Record Not Found");
		}
		return ptemp;
	}
		public void deleteRecord(Product prodarr[], int id) {
			
			
		}
		
			
	}



