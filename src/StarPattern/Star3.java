package StarPattern;

public class Star3
{
	/* print Following pattern
		*
		**
		***
		****
		*****
*/
	public static void main(String[] args) 
	{
		int star=1;
		// for loop for row
		for(int i=1; i<=5; i++)
		{
			// for loop for column
			for(int a=1; a<=star; a++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star=star+1;
			
		}
		
	}
	
	
	
	
	
	
}
