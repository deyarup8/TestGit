
public class Example1 {
	
	static int x = m1();
	 
	static {
		//System.out.println(x);
		System.out.println("static block");
	}
	
	
	public static int m1() {
		
		System.out.println("hello");
		return 1;
	}
	
	public static void main(String args[])
	{
		System.out.println("hello main with x value : "+x);
	}

}
