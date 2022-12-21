package Logical_program;

public class reverse_number2 
{
	public static void main(String[] args) 
	{
		int org=987654321;
		int rev=0;
		for(int i=org; i>0; i=i/10)
		{
			int rem=i%10;
			rev=rev*10+rem;
		}
		System.out.println(rev);
				
		
	}

}
