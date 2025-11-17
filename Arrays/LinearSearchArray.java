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
		
		System.out.println("\Eenter the findabel number");
		int f=sc.nextInt();
		
		if(isfind(arr,f)==true)
		{
			System.out.println("found");
		}
		else
			System.out.println("not Found");
		
	}
	
	public static boolean isfind(int[]arr,int find) {
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==find)
				return true;
			
		}
		return false;
	}

}
