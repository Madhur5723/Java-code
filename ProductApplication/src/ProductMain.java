import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ProductInfo pinfo=new ProductInfo();
		int ch=0;
		Product prodarr[]=null;
		
		
		do
		{
		System.out.println("1-Create\n2-Display\n3-Search\n4-Delete");
		System.out.println("Enter your choice");
		ch=sc.nextInt();
		if(ch==1)
		{
			prodarr=pinfo.create();
		}
		else if(ch==2)
		{
			pinfo.Display(prodarr);
		}
		else if(ch==3)
		{
			System.out.println("Enter product id to search ");
			int s=sc.nextInt();
			Product ptemp=pinfo.searchData(prodarr, s);
			System.out.println(ptemp.getId());
			System.out.println(ptemp.getProdname());
			System.out.println(ptemp.getProdprice());
		}
		else if(ch==4)
		{
			
		}
		
		System.out.println("Press 1 to continue");
		 ch=sc.nextInt();
	}while(ch==1);
		System.out.println("=============");
		
		
	}

}
