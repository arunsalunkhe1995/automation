package StarPattern;

public class star5
{
	/*          *
			  * * 
			* * *  
		  * * * *	  
		* * * * *
	*/
	public static void main(String[] args)
	{
		int space=4;
		int star=1;
		
		for(int i=1; i<=5; i++)
		{
			for (int a=1; a<=space; a++ )
			{
				System.out.print("  ");
			}
			for(int b=1; b<=star; b++)
			{
				System.out.print("* ");
			}
			System.out.println();
			space=space-1;
			star=star+1;
			
		}
		
		
	}
	
}