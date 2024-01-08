import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import utils.BrowserUtils;

public class WA_009_IF_01_NIF_01 extends Hooks {

	@Test
	public void testPlease() {
		pages.getHomePage().clickOnWebautomationLink();
		BrowserUtils.pageDown();
		BrowserUtils.wait(1);
		pages.getWebAutomationPage().clickOnIframeLink();

		BrowserUtils.pageUp();
		BrowserUtils.wait(1);
		pages.getWebAutomationPage().clickOnNormalIframeLink();

		Assertions.assertEquals("Inar academy", pages.getNormalIframePage().getTitleOnFrame());
	}

}
