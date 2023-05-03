//One interface can extends another interface
//one class extends another class
public class BMW implements Automobile {

	@Override
	public String Model() {
		return "BMW";
	}

	@Override
	public String Color() {
		return "Black";
	}

	@Override
	public double Price() {
		return 800000;
	}
	

}
