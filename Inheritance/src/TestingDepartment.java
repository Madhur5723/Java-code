
public class TestingDepartment extends Employee {
	private int nooftestcases;

	public TestingDepartment(int empid, String empname, double empsal, int nooftestcases) {
		super(empid, empname, empsal);
		this.nooftestcases = nooftestcases;
	}

	public int getNooftestcases() {
		return nooftestcases;
	}

	public void setNooftestcases(int nooftestcases) {
		this.nooftestcases = nooftestcases;
	}
	
	
	
	
	
	

}
