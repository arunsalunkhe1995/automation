package Basic;

public class else_if
{
	public static void main(String[] args) 
	{
		int marks=20;
		
		if (marks>=75)
		{
			System.out.println("first class with distinction");
		}
		else if (marks>=60)
		{
			System.out.println("1st class");
		}
		else if (marks>=35)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
