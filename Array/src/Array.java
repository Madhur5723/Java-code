import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[];//array declaration
		
		System.out.println("enter elements in the array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
