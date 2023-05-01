
public class BankMain {

	public static void main(String[] args) {
		AccountManager am=new AccountManager();
		Account acc=am.createAccount();
		am.display(acc);
		acc.setBal(10000);
		System.out.println("New Balance is:"+acc.getBal());
	}

}
