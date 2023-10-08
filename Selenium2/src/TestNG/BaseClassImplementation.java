package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class BaseClassImplementation extends Baseclass{
	
	@Test
	public void createcustomer() {
		Reporter.log("customer created",true);
	}
	

}
