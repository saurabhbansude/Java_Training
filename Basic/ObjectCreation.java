package basic;

public class ObjectCreation 
{
	public static void m1()
	{
		System.out.println("static method");
	}
	
	public static void m2()
	{
		System.out.println("non static method");
	}
	
	public static void main(String arg[])
	{
		m1();
		
		ObjectCreation.m1() ;
		
		ObjectCreation o = new ObjectCreation ();
		
		o.m2();
		
	}
}
