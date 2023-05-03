
public class Rectangle implements Shape{
	private double l,b;

	public Rectangle(double l, double b) {
		super();
		this.l = l;
		this.b = b;
	}

	@Override
	public void findArea() {
		double ca=l*b;
		System.out.println("Area:"+ca);
	}

	@Override
	public void sides() {
		System.out.println("4 Sides");
	}
	
	

}
