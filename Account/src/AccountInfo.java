import java.util.Scanner;

public class AccountInfo {
	Scanner sc=new Scanner(System.in);
	//Account accarr[]=new Account[20]; 
	public Account[] createAccount()
	{	
	int cnt=0;
	System.out.println("How many account do you want");
	int n=sc.nextInt();
	Account accarr[]=new Account[n];
	do
	{
		System.out.println("Enter Account no");
		System.out.println("Enter Customer Name");
		System.out.println("Enter Account Balance");
		accarr[cnt]=new Account(sc.nextInt(),sc.next(),sc.nextDouble());
		cnt++;
		//System.out.println("do you want to continue Press 1");
		
	}while(cnt<n);
	return accarr;
	
	
	}
	public void displayAccount(Account accarr[])
	{
		for(Account a:accarr)
		{
			System.out.println(a.getAccNo());
			System.out.println(a.getCustname());
			System.out.println(a.getAccbal());
		}
	}

}
