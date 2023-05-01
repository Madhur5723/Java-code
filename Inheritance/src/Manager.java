
public class Manager extends Employee {
	private double bonus;

	public Manager(int empid, String empname, double empsal, double bonus) {
		super(empid, empname, empsal);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	

}
