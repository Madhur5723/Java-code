
public class Son extends Father
{
	private int sage;
	public Son(int sage)
	{
		super(sage+30);
		this.sage=sage;
	}
	public void ShowAge()
	{
		super.ShowAge();
		System.out.println("Son age is:"+sage);
	}

}
