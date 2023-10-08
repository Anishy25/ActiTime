package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Verification {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test
	public void verification() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.google.com/");
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Google";
	
//		if(ActualTitle.equals(ExpectedTitle)) {
//			System.out.println("Title is matching");
//		}
//		else {
//			System.out.println("Title is not matching");
//		}
		
		//Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		SoftAssert s = new SoftAssert();
		s.assertEquals(ActualTitle, ExpectedTitle);
		Thread.sleep(2000);
		driver.close();
		s.assertAll();
	}
	
}
