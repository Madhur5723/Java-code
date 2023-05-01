
public class Customer {
	private int custid;
	private String cname;
	private String mobno;
	private Account acc;
	private Address addr;
	public Customer(int custid, String cname, String mobno, Account acc, Address addr) {
		super();
		this.custid = custid;
		this.cname = cname;
		this.mobno = mobno;
		this.acc = acc;
		this.addr = addr;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	
	

}
