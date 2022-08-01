package exceptions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframExample {
	
	public static WebDriver driver;

	@BeforeMethod
	public void setup() {
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
    driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
    driver.manage().window().maximize();
   String title=driver.getTitle();
    driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
    Assert.assertTrue(title.contains(""));
    
	}
       
	@Test
	public void frames() {
		
	//1st frame
       driver.switchTo().frame("packageListFrame");
	   driver.findElement(By.xpath("//a[text()=\"org.openqa.selenium.bidi\"]")).click();
	   driver.switchTo().defaultContent(); //go back to main page
	
	   //2nd frame
	   driver.switchTo().frame("packageFrame");
	   driver.findElement(By.xpath("//a[text()=\"BiDi\"]")).click();
	   driver.switchTo().defaultContent();
	   
	}
}


