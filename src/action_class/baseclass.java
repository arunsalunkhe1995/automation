package action_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass 
{
	
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Arun\\selenium file\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();

		// wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	}

}
