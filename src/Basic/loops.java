package Basic;

public class loops 
{
	public static void main(String[] args)
	{
		// using for loop need to print number from 0 to 1000
		
		for(int i=0; i<=1000; i=i+1)
		{
			System.out.print(i+" ");
		}
	
		System.out.println();
		// using while loop need to print 1 to 100	
		int i=1;
		while(i<=100)
		{
			System.out.print(i+" ");
			i++;
		}
		
		System.out.println();
		
		// by using do while loop 
	
		int a=10;
		do
		{
			System.out.println(a);
			a=a+10;
		}
		while(a<=1000);
	}
}
