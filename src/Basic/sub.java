package Basic;

public class sub extends supper_class
{
	public static void main(String[] args)
	{
		System.out.println(1);
		sub s1=new sub();
		s1.m1();
		s1.m2();
		s1.m3();
		supper_class.m4();
	}

}
