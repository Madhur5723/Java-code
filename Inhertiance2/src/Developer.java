
public class Developer extends Employee {
	private double hour;

	public Developer(int empid, String empname, double empsal, double hour) {
		super(empid, empname, empsal);
		this.hour = hour;
	}

	public double getHour() {
		return hour;
	}

	public void setHour(double hour) {
		this.hour = hour;
	}

	@Override
	public String toString() {
		return "Developer id:"+getEmpid()+"\nDeveloper Name:"+getEmpname()+"\nDeveloper Sal:"+getEmpsal()+"\nDeveloper hour"+getHour();

	}
	
	

}
