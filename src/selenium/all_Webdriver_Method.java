package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class all_Webdriver_Method
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Arun\\selenium file\\chromedriver_win32(1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("facebook.com");
		
		// wait 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		
		Dimension D1=driver.manage().window().getSize();
		System.out.println(D1);
		
		Point p1=driver.manage().window().getPosition();
		System.out.println(p1);
		

		
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		String T1=driver.getTitle();
		System.out.println(T1);
		
		driver.navigate().to("Flipkard");
		driver.navigate().to("Amozon");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		Point P2=new Point(200, 300);
		driver.manage().window().setPosition(P2);
		
		Dimension D2= new Dimension(300, 300);
		
		driver.manage().window().setSize(D2);
		
		driver.quit();
		
	
		
		
		
	}

}
