import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import java.util.Arrays;
import java.util.List;

public class WA_010_AUC_01_AF_01 extends Hooks {

	@Test
	public void testAccentFoldingPage() {
		pages.getHomePage().clickOnWebautomationLink();
		pages.getWebAutomationPage().clickOnAutoComplatePage();
		pages.getWebAutomationPage().clickOnAccentFoldingPage();

		pages.getAccentFoldingPage().sendTextToTextField("Jo");

		List<String> expectedList = Arrays.asList("Jörn Zaefferer", "John Resig");

		Assertions.assertEquals(expectedList, pages.getAccentFoldingPage().getTexts());

		pages.getAccentFoldingPage().cleanTextBox();

		BrowserUtils.wait(1);

		pages.getAccentFoldingPage().sendTextToTextField("Jö");

		BrowserUtils.wait(1);

		expectedList = List.of("Jörn Zaefferer");

		Assertions.assertEquals(expectedList, pages.getAccentFoldingPage().getTexts());
	}

}
