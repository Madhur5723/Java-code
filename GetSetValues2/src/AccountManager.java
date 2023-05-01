
public class AccountManager {
	public Account createAccount() {
		
	Account acc=new Account(1,"Madhur", 20000);
	return acc;
	}
	public void display(Account acc)
	{
		System.out.println(acc.getAccno()+"\n"+acc.getName()+acc.getBal()+"\n");
		
	}
}
