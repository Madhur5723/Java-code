//Interface is fully abstract class 
/*public abstract class Shape {
	public abstract void findArea();
	public abstract void sayThanks();
	
}*/
//in abstract class contains abstract and non abstract methods 
//variables are normal variables we can extends only 1 abstract class
//in interface we can implement more than one interface
public interface Shape{
	//we can implements more than one interface
	//variables are final and static
	//by default all the method in interface are public and abstract
	int x=10;
	void findArea();
	void sides();
}
