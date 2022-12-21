package Logical_program;

public class prime_number
{
	public static void main(String[] args) 
	{
		int org=8;
		int count=0;
		
		for(int i=2; i<org; i++)
		{
			if(org%i==0)
			{
				count++;
				break;
			}
		}
		System.out.println(count);
		if (count==1)
		{
			System.out.println("given Number Is not a prime number");
		}
		else
		{
			System.out.println("given Number Is a prime number");
		}
		
		
	}

}
