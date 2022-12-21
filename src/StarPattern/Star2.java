package StarPattern;

public class Star2
{
	/* print   * * * *
	  		   * * * *
	 		   * * * * 
	  		   * * * *
	  		   * * * *    
	 */
	
	public static void main(String[] args) 
	{
		m();
	}
	public static void m()
	{
	
		for(int i=1; i<=5; i++)
		{
			for(int a=1; a<=4; a++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
}
}
