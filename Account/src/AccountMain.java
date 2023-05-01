import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		Account accarr[]=null;
		Scanner sc=new Scanner(System.in);
		AccountInfo ainfo=new AccountInfo();
		int ch=0;
		do
		 {
		System.out.println("1-Create Account\n2-Display Account\n3-Search Account\n4-Transaction\n5-Delete");
		System.out.println("==========================================================================");
		System.out.println("Enter your choice");
		 ch=sc.nextInt();
		 
		 switch(ch)
		 {
		 case 1:
			 ainfo.createAccount();
			 break;
			 
		 case 2:
		 if(accarr!=null)
		 {
		     ainfo.displayAccount(accarr);

		 }
		 else
		 {
			 System.out.println("Account does not exits");
		 }
		     break;
		 }
		 System.out.println("continue press 1");
		 }while(sc.nextInt()==1);
		 System.out.println("==================THANKYOU==============");
		 }
	}


