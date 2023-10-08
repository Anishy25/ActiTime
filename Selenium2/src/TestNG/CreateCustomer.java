package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ListenerImplementation.class)
public class CreateCustomer extends Baseclass {

	@Test
	public void create() {
		Assert.fail();
		Reporter.log("Customer created",true);
	}
	
}
