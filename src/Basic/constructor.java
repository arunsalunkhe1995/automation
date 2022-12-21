package Basic;

public class constructor
{
	int num1;
	int num2;
	constructor(int a , int b)
	{
		num1=a;
		num2=b;
	}
	
	public void m1()
	{
		
		System.out.println(num1+num2);
		
	}
	public static void main(String[] args) 
	{
		constructor c1=new constructor(20 , 20);
		c1.m1();
		
	}

}
