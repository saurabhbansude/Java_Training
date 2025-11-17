package basic;
import java.util.Scanner;

public class arrayRevers {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter Array Size=" );
		int n= sc.nextInt();
		int[] arr= new int[n];
		for(int j=0;j<n;j++)
		{
			System.out.print("enter Array num=" );
			arr[j]=sc.nextInt();
		}
		
		for(int j=0;j<n;j++)
		{
			System.out.print(arr[j]+" ");
			
		}
		System.out.println("\n");
		System.out.println("Revers array");

		for (int i= arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
		
}
