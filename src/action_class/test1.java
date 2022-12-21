package action_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test1
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Arun\\selenium file\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	
		// wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// enter URL
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		// wait 
		Thread.sleep(20000);
		
		WebElement dropdownbox=driver.findElement(By.xpath("//a[text()='SwitchTo']"));
		
		// create object of action class
		Actions Act= new Actions(driver);
		
		// move to Switch to dropdown box
		Act.moveToElement(dropdownbox).perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Windows']")).click();
	
	}

}
