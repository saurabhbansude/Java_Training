package basic;
import java.util.Scanner;
public class neon {
	

	    public static boolean isNeon(int n) {
	        int square = n * n;
	        int sum = 0;

	        while (square > 0) {
	            int digit = square % 10;
	            sum = digit + sum;
	            square = square / 10;
	        }

	        if(sum==n)
	        	return true;
	        return false;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number: ");
	        int n = sc.nextInt();

	    
	        if (isNeon(n))
	            System.out.println(n + " is a Neon Number");
	        else
	            System.out.println(n + " is NOT a Neon Number");
	    }
	}


