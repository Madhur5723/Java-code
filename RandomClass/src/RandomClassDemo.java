import java.util.Random;
import java.util.stream.IntStream;

public class RandomClassDemo {
	public static void main(String[] args) {
		Random r=new Random();
		System.out.println(r.nextFloat());
		IntStream i=r.ints(1,4);
		System.out.println(r.nextInt());
		
		
	}

}
