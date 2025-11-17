package basic;

import java.util.Scanner;

public class Perfect {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number= ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= n/2; i++)
        {
            if(n % i == 0)   
            {
                sum += i;
            }
        }

        

        if(sum == n)
            System.out.println(n + " is a Perfect Number");
        else
            System.out.println(n + " is NOT a Perfect Number");
    }
}
