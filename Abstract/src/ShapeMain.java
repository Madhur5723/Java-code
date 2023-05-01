
public class ShapeMain {
	
public static void main(String[] args) {
	
	Shape s[]=new Shape[3];
	s[0]=new Circle(2,2);
	s[1]=new Rectangle(2,2);
	s[2]=new Triangle(2,2);
	display(s);
   }
public static void display(Shape sarr[])
{
	for(Shape s:sarr)
	{
		if(s instanceof Circle)
		{
			System.out.println("Area of the Circle");
			s.Area();
		}
		else if(s instanceof Rectangle)
		{
			System.out.println("Area of the Rectangle");
			s.Area();
		}
		else if(s instanceof Triangle)
		{
			System.out.println("Area of the Triangle");
			s.Area();
		}
	}
}

}