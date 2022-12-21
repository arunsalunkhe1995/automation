package StarPattern;

public class star6 
{
/*      * * * * * * 
		  * * * * * 
		    * * * * 
		      * * * 
		        * * 
		          * 
*/
	public static void main(String[] args) 
	{
		int star=6;
		int space=0;
		
		for(int i=1; i<=6; i++)
		{
			for(int a=1; a<=space; a++)
			{
				System.out.print("  ");
			}
			for(int b=1; b<=star; b++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star=star-1;
			space=space+1;
		}
		
	}

}
