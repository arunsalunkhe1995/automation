package StarPattern;

public class star11
{/* print following pattern
		* * * * * 
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
		int space=0;
		for(int i=1; i<=9; i++)
		{
			for (int a=1; a<=space; a++)
			{
				System.out.print("  ");
			}
			for (int b=1; b<=star; b++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
			if(i<=4)
			{
				space++;
				star--;
			}
			else
			{
				space--;
				star++;
			}
			
		}
		
	}
}
