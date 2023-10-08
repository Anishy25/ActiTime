package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Actitime {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	@Test
	
	public void getActitime() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demo.actitime.com/login.do");
		WebElement element = driver.findElement(By.id("username"));
		element.sendKeys("admin");
		
		driver.navigate().refresh();
		element.sendKeys("admin");
		Thread.sleep(5000);
		
		driver.close();
	}

}
