public class Account {
	private int accno;
	private String name;
	private double bal;
	
	public Account(int accno, String name, double bal) {
		super();
		this.accno = accno;
		this.name = name;
		this.bal = bal;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	
}
