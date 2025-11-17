package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCreation {
	public static void main(String[] args) {
		
		/* Array : an array is collection of homogeneous data types.
		 * note : homogeneous ---> same kind of data 
		 * Syntax : DataType[] RefVariable(array Name)= Cases
		 * 
		 * Array Declaration : 
		 * Case 1: --> Direct
		 *     DataType[] RefVariable(arrayName)={a1,a2,a3,a4...,an}
		 *    
		 * Case 2: --> Indirect(using New Key word)
		 *    DataType[] RefVariable(arrayName)=new Datatype[(ArraySize)]
		 *   
		 * Case 3:--> Stream
		 * 
		 *  Insert Element :
		 *  Case 1 : Using Range.map Method
		 *  Case 2 : Using for loop
		 *  
		 *  Print Element :
		 *  Case 1 : Arrays.toString(ArrayName)
		 *  Case 2 : Using for loop
		 *  Case 2 : Using forEach (Enhance)
		 */
		
		//Case 1 --> Direct 
		
		int[] arr = {1,2,3,4,5};// Declare Array
		
		System.out.println("For Loop");//case2
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\n-------------------------------------");
		
		System.out.println("For Each");//case 3
		
		for(int x:arr) {
			System.out.print(x+" ");
		}
		System.out.println("\n-------------------------------------");
		
		System.out.println("Arrays Class");//case 1
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("++++++++++++++++++++++++++++++++");
		//Case 2 -->Indirect
		System.out.println("For Loop");
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Size=");
		int n=sc.nextInt();
		int arr2[]=new int[n];
		
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print("Enter "+ i +"th number=");
			arr2[i]=sc.nextInt();
		}
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		
		System.out.println("\n-------------------------------------");
		System.out.println("Stream");
		
		System.out.println("Array using Arrays : " + Arrays.toString(arr2));
		
	}

}
