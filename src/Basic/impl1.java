package Basic;

public class impl1 implements inter1
{
	public void m1() 
	{
		System.out.println("m1");
	}
	
	public void m2() 
	{
		System.out.println("m2");
	}
	
	public static void main(String[] args)
	{
		impl1 i1=new impl1();
		i1.m1();
		i1.m2();
		
	}
	

}
