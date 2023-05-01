//this variables are called as the instance variables
public class Account {
	private int accno;
	private String acctype;
	private int accbal;
	public Account(int accno, String acctype, int accbal) {
		super();
		this.accno = accno;
		this.acctype = acctype;
		this.accbal = accbal;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getAcctype() {
		return acctype;
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}
	public int getAccbal() {
		return accbal;
	}
	public void setAccbal(int accbal) {
		this.accbal = accbal;
	}
	
	
	

}
