
public class Triangle implements Shape {
	private double b,h;

	public Triangle(double b, double h) {
		super();
		this.b = b;
		this.h = h;
	}

	@Override
	public void findArea() {
		double ca=0.5*b*h;
		System.out.println("Area :"+ca);
	}

	@Override
	public void sides() {
		System.out.println("3 Sides");
	}
	

}
