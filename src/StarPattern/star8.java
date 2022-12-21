package StarPattern;

public class star8 
{
/*  print following pattern

     * * * * * * * 
       * * * * *
         * * * 
           * 
*/

	public static void main(String[] args) 
	{
		int space=0;
		int star=7;
		
		for(int i=1; i<=4; i++)
		{
			for(int a=1; a<=space; a++)
			{
				System.out.print("  ");
			}
			for (int b=1; b<=star; b++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star=star-2;
			space=space+1;
		}
		
	}
}
