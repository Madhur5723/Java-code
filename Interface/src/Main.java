
public class Main {

	public static void main(String[] args) {
		Shape s=null;
		s=new Circle(3);
		s.findArea();
		s.sides();
		
		s=new Rectangle(2,2);
		s.findArea();
		s.sides();
		
		s=new Triangle(2,2);
		s.findArea();
		s.sides();

	}

}
