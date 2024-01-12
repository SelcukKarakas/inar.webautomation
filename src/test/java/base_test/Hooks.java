package base_test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import utils.Driver;
import utils.Pages;

public class Hooks {

	protected static Pages pages;

	@Parameters("browser")
	@BeforeMethod
	public void setUpTestEnvironment(String browserType) {
		pages = new Pages();
		Driver.getDriver(browserType);
	}

	@AfterMethod
	public void tearDownTestEnvironment() {
		Driver.quitDriver();
	}

}
