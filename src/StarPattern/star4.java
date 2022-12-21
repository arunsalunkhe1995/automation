package StarPattern;

public class star4 
{
	/* 
	      * * * * *
	      * * * *
	      * * *
	      * * 
	      * 
	 */
	public static void main(String[] args)
	{
		int star=5;
		for(int i=1; i<=5; i++)
		{
			for (int a=1; a<=star; a++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star=star-1;
			
		}
		
	}

}
