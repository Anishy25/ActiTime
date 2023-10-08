package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void Databaseconnect() {
		Reporter.log("database connected",true);
	}
	
	@BeforeTest
	public void browerlaunch() {
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.actitime.com/login.do");
		Reporter.log("browser launched",true);
	}
	
	@BeforeMethod
	public void login() {
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Reporter.log("logged in successfully",true);
	}
	
//	@Test
//	public void createCustomer() {
//		Reporter.log("customer created",true);
//	}
	
	@AfterMethod
	public void logout() {
		driver.findElement(By.id("logoutLink")).click();
		Reporter.log("logged out successfully",true);
	}
	
	@AfterTest
	public void closebrowser() {
		driver.close();
		Reporter.log("browser closed",true);
	}
	
	@AfterSuite
	public void disconnectDatabase() {
		Reporter.log("database disconnected",true);
	}

}