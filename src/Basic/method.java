package Basic;

public class method 
{
	public static void main(String[] args)
	{
		M1();
		div(100, 10);
		method1.sum(5, 5);
		method same=new method();
		same.M2();
		same.mult(5, 2);
		
		method1.M3();
		
		method1 diff=new method1();
		diff.M4();
		diff.sub(20, 10);
		
	}
	
	// static method 
	public static void M1()
	{
		System.out.println("Static method");
	}
	
	// non static method 
	public void M2()
	{
		System.out.println("Non Static method from same class");
	}
	
	public void mult(int a, int b)
	{
		System.out.println(a*b);
	}
	public static void div (int a, int b ) 
	{
		System.out.println(a/b);
	}
}
