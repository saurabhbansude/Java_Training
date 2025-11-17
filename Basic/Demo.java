package Arrays;

public class Demo {
	
	String name;
	static int x=1;
	public Demo(String name)
	{
		
		this.name=name;
		
	}
	 @Override
	public String toString() {
		
		return name;
	}
	 
	 @Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return x++;
	}
	public static void main(String[] args) {
		
		Demo d1 = new Demo("tom");
		Demo d2 = new Demo("jerry");
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
	}

}
