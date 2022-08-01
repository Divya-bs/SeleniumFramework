package exceptions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementNotInteractable {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.get("http://omayo.blogspot.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		}
	
	@Test
	public void test() {
		
		driver.findElement(By.className("gsc-input")).sendKeys("xyz");
		driver.quit();
		
		//driver.findElement(By.id("hbutton")).click();

		
	}
	

}
