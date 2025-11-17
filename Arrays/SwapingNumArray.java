package basic;

import java.util.Arrays;
import java.util.Scanner;

public class SwapingNumArray {
 
	public static void main (String arg[])
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
		
		System.out.println("\nSwaped Array : "+Arrays.toString(isSwap(arr)));
   
	
 }
	
	public static int[] isSwap(int[]arr)
	{
		int temp =arr[0];
	    
		arr[0] = arr[arr.length-1];
	    
	    arr[arr.length-1]=temp;
	    
	    return arr;
	   
	}
}
