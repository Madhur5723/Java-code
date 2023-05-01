
public class Account {
	private int accNo;
	private String custname;
	private double accbal;
	public Account(int accNo, String custname, double accbal) {
		super();
		this.accNo = accNo;
		this.custname = custname;
		this.accbal = accbal;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public double getAccbal() {
		return accbal;
	}
	public void setAccbal(double accbal) {
		this.accbal = accbal;
	}
	
	

}
