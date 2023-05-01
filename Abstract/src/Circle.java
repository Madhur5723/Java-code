
public class Circle extends Shape {
	private double r;
	private double area;
	public Circle(double r, double area) {
		super();
		this.r = r;
		this.area = area;
	}
	public void Area()
	{
		double ca=3.14*r*r;
		System.out.println(ca);
	}

}
