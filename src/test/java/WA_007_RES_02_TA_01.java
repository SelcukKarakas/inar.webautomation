import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WA_007_RES_02_TA_01 extends Hooks {

	@Test
	void testTextAreaPage() {
		pages.getHomePage().clickOnWebautomationLink();
		pages.getWebAutomationPage().clickOnResizableLink();
		pages.getWebAutomationPage().clickOnTextAreaLink();

		int initWidthOfTextBox = pages.getTextAreaPage().widthOfTheTextBox();
		int initHeightOfTextBox = pages.getTextAreaPage().heigthOfTheTextBox();

		pages.getTextAreaPage().resizeTextBox(100, 100);

		int finalWidthOfTextBox = pages.getTextAreaPage().widthOfTheTextBox();
		int finalHeightOfTextBox = pages.getTextAreaPage().heigthOfTheTextBox();

		Assertions.assertNotEquals(initWidthOfTextBox, finalWidthOfTextBox);
		Assertions.assertNotEquals(initHeightOfTextBox, finalHeightOfTextBox);
	}

}
