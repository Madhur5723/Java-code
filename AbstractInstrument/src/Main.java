
public class Main {
	public static void main(String[] args) 
	{
		Instrument i[]=new Instrument[3];
		i[0]=new Guitar();
		i[1]=new Piano();
		i[2]=new Flute();
		display(i);
		
	}
	
	public static void display(Instrument iarr[]) 
	{
	for(Instrument i:iarr)
	{
		if(i instanceof Guitar)
		{
			i.play();
		}
		if(i instanceof Piano)
		{
			i.play();
		}
		if(i instanceof Flute)
		{
			i.play();
		}
    }
}}