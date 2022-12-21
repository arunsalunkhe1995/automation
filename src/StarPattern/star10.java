package StarPattern;

public class star10 
{
/*		* * * * *
	    * * * * 
		* * * 
		* * 
		* 
		* * 
		* * * 
		* * * * 
		* * * * * 
*/
	public static void main(String[] args)
	{
		int star=5;
		
		for(int r=1; r<=9; r++)
		{
			for(int i=1; i<=star; i++)
			{
				System.out.print("* ");
			}
			System.out.println();
			if(r<=4)
			{
				star--;
			}
			else
			{
				star++;
			}
			
		}
	
		
	}

}
