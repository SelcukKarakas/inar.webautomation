import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WA_003_DRO_01_AC_01 extends Hooks {

	@Test
	void testDroppableElements() {
		pages.getHomePage().clickOnWebautomationLink();
		pages.getWebAutomationPage().clickOnDroppableLink();
		pages.getWebAutomationPage().clickOnAcceptLink();

		pages.getAcceptPage().dragAndDropNonDroppableElement();

		String expectedText1 = "accept: '#draggable'";
		String actualText1 = pages.getAcceptPage().getTextOnTargetElement();

		assertEquals(expectedText1, actualText1);

		pages.getAcceptPage().dragAndDropDroppableElement();

		String expectedText2 = "Dropped!";
		String actualText2 = pages.getAcceptPage().getTextOnTargetElement();

		assertEquals(expectedText2, actualText2);
	}

}
