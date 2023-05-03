
public class HeroHonda implements Automobile,Bike{

	@Override
	public int CC() {
		return 97;
	}

	@Override
	public String Model() {
		return "Hero";
	}

	@Override
	public String Color() {
		return "Red";
	}

	@Override
	public double Price() {
		return 30000;
	}
	
}
