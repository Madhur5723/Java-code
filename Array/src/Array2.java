import java.util.Scanner;

//Take the array size from user and
// store the  values in that array by user
public class Array2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[];//array declaration
		System.out.println("how many items u want in array");
		int n=sc.nextInt();
		arr=new int[n];
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
