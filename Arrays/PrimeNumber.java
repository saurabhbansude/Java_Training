package Arrays;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
	  Scanner sc =new Scanner(System.in);
		System.out.println("enter Array Size : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter "+i+" index Number ");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("\nPrime Numbers of Array : ");	
		for(int i=0;i<arr.length;i++) {
		if (isPrime(arr[i])== true) {
			
			System.out.println(arr[i]);
			
		}
		
		}
	}
	
	public static boolean isPrime(int num) 
	{
		int cnt=0;
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				cnt++;
			}
		}
	
	
	if(cnt==2)
		return true;
	return false;
	}
}
