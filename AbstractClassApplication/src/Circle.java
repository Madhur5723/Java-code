
public class Circle extends Shape {
	private double r;

	public Circle(double r) {
		super();
		this.r = r;
	}
	@Override
	public double findArea() {
		return 3.14*r*r;
		
	}
	

}
