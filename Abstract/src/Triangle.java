
public class Triangle extends Shape {
	private double b,h;

	public Triangle(double b, double h) {
		super();
		this.b = b;
		this.h = h;
	}
	public void Area()
	{
		double ta=0.5*h*b;
		System.out.println(ta);
	}
	

}
