package exceptions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoSuchWindow {
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
	public void window() throws InterruptedException {
		
		Set<String> firstWindow = driver.getWindowHandles();
        
        driver.findElement(By.linkText("Open a popup window")).click();
       
       Thread.sleep(3000);
       
       Set<String> windows = driver.getWindowHandles();
       
       Iterator<String> itr = windows.iterator();
       
        while(itr.hasNext()) {
              
              String window = itr.next();
              
               driver.switchTo().window(window);
              
               if(driver.getTitle().equals("Basic Web Page Title")) {
                     driver.close();
              }
              
       }
       
       
       Thread.sleep(3000);
       
        driver.switchTo().window(firstWindow);
       
        driver.findElement(By.name("q")).sendKeys("abcd");

}
}

