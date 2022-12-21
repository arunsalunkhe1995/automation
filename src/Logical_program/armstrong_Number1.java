package Logical_program;

public class armstrong_Number1 
{
	public static void main(String[] args)
	{
		int org=198;
		int sum=0;
		
		for (int i=org; i>0; i=i/10)
		{
			int rem=i%10;
			sum= sum+(rem*rem*rem);
		}
		System.out.println(sum);
		
		if(sum==org)
		{
			System.out.println("given number is armstrong number");
		}
		else
		{
			System.out.println("given number is not a armstrong number");
		}
		
	}

}
