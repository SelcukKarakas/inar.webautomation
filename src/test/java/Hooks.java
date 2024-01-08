import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;
import utils.Pages;

import java.time.Duration;

public class Hooks {

	Pages pages = new Pages();

	WebDriver driver = Driver.getDriver();

	WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));

	@BeforeAll
	public static void setUpTestEnvironment() {
		Driver.getDriver();
	}

	@AfterAll
	public static void tearDownTestEnvironment() {
		Driver.quitDriver();
	}

}
