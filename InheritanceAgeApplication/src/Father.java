
public class Father extends Grandfather
{
	private int fage;
	public Father(int fage) {
		super(fage+30);
		this.fage = fage;
	}
	public void ShowAge()
	{
		super.ShowAge();
		System.out.println("Father Age is:"+fage);
	}

}
