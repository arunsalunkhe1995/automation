package Logical_program;

public class armstrong_Number 
{
	public static void main(String[] args) 
	{
		// Armstrong number means addition of cube of each number
		
		int org=163;
		int sum=0;
		
		for (int i=org; i>0; i=i/10)
		{
			int rem= i%10;
			sum = sum+(rem*rem*rem);
		}
		if(org==sum)
		{
			System.out.println("given number is armstrong Number");
		}
		else
		{
			System.out.println("given number is not armstrong Number");
		}
	}

}
