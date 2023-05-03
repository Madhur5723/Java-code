
public class Triangle extends Shape {
	private double b,h;

	public Triangle(double b, double h) {
		super();
		this.b = b;
		this.h = h;
	}

	@Override
	public double findArea() {
		return 0.5*b*h;
	}


}
