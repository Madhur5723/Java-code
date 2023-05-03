
public class Account {
	private int no;
	private String name;
	private double sal;
	public Account(int no, String name, double sal) {
		super();
		this.no = no;
		this.name = name;
		this.sal = sal;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public boolean equals(Object obj) {
		Account acc=(Account)obj;
		if(acc.getNo()==this.getNo()&&(this.getName()==acc.getName()))
		{
			return true;
		}
		return false;
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("call this method before garbage collection");
	}
	
	

}
