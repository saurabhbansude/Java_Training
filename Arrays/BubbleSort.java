package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		System.out.print("Enter Array Size =" );
		int n= t.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter "+i+" index Number ");
			arr[i]=t.nextInt();
		}
		
		System.out.println("Sorted Array : "+Arrays.toString(isSort(arr)));
		
	}
	
	public static int[] isSort(int arr[])
	{
		for (int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}

}
