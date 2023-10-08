package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
	
	@BeforeSuite
	public void Databaseconnect() {
		Reporter.log("database connected",true);
	}
	
	@BeforeTest
	public void browerlaunch() {
		Reporter.log("browser launched",true);
	}
	
	@BeforeMethod
	public void login() {
		Reporter.log("logged in successfully",true);
	}
	
	@Test
	public void createCustomer() {
		Reporter.log("customer created",true);
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("logged out successfully",true);
	}
	
	@AfterTest
	public void closebrowser() {
		Reporter.log("browser closed",true);
	}
	
	@AfterSuite
	public void disconnectDatabase() {
		Reporter.log("database disconnected",true);
	}

}
