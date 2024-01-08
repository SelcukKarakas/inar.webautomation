import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import utils.BrowserUtils;

public class WA_008_AL_01_ALT_01 extends Hooks {

	@Test
	public void testAlertsTypePage() {
		pages.getHomePage().clickOnWebautomationLink();
		BrowserUtils.pageDown();
		BrowserUtils.wait(1);
		pages.getWebAutomationPage().clickOnAlertLink();

		BrowserUtils.pageUp();
		BrowserUtils.wait(1);
		pages.getAlertsTypePage().clickOnShowConfirmButton();

		pages.getAlertsTypePage().confirmTheAlert();
		String actualText = pages.getAlertsTypePage().getTextMessageOnAlert();

		pages.getAlertsTypePage().confirmTheAlert();

		Assertions.assertEquals("Confirmed!", actualText);

		pages.getAlertsTypePage().clickOnShowPromptButton();
		pages.getAlertsTypePage().sendTextToAlert("Emir Uyanık");
		pages.getAlertsTypePage().confirmTheAlert();

		actualText = pages.getAlertsTypePage().getTextMessageOnAlert();

		pages.getAlertsTypePage().confirmTheAlert();

		Assertions.assertEquals("Hello, Emir Uyanık!", actualText);
	}

}
