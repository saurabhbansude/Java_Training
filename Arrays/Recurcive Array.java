package basic;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class RecursiveArray 
{
	public static void main(String sarg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Size=");
		int[] arr=IntStream.range(0,sc.nextInt()).map(n->{System.out.println("Enter "+n+" th number=");
		return sc.nextInt();}).toArray();
		System.out.println("Array output : "+Arrays.toString(arr));
		
		
	}
 
}
