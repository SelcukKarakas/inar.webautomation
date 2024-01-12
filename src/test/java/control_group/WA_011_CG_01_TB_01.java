package control_group;

import base_test.Hooks;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WA_011_CG_01_TB_01 extends Hooks {

	@Test
	void testToolbarPage() {
		pages.getHomePage().clickOnWebautomationLink();
		pages.getWebAutomationPage().clickOnControlGroupPage();
		pages.getWebAutomationPage().clickOnToolbarPage();

		String initialStyle = pages.getToolbarPage().styleOfText();

		pages.getToolbarPage().selectAllInfo("125%", "Red", "Yellow");

		pages.getToolbarPage().clickOnBButton();
		pages.getToolbarPage().clickOnIButton();

		String finalStyle = pages.getToolbarPage().styleOfText();

		Assert.assertNotEquals(initialStyle, finalStyle);
	}

}
