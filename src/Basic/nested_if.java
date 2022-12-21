package Basic;

public class nested_if 
{
	public static void main(String[] args) 
	{
		String userID="arun";
		int pass=123456;
		if ("arun"==userID)
		{
			System.out.println("correct User Name");
			
			if (123456==pass)
			{
				System.out.println("correct password");
				System.out.println("Login Succefully");
			}
			else
			{
				System.out.println("enter valid password");
			}
		}
		else 
		{
			System.out.println("enter valid user name");
		}
		
	}

}
