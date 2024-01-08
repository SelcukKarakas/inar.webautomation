import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WA_005_SE_01_SER_01 extends Hooks {

	@Test
	public void testSerializePage() {
		pages.getHomePage().clickOnWebautomationLink();
		pages.getWebAutomationPage().clickOnSelectableLink();
		pages.getWebAutomationPage().clickOnSerializeLink();

		pages.getSerializePage().selectItemWithClick(2);

		assertTrue(pages.getSerializePage().isSelected(2));
		assertEquals("You've selected: #2.", pages.getSerializePage().getText());

		pages.getSerializePage().selectWithPressingControl(1, 3, 5);

		assertTrue(pages.getSerializePage().isSelected(1));
		assertTrue(pages.getSerializePage().isSelected(3));
		assertTrue(pages.getSerializePage().isSelected(5));

		assertEquals("You've selected: #1 #2 #3 #5.", pages.getSerializePage().getText());

		pages.getSerializePage().selectWithMouseAction(1, 3);

		assertTrue(pages.getSerializePage().isSelected(1));
		assertTrue(pages.getSerializePage().isSelected(2));
		assertTrue(pages.getSerializePage().isSelected(3));

		assertEquals("You've selected: #1 #2 #3.", pages.getSerializePage().getText());
	}

}
