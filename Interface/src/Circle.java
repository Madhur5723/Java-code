
public class Circle implements Shape {
	public double r;

	public Circle(double r) {
		super();
		this.r = r;
	}

	@Override
	public void findArea() {
		double ca=3.14*r*r;
		System.out.println("Area :"+ca);
	}

	@Override
	public void sides() {
		System.out.println("0 Sides");
	}
	

}
