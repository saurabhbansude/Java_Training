package basic;

import java.util.Scanner;

public class Strong {
	public static void main(String arg[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number which u want to check is Strong or not = ");
		int num=sc.nextInt();
		int temp=num;
		int total=0;
		
		while(temp>0)
		{
			int rem=temp%10;
			
		
			 
			
		  total+=fact(rem);
			 
		
		  temp=temp/10;
		   
		}
		
		
		
			if (num==total) {
				System.out.println( num+ " Is a Strong Number ");
			
		}
		else
		{
			System.out.println(num+" Is Not Strong Number ");
		}
	}
	
	public static int fact(int f)
	{   int num=f;
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	

}
