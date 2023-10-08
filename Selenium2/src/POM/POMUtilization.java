package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class POMUtilization {

	@Test
	public void stale() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		LoginPage lp = new LoginPage(driver);
		lp.getUntbx().sendKeys("admin");
		
//		driver.navigate().refresh();
//		lp.getUntbx().sendKeys("admin");
		
		lp.getPwtbx().sendKeys("manager");
		lp.getLgbtn().click();
		
		Thread.sleep(5000);
		driver.close();
		
	}
}

