package exceptions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assert {

	public static WebDriver driver;
	
	@Test
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.get("https://www.salesforce.com/login");
	    driver.manage().window().maximize();
	   
	    driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	    String title=driver.getTitle();
	    Assert.assertTrue(title.contains("salesforce.com"));
	    
		}
	       
		

	
}
